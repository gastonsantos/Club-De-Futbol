package ar.edu.unlam.pb2;

public class CuerpoTecnico extends Miembro {

	private String funcion;
//Constructor
	public CuerpoTecnico(String nombre, String apellido, Double sueldo, Integer edad, String funcion) {
		super(nombre, apellido, sueldo, edad);
		this.funcion = funcion;
	}
//Getters y Setters
	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	
	
	
}
