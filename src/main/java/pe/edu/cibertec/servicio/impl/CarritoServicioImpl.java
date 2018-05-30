package pe.edu.cibertec.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.converter.CarritoConverter;
import pe.edu.cibertec.dto.CarritoDto;
import pe.edu.cibertec.repositorio.CarritoRepositorio;
import pe.edu.cibertec.servicio.CarritoServicio;

import java.util.List;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Service
@Transactional
public class CarritoServicioImpl implements CarritoServicio {

    @Autowired
    private CarritoRepositorio carritoRepositorio;
    @Autowired
    private CarritoConverter carritoConverter;

    @Override
    public CarritoDto buscar(Long id) {
        return carritoConverter.map(carritoRepositorio.buscar(id));
    }

    @Override
    public List<CarritoDto> obtenerTodos() {
        return carritoConverter.mapToListOf(carritoRepositorio.obtenerTodos());
    }

    @Override
    public void crear(CarritoDto object) {
        carritoRepositorio.crear(carritoConverter.map(object));
    }

    @Override
    public void actualizar(CarritoDto object) {
        carritoRepositorio.actualizar(carritoConverter.map(object));
    }

    @Override
    public void eliminar(CarritoDto object) {
        carritoRepositorio.eliminar(carritoConverter.map(object));
    }
}
