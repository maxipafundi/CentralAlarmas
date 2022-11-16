package pb2.unlam;

import java.util.ArrayList;
import java.util.HashSet;

public class Alarma {

	private Integer id;
	private Integer codigoActivacion;
	private Integer codigoConfiguracion;
	private String nombre;
	private Sensor idSensor;
	private HashSet <Usuario> usuariosValidos;
	private ArrayList <Acciones> accionesRealizadas;
	private HashSet <Sensor> sensores;
	
	public Alarma(Integer id, Integer codigoActivacion, Integer codigoConfiguracion, String nombre,  HashSet <Sensor> sensores) {
		super();
		this.id = id;
		this.codigoActivacion = codigoActivacion;
		this.codigoConfiguracion = codigoConfiguracion;
		this.nombre = nombre;
		this.usuariosValidos = new HashSet<>();
		this.accionesRealizadas = new ArrayList<>();
		this.sensores = new HashSet<>();
		
	}

	
	
	
	

	
	public Sensor getIdSensorDeLaAlarma() {
		return idSensor;
	}


	public void setIdSensor(Sensor idSensor) {
		this.idSensor = idSensor;
	}





	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCodigoActivacion() {
		return codigoActivacion;
	}

	public void setCodigoActivacion(Integer codigoActivacion) {
		this.codigoActivacion = codigoActivacion;
	}

	public Integer getCodigoConfiguracion() {
		return codigoConfiguracion;
	}

	public void setCodigoConfiguracion(Integer codigoConfiguracion) {
		this.codigoConfiguracion = codigoConfiguracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Usuario> getUsuariosValidos() {
		return usuariosValidos;
	}

	public void setUsuariosValidos(HashSet<Usuario> usuariosValidos) {
		this.usuariosValidos = usuariosValidos;
	}

	public ArrayList<Acciones> getAccionesRealizadas() {
		return accionesRealizadas;
	}

	public void setAccionesRealizadas(ArrayList<Acciones> accionesRealizadas) {
		this.accionesRealizadas = accionesRealizadas;
	}

	public HashSet<Sensor> getSensores() {
		return sensores;
	}

	public Integer cantidadSensores() {
		return this.sensores.size();
	}
	
	public void setSensores(HashSet<Sensor> sensores) {
		this.sensores = sensores;
	}
	
	public Integer cantidadDeUsuariosValidosEnUnaAlarma() {
		return this.usuariosValidos.size();
	}
	
	
	
	
}
