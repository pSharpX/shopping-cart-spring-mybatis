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
        CategoriaDto categoriaDto = new CategoriaDto();
        categoriaDto.setId(object.getId());
        categoriaDto.setNombre(object.getNombre());
        return categoriaDto;
    }

    @Override
    public Categoria map(CategoriaDto object) {
        Categoria categoria = new Categoria();
        categoria.setId(object.getId());
        categoria.setNombre(object.getNombre());
        return categoria;
    }
}
