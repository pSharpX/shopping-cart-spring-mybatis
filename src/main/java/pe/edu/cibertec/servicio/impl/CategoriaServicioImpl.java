package pe.edu.cibertec.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.converter.CategoriaConverter;
import pe.edu.cibertec.dto.CategoriaDto;
import pe.edu.cibertec.repositorio.CategoriaRepositorio;
import pe.edu.cibertec.servicio.CategoriaServicio;

import java.util.List;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Service
public class CategoriaServicioImpl implements CategoriaServicio{

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    @Autowired
    private CategoriaConverter categoriaConverter;

    @Override
    public CategoriaDto buscar(Long id) {
        return null;
    }

    @Override
    public List<CategoriaDto> obtenerTodos() {
        return null;
    }

    @Override
    public void crear(CategoriaDto object) {

    }

    @Override
    public void actualizar(CategoriaDto object) {

    }

    @Override
    public void eliminar(CategoriaDto object) {

    }
}
