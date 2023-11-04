package ar.edu.unlam.pb2;

import java.util.Objects;

public abstract class MedioDeTransporte {
	private String patente;
	private Double latitud;
	private Double longitud;
	
	public MedioDeTransporte(String patente, Double latitud, Double longitud){
		this.setPatente(patente);
		this.setLatitud(latitud);
		this.setLongitud(longitud);
	}

	public MedioDeTransporte(Double latitud2, Double longitud2) {
		this.setLatitud(latitud2);
		this.setLongitud(longitud2);
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

}
