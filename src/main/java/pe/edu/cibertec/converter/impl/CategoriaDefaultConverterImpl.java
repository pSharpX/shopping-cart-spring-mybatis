package pe.edu.cibertec.converter.impl;

import pe.edu.cibertec.converter.CategoriaConverter;
import pe.edu.cibertec.dominio.Categoria;
import pe.edu.cibertec.dto.CategoriaDto;
import pe.edu.cibertec.util.Converter;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
@Converter
public class CategoriaDefaultConverterImpl implements CategoriaConverter {
    @Override
    public CategoriaDto map(Categoria object) {
        return null;
    }

    @Override
    public Categoria map(CategoriaDto object) {
        return null;
    }
}
