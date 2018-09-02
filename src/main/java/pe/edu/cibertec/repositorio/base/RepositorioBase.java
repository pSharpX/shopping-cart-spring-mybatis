/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio.base;

import pe.edu.cibertec.dominio.base.EntidadBase;

import java.util.List;

/**
 *
 * @author Java-LM
 */
public interface RepositorioBase<T extends EntidadBase> {
    T buscar(Long id);
    List<T> obtenerTodos();
    T crear(T object);
    void actualizar(T object);
    void eliminar(T object);
    default void eliminar(Long id) {
        eliminar(buscar(id));
    }    
}
