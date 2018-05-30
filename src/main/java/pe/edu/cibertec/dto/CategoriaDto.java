package pe.edu.cibertec.dto;

import pe.edu.cibertec.dto.base.DtoBase;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
public class CategoriaDto extends DtoBase {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("Categoria { \"id\": %d, \"nombre\": \"%s\" }", getId(), nombre);
    }
}
