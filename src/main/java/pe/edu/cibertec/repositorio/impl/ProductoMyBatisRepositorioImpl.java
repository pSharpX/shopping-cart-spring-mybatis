package pe.edu.cibertec.repositorio.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.dominio.busqueda.BusquedaProductoTop;
import pe.edu.cibertec.repositorio.ProductoRepositorio;
import pe.edu.cibertec.repositorio.mapper.ProductoMapper;

@Repository
public class ProductoMyBatisRepositorioImpl
    implements ProductoRepositorio {

    private ProductoMapper productoMapper;

    @Autowired
    public ProductoMyBatisRepositorioImpl(SqlSession session) {
        productoMapper = session.getMapper(ProductoMapper.class);
    }

    @Override
    public Producto buscar(Long id) {
        return productoMapper.selectProducto(id);
    }

    @Override
    public List<Producto> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> obtenerPorCategoria(Long idCategoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int guardar(Producto producto) {
        return productoMapper.insertProducto(producto);
    }

    @Override
    public List<Producto> obtenerProductosTop(BusquedaProductoTop busquedaProductoTop) {
        if (busquedaProductoTop.getIdCategoria() != null &&
                busquedaProductoTop.getIdCategoria() <= 0) {
            busquedaProductoTop.setIdCategoria(null);
        }
        //return productoMapper.selectProductoTop(busquedaProductoTop);
        return productoMapper.procedureProductoTop(busquedaProductoTop);
    }

    @Override
    public Producto crear(Producto object) {
        productoMapper.insertProducto(object);
        return object;
    }

    @Override
    public void actualizar(Producto object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Producto object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
