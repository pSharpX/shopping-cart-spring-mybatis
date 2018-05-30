package pe.edu.cibertec.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.converter.CategoriaConverter;
import pe.edu.cibertec.dto.CategoriaDto;
import pe.edu.cibertec.repositorio.CategoriaRepositorio;
import pe.edu.cibertec.servicio.CategoriaServicio;

import java.util.List;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Service
@Transactional
public class CategoriaServicioImpl implements CategoriaServicio{

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    @Autowired
    private CategoriaConverter categoriaConverter;

    @Override
    public CategoriaDto buscar(Long id) {
        return categoriaConverter.map(categoriaRepositorio.buscar(id));
    }

    @Override
    public List<CategoriaDto> obtenerTodos() {
        return categoriaConverter.mapToListOf(categoriaRepositorio.obtenerTodos());
    }

    @Override
    public void crear(CategoriaDto object) {
        categoriaRepositorio.crear(categoriaConverter.map(object));
    }

    @Override
    public void actualizar(CategoriaDto object) {
        categoriaRepositorio.actualizar(categoriaConverter.map(object));
    }

    @Override
    public void eliminar(CategoriaDto object) {
        categoriaRepositorio.eliminar(categoriaConverter.map(object));
    }
}
