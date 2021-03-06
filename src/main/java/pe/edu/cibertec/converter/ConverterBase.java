/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.converter;

import pe.edu.cibertec.dominio.base.EntidadBase;
import pe.edu.cibertec.dto.base.DtoBase;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Java-LM
 */
public interface ConverterBase<X extends EntidadBase, Y extends DtoBase>  {
    Y map(X object);
    X map(Y object);

    default List<X> mapToDtoList(List<Y> collections){
        return collections.stream().map(this::map).collect(Collectors.toList());
    }
    default List<Y> mapToListOf(List<X> collections){
        return collections.stream().map(this::map).collect(Collectors.toList());
    }
}
