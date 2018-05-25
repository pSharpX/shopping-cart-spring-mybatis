package pe.edu.cibertec.servicio.base;

import pe.edu.cibertec.dto.base.DtoBase;

import java.util.List;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
public interface ServicioBase<T extends DtoBase> {
    T buscar(Long id);
    List<T> obtenerTodos();
    void crear(T object);
    void actualizar(T object);
    void eliminar(T object);
    default void eliminar(Long id) {
        eliminar(buscar(id));
    }
}
