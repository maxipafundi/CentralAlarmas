package pb2.unlam;

public class Acciones {

	private Integer idAccion;
	private Alarma alarma;
	private Usuario usuario;
	private String fecha;
	private TIPO_OPERACION tipoOperacion;
	
	
	public Acciones(Integer idAccion, Alarma alarma, Usuario usuario, String fecha, TIPO_OPERACION tipoOperacion) {
		super();
		this.idAccion = idAccion;
		this.alarma = alarma;
		this.usuario = usuario;
		this.fecha = fecha;
		this.tipoOperacion = tipoOperacion;
	}


	public Integer getIdAccion() {
		return idAccion;
	}


	public void setIdAccion(Integer idAccion) {
		this.idAccion = idAccion;
	}


	public Alarma getAlarma() {
		return alarma;
	}


	public void setAlarma(Alarma alarma) {
		this.alarma = alarma;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public TIPO_OPERACION getTipoOperacion() {
		return tipoOperacion;
	}


	public void setTipoOperacion(TIPO_OPERACION tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}
	
	
	
	
}
