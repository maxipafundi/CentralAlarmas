package pb2.unlam;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	
	public void QueSePuedaCrearUsuarioConfigurable() {
		
		UsuarioConfigurador usuario1 = new UsuarioConfigurador(42100334, "Maxi");
		
		assertNotNull(usuario1);
	}
	
@org.junit.Test
	
	public void QueSePuedaCrearUsuarioActivador() {
		
		UsuarioActivador usuario1 = new UsuarioActivador(42100334, "Maxi");
		
		assertNotNull(usuario1);
	}
	

@org.junit.Test

	public void QueSePuedaCrearUsuarioAdmin() {
	
	UsuarioAdmin usuario1 = new UsuarioAdmin(42100334, "Maxi");
	
	assertNotNull(usuario1);
}
	
@org.junit.Test

	public void queSePuedaRegistrarUnaAlarmaEnLaCentral() {
	
	UsuarioAdmin usuario1 = new UsuarioAdmin(42100334, "Maxi");
	
	Alarma alarma1 = new Alarma(12,222,333,"prosegur",null);
	
	
	usuario1.registrarAlarma(alarma1);
	
	Integer re= 1;
	Integer ro = usuario1.getCantidadDeAlarmaRegistradaEnLaCentral();
	
	assertEquals(re,ro);
	
	
}

@org.junit.Test

