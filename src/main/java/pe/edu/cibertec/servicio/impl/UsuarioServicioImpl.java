package pe.edu.cibertec.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.converter.UsuarioConverter;
import pe.edu.cibertec.dto.UsuarioDto;
import pe.edu.cibertec.repositorio.UsuarioRepositorio;
import pe.edu.cibertec.servicio.UsuarioServicio;

import java.util.List;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Service
public class UsuarioServicioImpl implements UsuarioServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    @Autowired
    private UsuarioConverter usuarioConverter;

    @Override
    public UsuarioDto buscar(Long id) {
        return null;
    }

    @Override
    public List<UsuarioDto> obtenerTodos() {
        return null;
    }

    @Override
    public void crear(UsuarioDto object) {

    }

    @Override
    public void actualizar(UsuarioDto object) {

    }

    @Override
    public void eliminar(UsuarioDto object) {

    }
}
