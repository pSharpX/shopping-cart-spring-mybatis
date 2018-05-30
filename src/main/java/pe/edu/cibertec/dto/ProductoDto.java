package pe.edu.cibertec.dto;

import pe.edu.cibertec.dto.base.DtoBase;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
public class ProductoDto extends DtoBase {

    private String nombre;
    private String descripcion;
    private double precio;
    private byte[] imagen;
    private Long categoriaId;
    private String categoria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return String.format("Producto { \"id\": %d, \"nombre\": \"%s\", \"categoria\": \"%s\"}",
                id, nombre, categoria);
    }
}
