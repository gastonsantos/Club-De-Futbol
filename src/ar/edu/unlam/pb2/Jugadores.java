package ar.edu.unlam.pb2;

public class Jugadores extends Miembro {

	private String posicion;
	private String pieHabil;
	//Constructor
	public Jugadores(String nombre, String apellido, Double sueldo, Integer edad, String posicion, String pieHabil) {
		super(nombre, apellido, sueldo, edad);
		this.posicion = posicion;
		this.pieHabil = pieHabil;
	}
	
	//Getters y Setters
	
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getPieHabil() {
		return pieHabil;
	}
	public void setPieHabil(String pieHabil) {
		this.pieHabil = pieHabil;
	}
	
	
}
