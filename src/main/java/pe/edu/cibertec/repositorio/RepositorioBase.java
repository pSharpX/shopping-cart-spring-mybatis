/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio;

import java.util.List;

/**
 *
 * @author Java-LM
 */
public interface RepositorioBase<T> {
    T buscar(Long id);
    List<T> obtenerTodos();
    void crear(T object);
    void actualizar(T object);
    void eliminar(T object);
    default void eliminar(Long id) {
        eliminar(buscar(id));
    }    
}
