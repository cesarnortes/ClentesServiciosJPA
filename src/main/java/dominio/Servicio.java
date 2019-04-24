package dominio;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Entity;
import java.sql.Date;

/**
 * The persistent class for the tservicios database table.
 * 
 */
@Entity//es necesario
@Table(name="tservicios")
@NamedQuery(name="Servicio.findAll", query="SELECT s FROM Servicio s")
public class Servicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdServicio")//se indica el valor del atributo especificando la columna de la base de datos
	private int idServicio;

	@Column(name="Descripcion")
	private String descripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="Fecha")
	private Date fecha;

	//
	//bi-directional many-to-one association to Cliente
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="IdCliente", referencedColumnName="IdCliente")
	private Cliente cliente;

	public Servicio() {
	}

	public int getIdServicio() {
		return this.idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}