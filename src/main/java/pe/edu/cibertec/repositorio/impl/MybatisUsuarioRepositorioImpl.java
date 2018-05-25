package pe.edu.cibertec.repositorio.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.repositorio.UsuarioRepositorio;
import pe.edu.cibertec.repositorio.mapper.UsuarioMapper;

@Repository
public class MybatisUsuarioRepositorioImpl implements UsuarioRepositorio {

    private UsuarioMapper usuarioMapper;
    
    @Autowired
    public MybatisUsuarioRepositorioImpl(SqlSession session) {
        usuarioMapper = session.getMapper(UsuarioMapper.class);
    }

    @Override
    public Usuario buscar(Long id) {
        return usuarioMapper.selectUsuario(id);
    }

    @Override
    public void crear(Usuario usuario) {
        usuarioMapper.insertUsuario(usuario);
    }

    @Override
    public void actualizar(Usuario usuario) {
        usuarioMapper.updateUsuario(usuario);
    }

    @Override
    public void eliminar(Usuario usuario) {
        usuarioMapper.deleteUsuario(usuario.getId());
    }

    @Override
    public Usuario buscar(String nombre) {
        return usuarioMapper.selectUsuarioByName(nombre);
    }

    @Override
    public List<Usuario> obtenerTodos() {
        return usuarioMapper.selectAllUsuario();
    }
}
