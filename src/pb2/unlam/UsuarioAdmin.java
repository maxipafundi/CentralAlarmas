package pb2.unlam;

import java.util.HashSet;

public class UsuarioAdmin extends Usuario implements Configurable{

	
	private HashSet <Alarma> alarmasRegistradas = new HashSet <>();
	private HashSet <Usuario> usuariosRegistrados= new HashSet <>();
	private HashSet <Usuario> usuarioValidoDeAlarma = new HashSet <>();
	private HashSet <Sensor> sensoresAgregadosALaAlarma = new HashSet <>();
	
	
	
	
	public UsuarioAdmin(Integer id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}


	public void registrarUsuarioConfiguradoroActivador(Usuario usuario) {
		 
			this.usuariosRegistrados.add(usuario);
	}
	


	public void registrarAlarma(Alarma alarma) {
		this.alarmasRegistradas.add(alarma);
		
	}
	
	public Integer getCantidadDeAlarmaRegistradaEnLaCentral() {
		return this.alarmasRegistradas.size();
	}


	public void agregarUsuarioAUnaAlarma(Usuario usuario,int dniUsuarioAAgregar, int idAlarma, int codigoConfiguracionAlarma) throws CodigoDeAlarmaIncorrecto {
		
		for (Alarma alarma : alarmasRegistradas) {
			if(alarma.getCodigoConfiguracion().equals(codigoConfiguracionAlarma)) {
				this.usuarioValidoDeAlarma.add(usuario);
				
			} else throw new CodigoDeAlarmaIncorrecto();
		}
		
	}
	
	
	public void AgregarUsuarioValidoAUnaAlarma (Usuario usuario, Alarma alarma, int dniUsuario, int idAlarma, int codigoConfiguracionAlarma) throws CodigoDeAlarmaIncorrecto {
		if(alarma.getCodigoConfiguracion().equals(codigoConfiguracionAlarma)) {
		
			alarma.getUsuariosValidos().add(usuario);
		}
		else throw new CodigoDeAlarmaIncorrecto();
	}
	
	
	public Integer getCantidadDeUsuariosAgregadosAUnaAlarma() {
		return this.usuarioValidoDeAlarma.size();
	}


	

	@Override
	public void activarUnSensorDeUnaAlarma(Sensor sensor, Alarma alarma, int idDelSensor , int idAlarma) throws SensorDesactivado {
		if(alarma.getId().equals(idAlarma)) {
			if(alarma.getSensores().contains(sensor)) {
				sensor.setEstado(Boolean.TRUE);
					
				}
			} else throw new SensorDesactivado();
		
	}
	
		
	


	@Override
	public void agregarSensorAUnaAlarma(Alarma alarma, Usuario usuario,int codigoConfiguracion, Sensor sensor) throws SensorDuplicado, CodigoDeAlarmaIncorrecto {
		
		if(alarma.getCodigoConfiguracion().equals(codigoConfiguracion)) {
			if(!(alarma.getSensores().add(sensor))){
				throw new SensorDuplicado();
			}
				
			
		}

		else throw new CodigoDeAlarmaIncorrecto();
	}

	
	public Integer cantidadDeSensoresEnUnaAlarma() {
		return this.sensoresAgregadosALaAlarma.size();
	}
}
