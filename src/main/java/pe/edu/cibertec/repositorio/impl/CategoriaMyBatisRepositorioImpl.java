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
        return categoriaMapper.selectCategoria(id);
    }

    @Override
    public List<Categoria> obtenerTodos() {
        return categoriaMapper.selectAllCategoria();
    }

    @Override
    public void crear(Categoria object) {
        categoriaMapper.insertCategoria(object);
    }

    @Override
    public void actualizar(Categoria object) {
        categoriaMapper.updateCategoria(object);
    }

    @Override
    public void eliminar(Categoria object) {
        categoriaMapper.deleteCategoria(object.getId());
    }
    
}
