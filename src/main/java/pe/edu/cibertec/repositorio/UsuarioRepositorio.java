package pe.edu.cibertec.repositorio;

import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.repositorio.base.RepositorioBase;

public interface UsuarioRepositorio extends RepositorioBase<Usuario> {
    Usuario buscar(String nombre);
}
