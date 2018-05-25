package pe.edu.cibertec.repositorio;

import pe.edu.cibertec.dominio.Usuario;

public interface UsuarioRepositorio extends RepositorioBase<Usuario>{
    Usuario buscar(String nombre);
}
