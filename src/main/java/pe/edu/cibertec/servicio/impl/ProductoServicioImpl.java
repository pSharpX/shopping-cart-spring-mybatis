package pe.edu.cibertec.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.converter.ProductoConverter;
import pe.edu.cibertec.dto.ProductoDto;
import pe.edu.cibertec.repositorio.ProductoRepositorio;
import pe.edu.cibertec.servicio.ProductoServicio;

import java.util.List;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Service
public class ProductoServicioImpl implements ProductoServicio{

    @Autowired
    private ProductoRepositorio productoRepositorio;
    @Autowired
    private ProductoConverter productoConverter;

    @Override
    public ProductoDto buscar(Long id) {
        return null;
    }

    @Override
    public List<ProductoDto> obtenerTodos() {
        return null;
    }

    @Override
    public void crear(ProductoDto object) {

    }

    @Override
    public void actualizar(ProductoDto object) {

    }

    @Override
    public void eliminar(ProductoDto object) {

    }
}
