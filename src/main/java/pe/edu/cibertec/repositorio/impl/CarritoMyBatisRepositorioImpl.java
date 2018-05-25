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
import pe.edu.cibertec.repositorio.CarritoRepositorio;
import pe.edu.cibertec.repositorio.mapper.CarritoMapper;

/**
 *
 * @author Java-LM
 */
@Repository
public class CarritoMyBatisRepositorioImpl implements CarritoRepositorio{

    private CarritoMapper carritoMapper;
    
    @Autowired
    public CarritoMyBatisRepositorioImpl(SqlSession session) {
        carritoMapper = session.getMapper(CarritoMapper.class);
    }
    
    @Override
    public List<Carrito> buscarPorUsuario(Long idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Carrito buscar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Carrito> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crear(Carrito object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Carrito object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Carrito object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
