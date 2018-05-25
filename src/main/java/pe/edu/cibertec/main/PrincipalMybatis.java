package pe.edu.cibertec.main;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import pe.edu.cibertec.dominio.Categoria;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.dominio.busqueda.BusquedaProductoTop;
import pe.edu.cibertec.repositorio.CategoriaRepositorio;
import pe.edu.cibertec.repositorio.ProductoRepositorio;
import pe.edu.cibertec.repositorio.UsuarioRepositorio;

@ComponentScan("pe.edu.cibertec")
@PropertySource("classpath:database.properties")
public class PrincipalMybatis {

    public static SqlSessionFactory createSqlSessionFactory() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory
                    = new SqlSessionFactoryBuilder().build(inputStream);
            return sqlSessionFactory;
        } catch (IOException e) {
            System.out.println("Error al generar SQLSessionFactory");
            e.printStackTrace(System.out);
            System.exit(-1);
            return null;
        }
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PrincipalMybatis.class);
        SqlSessionFactory sqlSessionFactory = ctx.getBean(SqlSessionFactory.class);

        // FORMA Default
        // SqlSessionFactory sqlSessionFactory = createSqlSessionFactory
        // try (SqlSession sqlSession = sqlSessionFactory.openSession()) {}
        // FORMA 1
        // SqlSessionFactory sqlSessionFactory = ctx.getBean(SqlSessionFactory.class);
        // try (SqlSession sqlSession = sqlSessionFactory.openSession()) {}
        UsuarioRepositorio usuarioRepositorio = ctx.getBean(UsuarioRepositorio.class);
        ProductoRepositorio productoRepositorio = ctx.getBean(ProductoRepositorio.class);
        CategoriaRepositorio categoriaRepositorio = ctx.getBean(CategoriaRepositorio.class);

//            Usuario nuevoUsuario = new Usuario();
//            nuevoUsuario.setNombre("María");
//            nuevoUsuario.setApellido("Meza");
//            nuevoUsuario.setFechaNacimiento(new Date());
//            sqlSession.insert(
//                    "pe.edu.cibertec.repositorio.mapper.UsuarioMapper.insertUsuario",
//                    nuevoUsuario);
//            System.out.println("Id del nuevo usuario: " + nuevoUsuario.getId());
//            Usuario usuario = sqlSession.selectOne(
//                    "pe.edu.cibertec.repositorio.mapper.UsuarioMapper.selectUsuario", 1L);
//            usuario.setFechaNacimiento(new Date());
//            usuario.setNombre(usuario.getNombre() + " Amigable");
//            sqlSession.update(
//                    "pe.edu.cibertec.repositorio.mapper.UsuarioMapper.updateUsuario",
//                    usuario);
//            System.out.println(usuario.getNombre() + " " + usuario.getApellido());
        List<Usuario> usuarios = usuarioRepositorio.obtenerTodos();
        usuarios.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------");
        Producto producto = productoRepositorio.buscar(1L);
        System.out.println(producto.toString());

        BusquedaProductoTop busquedaProductoTop = new BusquedaProductoTop();
        busquedaProductoTop.setIdCategoria(1);
        List<Producto> productosTop = productoRepositorio.obtenerProductosTop(busquedaProductoTop);
        productosTop.forEach(System.out::println);
//
//            sqlSession.delete(
//                    "pe.edu.cibertec.repositorio.mapper.UsuarioMapper.deleteUsuario",
//                    lstUsuario.get(lstUsuario.size() - 1).getId());
//            Categoria categoria = new Categoria();
//            categoria.setId(1L);
//            Producto nuevo = new Producto();
//            nuevo.setNombre("Reloj de cuarzo 3");
//            nuevo.setDescripcion("Tampoco mires este reloj de cuarzo");
//            nuevo.setPrecio(new BigDecimal("907.00"));
//            nuevo.setImagen(obtenerArchivo(RUTA_IMAGEN));
//            nuevo.setCategoria(categoria);
//            int indice = productoRepositorio.crear(nuevo);
//            System.out.println("Filas modificadas: " + indice);
//            System.out.println("Queremos el índice! " + nuevo.getId());
        categoriaRepositorio.obtenerTodos().forEach(System.out::println);
    }

    private static final String RUTA_IMAGEN = "C:\\Luiggi\\reloj_cuarzo.jpg";
    private static final int CHUNK_SIZE = 1024 * 4;

    static byte[] obtenerArchivo(String ruta) {
        byte[] resultado = null;
        try (BufferedInputStream bis
                = new BufferedInputStream(
                        new FileInputStream(new File(ruta)))) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] chunk = new byte[CHUNK_SIZE];
            int leidos;
            while ((leidos = bis.read(chunk)) > 0) {
                baos.write(chunk, 0, leidos);
            }
            resultado = baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return resultado;
    }
}
