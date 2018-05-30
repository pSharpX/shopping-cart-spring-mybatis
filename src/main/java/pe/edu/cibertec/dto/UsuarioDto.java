package pe.edu.cibertec.dto;

import pe.edu.cibertec.dto.base.DtoBase;

import java.util.Date;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
public class UsuarioDto extends DtoBase {

    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private int edad;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        return String.format("Usuario {\"id\": %d, \"nombre\": \"%s\", \"apellido\": \"%s\"}",
                this.id, this.nombre, this.apellido);
    }
}
