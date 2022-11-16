package pb2.unlam;

import java.util.Objects;

public class Sensor {

	private Integer IdSensor;
	private Boolean estado = Boolean.FALSE;
	
	
	public Sensor(Integer idSensor) {
		super();
		IdSensor = idSensor;
		
	}


	public Integer getIdSensor() {
		return IdSensor;
	}


	public void setIdSensor(Integer idSensor) {
		IdSensor = idSensor;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	@Override
	public int hashCode() {
		return Objects.hash(IdSensor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sensor other = (Sensor) obj;
		return Objects.equals(IdSensor, other.IdSensor);
	}
	
	
	
	
	
}
