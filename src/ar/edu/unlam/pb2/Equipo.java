package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Equipo {
	private String nombreEquipo;
	private Double finanzas= 0.0; 
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public Equipo(String nombreEquipo) {
	
		this.nombreEquipo = nombreEquipo;
	}


	private ArrayList<Jugadores> listaJugadores = new  ArrayList<Jugadores>();
	private HashSet <Jugadores> ListaJugadoreSinRepetidos = new HashSet<Jugadores>();
	
	
	private ArrayList<CuerpoTecnico> listaCuerpoTecnico = new  ArrayList<CuerpoTecnico>();
	private Integer contadorJugadores = 0;
	private Integer contadorEntrenadores = 0;
	static Integer topeJugadores=23;
	static Integer topeCuerpoTecnico=6;
	private Double sumaSueldoJugadores =0.0; 
   
   private Boolean bandera=false;
	private Scanner s;
	
	
   
	
	
	
	//Constructor Del ArrayList
	public Equipo(ArrayList<Jugadores> listaJugadores, ArrayList<CuerpoTecnico> listaCuerpoTecnico) {
		this.listaJugadores = listaJugadores;
		this.listaCuerpoTecnico = listaCuerpoTecnico;
	}
	
	//Metodos de  Jugadores 
	
	//Agrego Jugador mientras que tengo menos de 23
	
	
		
		public Boolean AgregoJugador(Jugadores jugador1){
			try {
			if(topeJugadores>=listaJugadores.size()){
				
				listaJugadores.add(jugador1);
				
				return true;
			}else{
				return false;
				
			}
		
		}
		catch(Exception e){
			
			System.out.println("Se ah producido un error");
			return null;
		}
	}

	//Elimino Un Jugador
	public void EliminoJugador(Jugadores jugador1){
		try {
			
			listaJugadores.remove(jugador1);
		}catch (Exception e) {
			System.out.println("Se ah producido un error");
			
		}
		
		
	
	}
	
	//Cuento La cantidad De jugadores que tengo Inscriptos
	public Integer ContadorJugadores(){
		contadorJugadores = listaJugadores.size();
		return contadorJugadores;
	}
	//SUMo los Sueldo De los Jugadores
	
public Double SumaDeSueldosDeJugadores(){
		
		for(Jugadores e: listaJugadores){
			sumaSueldoJugadores+= e.getSueldo();
		}
		System.out.println("El sueldo TOTAl de los Jugadores es: $"+sumaSueldoJugadores);
		return sumaSueldoJugadores;
		
		
	}
	
//Mostrar Jugadores
public void MostrarListaDeJugadores() {
	
	for(Jugadores e: listaJugadores) {
		System.out.println(e.getApellido()+" "+e.getNombre()+" "+"Sueldo: "+e.getSueldo()+"\n");
	}
}

// ORDENADA ALFABETICAMENTE


public void OrdenoListaJugadoresPorNombre(){
	System.out.println("PLANTEL:\n");
	Collections.sort(listaJugadores, Comparator.comparing(Jugadores::getApellido));
	
		
	
}

//Ordenar por POSICION
//Ordenar por Sueldo
public void OrdenarListaDeJugadoresPorSueldo() {
	
	Collections.sort(listaJugadores, Comparator.comparing(Jugadores::getSueldo));
	
}

// Lista De  Jugadores sin Repetidos
public void ListaDeJugadoresSinRepetidos() {
	//System.out.println("JUGADORES\n");
	
	
	ListaJugadoreSinRepetidos.addAll(listaJugadores);
	
}

//Cuenta LOS JUGADORES DE LA LISTA SIN REPETDDOS

public Integer ContadorDeListaSinRepetidos() {
	return ListaJugadoreSinRepetidos.size();
	
}


//Muestra Lista De Jugadores Sin repetudos
public void MostrarListaDeJugadoresSinRepetir() {
for(Jugadores e: ListaJugadoreSinRepetidos) {
		
		System.out.println(e.getApellido()+" "+e.getNombre()+"\n");
	}
	
}
  


//Buscar Jugador

public Boolean BuscarJugador(String jugador1) {
	//s = new Scanner(System.in);
	for(Jugadores e :ListaJugadoreSinRepetidos ) {
		if(e.getApellido()==jugador1) {
			//e.setApellido(s.nextLine());
			bandera = true;
			break;
	}else {	
		bandera = false;
	}	  
	}
	if(bandera==true) {
		System.out.println("El jugador  SE encuentra Inscripto");
	}else {
		System.out.println("El jugador  NO se encuentra Inscripto");
	}
	return bandera;
	}
public Boolean BuscarJugadorConEquals(String jugador1) {
	boolean bandera = false;
	for(Jugadores e: ListaJugadoreSinRepetidos) {
		if(e.getApellido().contentEquals(jugador1)==true){
			bandera =true;
			break;
			}else {
				bandera = false;
		}	
	}
	return bandera;
	
}







//Muesto Todos los Nombres de Jugadore en MAYUSCULA

public void NombreEnMayuscula(){
	
	for(Jugadores e :listaJugadores){
		System.out.println(e.getApellido().toUpperCase()+ " "+e.getNombre().toUpperCase()+"\n");
		
	}
}


	//Metodos Entrenadores
	
	//Agrego Entrenador
	
	public Boolean AgregarIntegranteDeCT(CuerpoTecnico CT1){
		
		if(topeCuerpoTecnico<=listaCuerpoTecnico.size()){
			
			listaCuerpoTecnico.add(CT1);
			return true;
			
			
		}else{
			return false;
		}
		
	}

	
	//cuento Cantidad de Integrandes de Cuerpo tecnico Tengo
	
	public Integer ContadorDeCuerpoTecnico(){
		contadorEntrenadores = listaCuerpoTecnico.size();
		return contadorEntrenadores;
		
	}
	//Elimino Integrande De Cuerpo Tecnico
	
	public void EliminoIntegranteCT(CuerpoTecnico CT1){
		listaCuerpoTecnico.remove(CT1);
		
	}
	
	
	public HashSet<Jugadores> getListaJugadoreSinRepetidos() {
		return ListaJugadoreSinRepetidos;
	}

	public void setListaJugadoreSinRepetidos(HashSet<Jugadores> listaJugadoreSinRepetidos) {
		ListaJugadoreSinRepetidos = listaJugadoreSinRepetidos;
	}

	
	//Finanzas
	public Double FinanzasDelClub(Presupuesto presupuesto1) {
		finanzas=  presupuesto1.getSumaPresupuesto()-sumaSueldoJugadores; 
		
		System.out.println("Las Finanzas SON: $"+finanzas);
		return finanzas;
	}
	
	
	
	
	

}
