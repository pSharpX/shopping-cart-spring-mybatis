/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.converter.impl;

import pe.edu.cibertec.converter.UsuarioConverter;
import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.dto.UsuarioDto;
import pe.edu.cibertec.util.Converter;

/**
 *
 * @author Java-LM
 */
@Converter
public class UsuarioDefaultConverterImpl implements UsuarioConverter {
    @Override
    public UsuarioDto map(Usuario object) {
        return null;
    }

    @Override
    public Usuario map(UsuarioDto object) {
        return null;
    }
}
