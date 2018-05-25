package pe.edu.cibertec.repositorio.mapper;

import java.util.List;
import pe.edu.cibertec.dominio.Usuario;

public interface UsuarioMapper {
    Usuario selectUsuario(Long id);
    List<Usuario> selectAllUsuario();
    void insertUsuario(Usuario usuario);
    void updateUsuario(Usuario usuario);
    void deleteUsuario(Long id);
    Usuario selectUsuarioByName(String nombre);
}
