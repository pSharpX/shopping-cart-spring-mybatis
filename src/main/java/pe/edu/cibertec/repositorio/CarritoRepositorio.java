package pe.edu.cibertec.repositorio;

import java.util.List;
import pe.edu.cibertec.dominio.Carrito;
import pe.edu.cibertec.repositorio.base.RepositorioBase;

public interface CarritoRepositorio extends RepositorioBase<Carrito> {
    List<Carrito> buscarPorUsuario(Long idUsuario);
}
