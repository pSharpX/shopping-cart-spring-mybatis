/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dominio.Carrito;
import pe.edu.cibertec.dominio.DetalleCarrito;
import pe.edu.cibertec.repositorio.CarritoRepositorio;
import pe.edu.cibertec.repositorio.DetalleCarritoRepositorio;
import pe.edu.cibertec.repositorio.mapper.DetalleCarritoMapper;

/**
 *
 * @author Java-LM
 */
@Repository
public class DetalleCarritoMyBatisRepositorioImpl implements DetalleCarritoRepositorio{

    private DetalleCarritoMapper detalleCarritoMapper;

    @Autowired
    public DetalleCarritoMyBatisRepositorioImpl(SqlSession session) {
        detalleCarritoMapper = session.getMapper(DetalleCarritoMapper.class);
    }

    @Override
    public DetalleCarrito buscar(Long id) {
        return null;
    }

    @Override
    public List<DetalleCarrito> obtenerTodos() {
        return null;
    }

    @Override
    public void crear(DetalleCarrito object) {

    }

    @Override
    public void actualizar(DetalleCarrito object) {

    }

    @Override
    public void eliminar(DetalleCarrito object) {

    }
}
