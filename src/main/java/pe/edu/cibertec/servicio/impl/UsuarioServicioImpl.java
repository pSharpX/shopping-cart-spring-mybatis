package pe.edu.cibertec.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.converter.UsuarioConverter;
import pe.edu.cibertec.dto.UsuarioDto;
import pe.edu.cibertec.repositorio.UsuarioRepositorio;
import pe.edu.cibertec.servicio.UsuarioServicio;

import java.util.List;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Service
@Transactional
public class UsuarioServicioImpl implements UsuarioServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    @Autowired
    private UsuarioConverter usuarioConverter;

    @Override
    public UsuarioDto buscar(Long id) {
        return usuarioConverter.map(usuarioRepositorio.buscar(id));
    }

    @Override
    public List<UsuarioDto> obtenerTodos() {
        return usuarioConverter.mapToListOf(usuarioRepositorio.obtenerTodos());
    }

    @Override
    public void crear(UsuarioDto object) {
        usuarioRepositorio.crear(usuarioConverter.map(object));
    }

    @Override
    public void actualizar(UsuarioDto object) {
        usuarioRepositorio.actualizar(usuarioConverter.map(object));
    }

    @Override
    public void eliminar(UsuarioDto object) {
        usuarioRepositorio.eliminar(usuarioConverter.map(object));
    }
}
