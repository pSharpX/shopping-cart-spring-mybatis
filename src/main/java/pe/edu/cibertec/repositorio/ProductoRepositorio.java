package pe.edu.cibertec.repositorio;

import java.util.List;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.dominio.busqueda.BusquedaProductoTop;

public interface ProductoRepositorio extends RepositorioBase<Producto> {
    List<Producto> obtenerPorCategoria(Long idCategoria);
    int guardar(Producto producto);
    List<Producto> obtenerProductosTop(BusquedaProductoTop busquedaProductoTop);
}
