package pe.edu.cibertec.servicio.facade;

import pe.edu.cibertec.dto.CarritoDto;

public interface TiendaServiceFacade {
	void comprar();
	void generarCarrito(CarritoDto object) throws Exception;
}
