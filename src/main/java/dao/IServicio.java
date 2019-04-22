package dao;

 import java.util.List;

import dominio.Servicio;

public interface IServicio {
	
	void alta(Servicio servicio);
	void modificacion(Servicio servicio);
	void baja(Servicio servicio);
	Servicio consultaId(Servicio servicio);
	List<Servicio> ConsultaAll();

}