public void queSePuedaAgregarUnUsuarioConfiguradorAUnaAlarma() {
	
	Integer codigoConfigurador = 333;
	Integer idAlarma = 12;
	Integer dniUsuario = 42100334;
	
	UsuarioAdmin usuarioAdmin = new UsuarioAdmin(42100334, "Maxi");
	UsuarioConfigurador usuarioConfig = new UsuarioConfigurador(42344334, "Lucas");
	Alarma alarma1 = new Alarma(12,222,333,"prosegur",null);
	
	
	try {
		usuarioAdmin.registrarAlarma(alarma1);
		usuarioAdmin.registrarUsuarioConfiguradoroActivador(usuarioConfig);
		usuarioAdmin.agregarUsuarioAUnaAlarma(usuarioConfig,dniUsuario, idAlarma, codigoConfigurador);
		
	} catch (CodigoDeAlarmaIncorrecto e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Integer re= 1;
	Integer ro = usuarioAdmin.getCantidadDeUsuariosAgregadosAUnaAlarma();
	
	assertEquals(re,ro);

	
}
@org.junit.Test

public void queSePuedaAgregarUnUsuarioConfiguradorAUnaAlarmaDOS() {
	
	Integer codigoConfigurador = 333;
	Integer idAlarma = 12;
	Integer dniUsuario = 42100334;
	
	UsuarioAdmin usuarioAdmin = new UsuarioAdmin(42100334, "Maxi");
	UsuarioConfigurador usuarioConfig = new UsuarioConfigurador(42100334, "Lucas");
	Alarma alarma1 = new Alarma(12,222,333,"prosegur",null);
	
	
	try {
		usuarioAdmin.registrarAlarma(alarma1);
		usuarioAdmin.registrarUsuarioConfiguradoroActivador(usuarioConfig);
		usuarioAdmin.AgregarUsuarioValidoAUnaAlarma(usuarioConfig, alarma1, 42100334, 12, 333);
		
	} catch (CodigoDeAlarmaIncorrecto e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Integer re= 1;
	Integer ro = alarma1.cantidadDeUsuariosValidosEnUnaAlarma();
	
	assertEquals(re,ro);

	
}

@org.junit.Test (expected = CodigoDeAlarmaIncorrecto.class)

public void alAgregarUnUsuarioAUnaAlarmaConCodigoDeConfiguracionDeAlarmaInvalidoSeLanceCodigoAlarmaIncorrectoException() throws CodigoDeAlarmaIncorrecto {
	
	Integer codigoConfigurador = 111;
	Integer idAlarma = 12;
	Integer dniUsuario = 42100334;
	
	UsuarioAdmin usuarioAdmin = new UsuarioAdmin(42100334, "Maxi");
	UsuarioConfigurador usuarioConfig = new UsuarioConfigurador(42344334, "Lucas");
	Alarma alarma1 = new Alarma(12,222,333,"prosegur", null);
	
	usuarioAdmin.registrarAlarma(alarma1);
	usuarioAdmin.registrarUsuarioConfiguradoroActivador(usuarioConfig);
	usuarioAdmin.agregarUsuarioAUnaAlarma(usuarioConfig,dniUsuario, idAlarma, codigoConfigurador);
	
	
	
}

@org.junit.Test 

public void alAgregarUnSensorEnUnaAlarma() {
	
	Integer codigoConfigurador = 111;
	Integer idAlarma = 12;
	Integer dniUsuario = 42100334;
	Integer codigoActivacion = 222;
	
	UsuarioAdmin usuarioAdmin = new UsuarioAdmin(42100334, "Maxi");
	UsuarioConfigurador usuarioConfig = new UsuarioConfigurador(42344334, "Lucas");
	Sensor sensor1 = new Sensor(200);
	Sensor sensor2 = new Sensor(200);
	Sensor sensor3 = new Sensor(200);
	Alarma alarma1 = new Alarma(idAlarma,codigoActivacion,codigoConfigurador,"prosegur", null);
	
	
		try {
			usuarioAdmin.registrarAlarma(alarma1);
			usuarioAdmin.registrarUsuarioConfiguradoroActivador(usuarioConfig);
			usuarioAdmin.agregarSensorAUnaAlarma(alarma1, usuarioConfig, 111, sensor1);
	
		} catch (SensorDuplicado | CodigoDeAlarmaIncorrecto e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	Integer re = 1;
	Integer ro = alarma1.cantidadSensores();
	
	System.out.println(alarma1.cantidadSensores());
	assertEquals(re,ro);
}


@org.junit.Test (expected = SensorDuplicado.class)
public void alAgregarUnSensorDuplicadoEnUnaAlarmaSeLanceUnaSensorDuplicadoException() throws SensorDuplicado, CodigoDeAlarmaIncorrecto{
	
	Integer codigoConfigurador = 111;
	Integer idAlarma = 12;
	Integer dniUsuario = 42100334;
	Integer codigoActivacion = 222;
	
	UsuarioAdmin usuarioAdmin = new UsuarioAdmin(42100334, "Maxi");
	UsuarioConfigurador usuarioConfig = new UsuarioConfigurador(42344334, "Lucas");
	Sensor sensor1 = new Sensor(200);
	Sensor sensor2 = new Sensor(200);
	Alarma alarma1 = new Alarma(idAlarma,codigoActivacion,codigoConfigurador,"prosegur", null);
	
	
	usuarioAdmin.registrarAlarma(alarma1);
	usuarioAdmin.registrarUsuarioConfiguradoroActivador(usuarioConfig);
	usuarioAdmin.agregarSensorAUnaAlarma(alarma1, usuarioConfig, 111, sensor1);
	usuarioAdmin.agregarSensorAUnaAlarma(alarma1, usuarioConfig, 111, sensor2);
	

}

@org.junit.Test

public void queNoSePuedaActivarUnaAlarmaSiHayAlMenosUnSensorDesactivado() throws CodigoDeAlarmaIncorrecto, SensorDuplicado, SensorDesactivado {

	Integer codigoConfigurador = 111;
	Integer idAlarma = 12;
	Integer dniUsuario = 42100334;
	Integer codigoActivacion = 222;
	
	UsuarioAdmin usuarioAdmin = new UsuarioAdmin(42100334, "Maxi");
	UsuarioConfigurador usuarioConfig = new UsuarioConfigurador(42344334, "Lucas");
	Sensor sensor2 = new Sensor(200);
	Alarma alarma1 = new Alarma(idAlarma,codigoActivacion,codigoConfigurador,"prosegur", null);
	
	usuarioAdmin.registrarAlarma(alarma1);
	usuarioAdmin.registrarUsuarioConfiguradoroActivador(usuarioConfig);
	usuarioAdmin.AgregarUsuarioValidoAUnaAlarma(usuarioConfig, alarma1, dniUsuario, idAlarma, 111);
	usuarioAdmin.agregarSensorAUnaAlarma(alarma1, usuarioConfig, 111, sensor2);
	
	usuarioAdmin.activarUnSensorDeUnaAlarma(sensor2, alarma1, 200, 12);
	
	
	
}

}
