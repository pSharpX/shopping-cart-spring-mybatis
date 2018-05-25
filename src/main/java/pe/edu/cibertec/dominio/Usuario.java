package pe.edu.cibertec.dominio;

import pe.edu.cibertec.dominio.base.EntidadBase;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Usuario extends EntidadBase {

    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private transient Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void despuesCargarEntidad() {
        LocalDate ahora = LocalDate.now();
        LocalDate fnLocalDate = this.fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        edad = (int)fnLocalDate.until(ahora, ChronoUnit.YEARS);
    }

    @Override
    public String toString(){
        return String.format("Usuario {\"id\": %d, \"nombre\": \"%s\", \"apellido\": \"%s\"}", 
                this.id, this.nombre, this.apellido);
    }
    
}
