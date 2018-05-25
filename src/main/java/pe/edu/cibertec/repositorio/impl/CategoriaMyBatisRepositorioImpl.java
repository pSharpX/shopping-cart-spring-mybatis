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
import pe.edu.cibertec.dominio.Categoria;
import pe.edu.cibertec.repositorio.CategoriaRepositorio;
import pe.edu.cibertec.repositorio.mapper.CategoriaMapper;

/**
 *
 * @author Java-LM
 */
@Repository
public class CategoriaMyBatisRepositorioImpl implements CategoriaRepositorio{

    private CategoriaMapper categoriaMapper;
    
    @Autowired
    public CategoriaMyBatisRepositorioImpl(SqlSession session) {
        categoriaMapper = session.getMapper(CategoriaMapper.class);
    }
    
    @Override
    public Categoria buscar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> obtenerTodos() {
        return categoriaMapper.obtenerTodos();
    }

    @Override
    public void crear(Categoria object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Categoria object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Categoria object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
