package pe.edu.cibertec.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.converter.CarritoConverter;
import pe.edu.cibertec.dto.CarritoDto;
import pe.edu.cibertec.repositorio.CarritoRepositorio;
import pe.edu.cibertec.servicio.CarritoServicio;

import java.util.List;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Service
public class CarritoServicioImpl implements CarritoServicio {

    @Autowired
    private CarritoRepositorio carritoRepositorio;
    @Autowired
    private CarritoConverter carritoConverter;

    @Override
    public CarritoDto buscar(Long id) {
        return null;
    }

    @Override
    public List<CarritoDto> obtenerTodos() {
        return null;
    }

    @Override
    public void crear(CarritoDto object) {

    }

    @Override
    public void actualizar(CarritoDto object) {

    }

    @Override
    public void eliminar(CarritoDto object) {

    }
}
