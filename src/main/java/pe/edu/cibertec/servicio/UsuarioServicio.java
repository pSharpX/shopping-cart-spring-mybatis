package pe.edu.cibertec.servicio;

import pe.edu.cibertec.dto.UsuarioDto;
import pe.edu.cibertec.servicio.base.ServicioBase;

/**
 * Created by CHRISTIAN on 24/05/2018.
 */
public interface UsuarioServicio extends ServicioBase<UsuarioDto> {
	UsuarioDto buscarPorNombre(String nombre);
}
