/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio.mapper;

import java.util.List;

import pe.edu.cibertec.dominio.Carrito;

/**
 *
 * @author Java-LM
 */
public interface CarritoMapper {
	Carrito selectCarrito(Long id);
    List<Carrito> selectAllCarrito();
    Long insertCarrito(Carrito carrito);
    void deleteCarrito(Long id); 
}
