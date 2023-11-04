package ar.edu.unlam.pb2;

public class Tren extends Vehiculo {

	private Integer cantidadDeVagones;
	private Integer CantidadDePasajerosPorVagon;
	private Integer velocidadMaxima;
	
	public Tren(Integer cantidadDeVagones, Integer CantidadDePasajerosPorVagon, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud,longitud);
		this.setCantidadDePasajerosPorVagon(CantidadDePasajerosPorVagon);
		this.setCantidadDeVagones(cantidadDeVagones);
		this.setVelocidadMaxima(velocidadMaxima);
		
	}

	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}

	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		return CantidadDePasajerosPorVagon;
	}

	public void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		CantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

}
