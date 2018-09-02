package pe.edu.cibertec.servicio.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.cibertec.converter.CarritoConverter;
import pe.edu.cibertec.converter.DetalleCarritoConverter;
import pe.edu.cibertec.converter.UsuarioConverter;
import pe.edu.cibertec.dominio.Carrito;
import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.dto.CarritoDto;
import pe.edu.cibertec.repositorio.CarritoRepositorio;
import pe.edu.cibertec.repositorio.DetalleCarritoRepositorio;
import pe.edu.cibertec.repositorio.UsuarioRepositorio;
import pe.edu.cibertec.servicio.facade.TiendaServiceFacade;
import pe.edu.cibertec.util.ServiceFacade;

@ServiceFacade
public class TiendaServiceFacadeImpl implements TiendaServiceFacade {

	@Autowired
	private CarritoRepositorio carritoRepository;
	@Autowired
	private CarritoConverter carritoConverter;
	@Autowired
	private DetalleCarritoRepositorio detalleCarritoRepository;
	@Autowired
	private DetalleCarritoConverter detalleCarritoConverter;
	@Autowired
	private UsuarioRepositorio usuarioRepository;
	@Autowired
	private UsuarioConverter usuarioConverter;
	
	@Override
	public void comprar() {
		// TODO Auto-generated method stub
	}

	@Override
	public void generarCarrito(CarritoDto object) throws Exception {
		Carrito carrito =  this.carritoConverter.map(object);
		Usuario usuario = this.usuarioRepository.buscar(object.getUsuario());
		carrito.setUsuario(usuario);
		this.carritoRepository.crear(carrito);
		
		carrito.getDetalleCarritoList().forEach((d) -> {
			d.setCarritoCompras(carrito);
//			this.detalleCarritoRepository.crear(d);	
		});
		
		throw new Exception("Exception while trying inserting new carrito");
	}

}
