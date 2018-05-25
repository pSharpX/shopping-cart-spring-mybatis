package pe.edu.cibertec.converter.impl;

import pe.edu.cibertec.converter.DetalleCarritoConverter;
import pe.edu.cibertec.dominio.DetalleCarrito;
import pe.edu.cibertec.dto.DetalleCarritoDto;
import pe.edu.cibertec.util.Converter;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Converter
public class DetalleCarritoDefaultConverterImpl implements DetalleCarritoConverter {
    @Override
    public DetalleCarritoDto map(DetalleCarrito object) {
        return null;
    }

    @Override
    public DetalleCarrito map(DetalleCarritoDto object) {
        return null;
    }
}
