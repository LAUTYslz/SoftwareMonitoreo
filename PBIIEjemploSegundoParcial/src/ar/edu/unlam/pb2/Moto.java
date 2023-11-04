package ar.edu.unlam.pb2;

public class Moto extends Vehiculo {

	private final Integer CAPACIDA_MAXIMA_DE_PASAJEROS=2;
	private Integer velocidadMaxima;
	
	public Moto(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(patente, latitud, longitud);
		this.setVelocidadMaxima(velocidadMaxima);
	}

	public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CAPACIDA_MAXIMA_DE_PASAJEROS;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	

}
