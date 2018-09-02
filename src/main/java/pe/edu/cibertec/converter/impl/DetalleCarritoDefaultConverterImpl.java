package pe.edu.cibertec.converter.impl;

import pe.edu.cibertec.converter.DetalleCarritoConverter;
import pe.edu.cibertec.dominio.Carrito;
import pe.edu.cibertec.dominio.DetalleCarrito;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.dto.DetalleCarritoDto;
import pe.edu.cibertec.util.Converter;

import java.math.BigDecimal;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Converter
public class DetalleCarritoDefaultConverterImpl implements DetalleCarritoConverter {
    @Override
    public DetalleCarritoDto map(DetalleCarrito object) {
        DetalleCarritoDto detalleCarritoDto = new DetalleCarritoDto();
        detalleCarritoDto.setId(object.getId());
        detalleCarritoDto.setProductoId(object.getProducto().getId());
        detalleCarritoDto.setProducto(object.getProducto().getNombre());
        detalleCarritoDto.setCategoria(object.getProducto().getCategoria().getNombre());
        detalleCarritoDto.setCantidad(object.getCantidad());
        detalleCarritoDto.setPrecioUnitario(object.getPrecioUnitario().doubleValue());
        return detalleCarritoDto;
    }

    @Override
    public DetalleCarrito map(DetalleCarritoDto object) {
        DetalleCarrito detalleCarrito = new DetalleCarrito();
        detalleCarrito.setId(object.getId());
        Producto producto = new Producto();
        producto.setId(object.getProductoId());
        detalleCarrito.setProducto(producto);
        detalleCarrito.setCantidad(object.getCantidad());
        detalleCarrito.setPrecioUnitario(new BigDecimal(object.getPrecioUnitario()));
        return detalleCarrito;
    }
}
