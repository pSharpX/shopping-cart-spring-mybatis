package pe.edu.cibertec.repositorio.mapper;

import java.util.List;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.dominio.busqueda.BusquedaProductoTop;

public interface ProductoMapper {
    Producto selectProducto(Long id);
    int insertProducto(Producto producto);
    List<Producto> selectProductoTop(BusquedaProductoTop busquedaProductoTop);
    List<Producto> procedureProductoTop(BusquedaProductoTop busquedaProductoTop);
}
