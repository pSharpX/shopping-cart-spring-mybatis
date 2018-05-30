package pe.edu.cibertec.dto;

import pe.edu.cibertec.dto.base.DtoBase;

import java.util.Date;
import java.util.List;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
public class CarritoDto extends DtoBase {

    private double total;
    private Date fechaCreacion;
    private Date fechaCompra;
    private String direccionEnvio;
    private boolean activo;
    private String usuario;
    private List<DetalleCarritoDto> detalleCarrito;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<DetalleCarritoDto> getDetalleCarrito() {
        return detalleCarrito;
    }

    public void setDetalleCarrito(List<DetalleCarritoDto> detalleCarrito) {
        this.detalleCarrito = detalleCarrito;
    }
}
