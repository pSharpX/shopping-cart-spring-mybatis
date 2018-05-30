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
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setId(object.getId());
        usuarioDto.setNombre(object.getNombre());
        usuarioDto.setApellido(object.getApellido());
        //usuarioDto.setFechaNacimiento(object.getFechaNacimiento());
        //usuarioDto.setEdad(object.getEdad());
        return usuarioDto;
    }

    @Override
    public Usuario map(UsuarioDto object) {
        Usuario usuario = new Usuario();
        usuario.setId(object.getId());
        usuario.setNombre(object.getNombre());
        usuario.setApellido(object.getApellido());
        usuario.setFechaNacimiento(object.getFechaNacimiento());
        return usuario;
    }
}
