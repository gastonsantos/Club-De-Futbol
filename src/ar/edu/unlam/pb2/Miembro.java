package ar.edu.unlam.pb2;

public class Miembro {

	private String nombre;
	private String apellido;
	private Double sueldo;
	private Integer edad;
	
	//Constructor
	public Miembro(String nombre, String apellido, Double sueldo, Integer edad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.edad = edad;
	}

	//Getters Y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
	
}
