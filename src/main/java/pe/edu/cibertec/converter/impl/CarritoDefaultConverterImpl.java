package pe.edu.cibertec.converter.impl;

import pe.edu.cibertec.converter.CarritoConverter;
import pe.edu.cibertec.dominio.Carrito;
import pe.edu.cibertec.dto.CarritoDto;
import pe.edu.cibertec.util.Converter;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Converter
public class CarritoDefaultConverterImpl implements CarritoConverter {
    @Override
    public CarritoDto map(Carrito object) {
        return null;
    }

    @Override
    public Carrito map(CarritoDto object) {
        return null;
    }
}
