package ec.ups.edu.g1.servicios;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/recarga")
public class ServicioRest {
	/**
	@Inject
	private GestionVehiculosON gVehiculo;



@POST
@Produces("application/json")
@Consumes("application/json")
public Mensaje realizarRecarga(Recarga recarga) {
	
	Mensaje m=new Mensaje();
	try {
		gVehiculo.guardarVehiculo(vh);
		m.setCode("ok");
		m.setMessage("Actualizado correctamente");
		
	}catch(Exception e){
		//e.printStackTrace();
		m.setCode("ERROR");
		m.setMessage("Error al actualizar registro");
	}
	return m;
	
}
*/

}
