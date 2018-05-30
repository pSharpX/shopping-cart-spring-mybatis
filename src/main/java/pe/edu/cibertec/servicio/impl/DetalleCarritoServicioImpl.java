package pe.edu.cibertec.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.converter.DetalleCarritoConverter;
import pe.edu.cibertec.dto.DetalleCarritoDto;
import pe.edu.cibertec.repositorio.DetalleCarritoRepositorio;
import pe.edu.cibertec.servicio.DetalleCarritoServicio;

import java.util.List;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Service
@Transactional
public class DetalleCarritoServicioImpl implements DetalleCarritoServicio {

    @Autowired
    private DetalleCarritoRepositorio detalleCarritoRepositorio;
    @Autowired
    private DetalleCarritoConverter detalleCarritoConverter;

    @Override
    public DetalleCarritoDto buscar(Long id) {
        return detalleCarritoConverter.map(detalleCarritoRepositorio.buscar(id));
    }

    @Override
    public List<DetalleCarritoDto> obtenerTodos() {
        return detalleCarritoConverter.mapToListOf(detalleCarritoRepositorio.obtenerTodos());
    }

    @Override
    public void crear(DetalleCarritoDto object) {
        detalleCarritoRepositorio.crear(detalleCarritoConverter.map(object));
    }

    @Override
    public void actualizar(DetalleCarritoDto object) {
        detalleCarritoRepositorio.actualizar(detalleCarritoConverter.map(object));
    }

    @Override
    public void eliminar(DetalleCarritoDto object) {
        detalleCarritoRepositorio.eliminar(detalleCarritoConverter.map(object));
    }
}
