package pe.edu.cibertec.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.converter.DetalleCarritoConverter;
import pe.edu.cibertec.dto.DetalleCarritoDto;
import pe.edu.cibertec.repositorio.DetalleCarritoRepositorio;
import pe.edu.cibertec.servicio.DetalleCarritoServicio;

import java.util.List;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Service
public class DetalleCarritoServicioImpl implements DetalleCarritoServicio {

    @Autowired
    private DetalleCarritoRepositorio detalleCarritoRepositorio;
    @Autowired
    private DetalleCarritoConverter detalleCarritoConverter;

    @Override
    public DetalleCarritoDto buscar(Long id) {
        return null;
    }

    @Override
    public List<DetalleCarritoDto> obtenerTodos() {
        return null;
    }

    @Override
    public void crear(DetalleCarritoDto object) {

    }

    @Override
    public void actualizar(DetalleCarritoDto object) {

    }

    @Override
    public void eliminar(DetalleCarritoDto object) {

    }
}
