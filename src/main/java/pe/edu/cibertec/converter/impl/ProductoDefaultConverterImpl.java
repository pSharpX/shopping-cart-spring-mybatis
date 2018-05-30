package pe.edu.cibertec.converter.impl;

import pe.edu.cibertec.converter.ProductoConverter;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.dto.ProductoDto;
import pe.edu.cibertec.util.Converter;

import java.math.BigDecimal;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Converter
public class ProductoDefaultConverterImpl implements ProductoConverter {
    @Override
    public ProductoDto map(Producto object) {
        ProductoDto productoDto = new ProductoDto();
        productoDto.setId(object.getId());
        productoDto.setNombre(object.getNombre());
        productoDto.setDescripcion(object.getDescripcion());
        productoDto.setPrecio(object.getPrecio().doubleValue());
        productoDto.setImagen(object.getImagen());
        productoDto.setCategoriaId(object.getCategoria().getId());
        productoDto.setCategoria(object.getCategoria().getNombre());
        return productoDto;
    }

    @Override
    public Producto map(ProductoDto object) {
        Producto producto = new Producto();
        producto.setId(object.getId());
        producto.setNombre(object.getNombre());
        producto.setDescripcion(object.getDescripcion());
        producto.setPrecio(new BigDecimal(object.getPrecio()));
        producto.setImagen(object.getImagen());
        //producto.setCategoria(productoDto.getCategoria().getNombre());
        return producto;
    }
}
