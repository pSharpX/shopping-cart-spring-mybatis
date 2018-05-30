package pe.edu.cibertec.converter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.cibertec.converter.CarritoConverter;
import pe.edu.cibertec.converter.DetalleCarritoConverter;
import pe.edu.cibertec.dominio.Carrito;
import pe.edu.cibertec.dto.CarritoDto;
import pe.edu.cibertec.util.Converter;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Converter
public class CarritoDefaultConverterImpl implements CarritoConverter {

    @Autowired
    private DetalleCarritoConverter detalleCarritoConverter;

    @Override
    public CarritoDto map(Carrito object) {
        CarritoDto carritoDto = new CarritoDto();
        carritoDto.setId(object.getId());
        carritoDto.setFechaCreacion(object.getFechaCreacion());
        carritoDto.setFechaCompra(object.getFechaCompra());
        carritoDto.setActivo(object.isActivo());
        carritoDto.setDireccionEnvio(object.getDireccionEnvio());
        carritoDto.setTotal(object.getTotal().doubleValue());
        carritoDto.setUsuario(object.getUsuario().getNombre());
        carritoDto.setDetalleCarrito(detalleCarritoConverter.mapToListOf(object.getDetalleCarritoList()));
        return carritoDto;
    }

    @Override
    public Carrito map(CarritoDto object) {
        Carrito carritoCompra = new Carrito();
        return carritoCompra;
    }
}
