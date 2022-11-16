package pb2.unlam;

public interface Configurable {

	public void agregarUsuarioAUnaAlarma(Usuario usuario,int dniUsuarioAAgregar, int idAlarma, int codigoConfiguracionAlarma) throws CodigoDeAlarmaIncorrecto;
	
	public void agregarSensorAUnaAlarma(Alarma alarma, Usuario usuario,int codigoConfiguracion, Sensor sensor) throws SensorDuplicado, CodigoDeAlarmaIncorrecto;
	
	void activarUnSensorDeUnaAlarma(Sensor sensor, Alarma alarma, int idDelSensor, int idAlarma) throws SensorDesactivado;


	
}
