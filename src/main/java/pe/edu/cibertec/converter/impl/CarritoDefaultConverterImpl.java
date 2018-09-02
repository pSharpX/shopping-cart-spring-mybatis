package pe.edu.cibertec.converter.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.cibertec.converter.CarritoConverter;
import pe.edu.cibertec.converter.DetalleCarritoConverter;
import pe.edu.cibertec.converter.UsuarioConverter;
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
    @Autowired
    private UsuarioConverter usuarioConverter;

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
        carritoCompra.setId(object.getId());
        carritoCompra.setFechaCreacion(object.getFechaCreacion());
        carritoCompra.setFechaCompra(object.getFechaCompra());
        carritoCompra.setActivo(object.isActivo());
        carritoCompra.setDireccionEnvio(object.getDireccionEnvio());
        carritoCompra.setTotal(new BigDecimal(object.getTotal()));
        //carritoCompra.setUsuario(usuarioConverter.map(object.get));
//        carritoCompra.setDetalleCarritoList(detalleCarritoConverter.mapToDtoList(object.getDetalleCarrito()));
        return carritoCompra;
    }
}
