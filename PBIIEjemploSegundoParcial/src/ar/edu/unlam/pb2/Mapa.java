package ar.edu.unlam.pb2;

import java.util.Set;
import java.util.HashSet;

public class Mapa {

	private String nombre;
	private Set<Vehiculo> vehiculos;

	public Mapa(String nombre) {
		this.setNombre(nombre);
		vehiculos = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean agregarVehiculo(Vehiculo vehiculo) {
		if (this.buscarVehiculoEnLista(vehiculo))
			return this.vehiculos.add(vehiculo);
		return false;
	}

	private boolean buscarVehiculoEnLista(Vehiculo vehiculo) {
		this.vehiculos.contains(vehiculo);
		if (vehiculo != null)
			return true;
		return false;
	}

	public Object getCantidadDeVehiculos() {
		return this.vehiculos.size();
	}

	public Boolean hayCoalicion() throws ColitionException {
		for (Vehiculo vehiculo : vehiculos) {
			for (Vehiculo vehiculoComparado : vehiculos) {
				if (!vehiculo.equals(vehiculoComparado)) {
					Double latitud1 = vehiculo.getLatitud();
					Double latitud2 = vehiculoComparado.getLatitud();
					Double longitud1 = vehiculo.getLongitud();
					Double longitud2 = vehiculoComparado.getLongitud();
					if (latitud1.equals(latitud2) && longitud1.equals(longitud2)) {
						throw new ColitionException();
					}
				}
			}
		}
		return false;
	}

}
