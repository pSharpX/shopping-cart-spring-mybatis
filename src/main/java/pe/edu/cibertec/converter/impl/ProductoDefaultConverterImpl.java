package pe.edu.cibertec.converter.impl;

import pe.edu.cibertec.converter.ProductoConverter;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.dto.ProductoDto;
import pe.edu.cibertec.util.Converter;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Converter
public class ProductoDefaultConverterImpl implements ProductoConverter {
    @Override
    public ProductoDto map(Producto object) {
        return null;
    }

    @Override
    public Producto map(ProductoDto object) {
        return null;
    }
}
