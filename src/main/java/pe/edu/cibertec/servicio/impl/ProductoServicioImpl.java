package pe.edu.cibertec.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.converter.ProductoConverter;
import pe.edu.cibertec.dto.ProductoDto;
import pe.edu.cibertec.repositorio.ProductoRepositorio;
import pe.edu.cibertec.servicio.ProductoServicio;

import java.util.List;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Service
@Transactional
public class ProductoServicioImpl implements ProductoServicio{

    @Autowired
    private ProductoRepositorio productoRepositorio;
    @Autowired
    private ProductoConverter productoConverter;

    @Override
    public ProductoDto buscar(Long id) {
        return productoConverter.map(productoRepositorio.buscar(id));
    }

    @Override
    public List<ProductoDto> obtenerTodos() {
        return productoConverter.mapToListOf(productoRepositorio.obtenerTodos());
    }

    @Override
    public void crear(ProductoDto object) {
        productoRepositorio.crear(productoConverter.map(object));
    }

    @Override
    public void actualizar(ProductoDto object) {
        productoRepositorio.actualizar(productoConverter.map(object));
    }

    @Override
    public void eliminar(ProductoDto object) {
        productoRepositorio.eliminar(productoConverter.map(object));
    }
}
