package pe.edu.cibertec.repositorio.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import pe.edu.cibertec.dominio.Categoria;

public interface CategoriaMapper {

    final String getAll = "SELECT id, nombre FROM categoria";
    final String getById = "SELECT id, nombre FROM categoria WHERE ID = #{id}";
    final String insert = "INSERT INTO categoria (nombre ) VALUES (#{nombre})";
    final String update = "UPDATE categoria SET NAME = #{nombre} WHERE ID = #{id}";
    final String deleteById = "DELETE from categoria WHERE ID = #{id}";

    @Select(getById)
    @Results( value = {
            @Result(column = "id", property = "id"),
            @Result(column = "nombre", property = "nombre")
    })
    Categoria selectCategoria(Long id);

    @Select(getAll)
    @Results( value = {
            @Result(column = "id", property = "id"),
            @Result(column = "nombre", property = "nombre")
    })
    List<Categoria> selectAllCategoria();

    @Insert(insert)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertCategoria(Categoria categoria);

    @Update(update)
    void updateCategoria(Categoria categoria);

    @Delete(deleteById)
    void deleteCategoria(Long id);
}
