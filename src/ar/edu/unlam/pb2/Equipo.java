package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;




public class Equipo {
	private String nombreEquipo;
	private Double finanzas; 
	private Integer topeJugadores;
	private Integer topeCuerpoTecnico;
	
	private Double sumaSueldoJugadores;
	private Double sumaSueldoCuerpoTecnico ;
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public Equipo(String nombreEquipo) {
	
		this.nombreEquipo = nombreEquipo;
		finanzas=0.0;
		topeJugadores= 23;
		topeCuerpoTecnico = 6;
		sumaSueldoJugadores = 0.0;
		sumaSueldoCuerpoTecnico= 0.0;
		
		
	}


	private ArrayList<Jugadores> listaJugadores = new  ArrayList<Jugadores>();
	private HashSet <Jugadores> ListaJugadoreSinRepetidos = new HashSet<Jugadores>();
	private ArrayList<CuerpoTecnico> listaCuerpoTecnico = new  ArrayList<CuerpoTecnico>();
	
	

	
	//Constructor Del ArrayList
	public Equipo(ArrayList<Jugadores> listaJugadores, ArrayList<CuerpoTecnico> listaCuerpoTecnico) {
		this.listaJugadores = listaJugadores;
		this.listaCuerpoTecnico = listaCuerpoTecnico;
	}
	
	//Metodos de  Jugadores 
	
	//Agrego Jugador mientras que tengo menos de 23
	
		public Boolean AgregoJugador(Jugadores jugador1){
			
			if(topeJugadores>=listaJugadores.size()){
				
				listaJugadores.add(jugador1);
				
				return true;
			}else{
				return false;
				
			}

	}

	//Elimino Un Jugador
	public void EliminoJugador(Jugadores jugador1){
		
			
			listaJugadores.remove(jugador1);
	}
	
	//Cuento La cantidad De jugadores que tengo Inscriptos
	public Integer ContadorJugadores(){
		return  listaJugadores.size();
		
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

//Ordenar por Sueldo
public void OrdenarListaDeJugadoresPorSueldo() {
	
	Collections.sort(listaJugadores, Comparator.comparing(Jugadores::getSueldo));
	
}

// Lista De  Jugadores sin Repetidos
public void ListaDeJugadoresSinRepetidos() {
	
	
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
  




//Buscar Jugador Con MEtodo Equals
public Boolean BuscarJugador(String jugador1) {
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


	//Metodos Cuerpo TEcnicos
	
	//Agrego Integrante Cuerpo Tecnico
	
	public Boolean AgregarIntegranteDeCT(CuerpoTecnico CT1){
		
		if(topeCuerpoTecnico>=listaCuerpoTecnico.size()){
			
			listaCuerpoTecnico.add(CT1);
			return true;
			
			
		}else{
			return false;
		}
		
	}
	
	
	//cuento Cantidad de Integrandes de Cuerpo tecnico Tengo
	
	public Integer ContadorDeCuerpoTecnico(){
		 
		return listaCuerpoTecnico.size();
		
	}
	//Elimino Integrande De Cuerpo Tecnico
	
	public void EliminoIntegranteCT(CuerpoTecnico CT1){
		listaCuerpoTecnico.remove(CT1);
		
	}
	//SUMO SUELDO CUERPO TECNICO
	
	public Double sumoSueldoCuerpoTecnico() {
		
		for(CuerpoTecnico e: listaCuerpoTecnico) {
			sumaSueldoCuerpoTecnico+= e.getSueldo();
			
		}
		System.out.println(sumaSueldoCuerpoTecnico);
		return sumaSueldoCuerpoTecnico;
	}
	
	public HashSet<Jugadores> getListaJugadoreSinRepetidos() {
		return ListaJugadoreSinRepetidos;
	}

	public void setListaJugadoreSinRepetidos(HashSet<Jugadores> listaJugadoreSinRepetidos) {
		ListaJugadoreSinRepetidos = listaJugadoreSinRepetidos;
	}

	
	//Finanzas
	public Double FinanzasDelClub(Presupuesto presupuesto1) {
		
		finanzas=  presupuesto1.SumaDePresupuesto() - sumaSueldoJugadores-sumaSueldoCuerpoTecnico; 
		
		
		return finanzas;
	}
	
	public Boolean bancaRota() {
		if(finanzas>=0.0 ) {
			return false;
		}else {
			return true;
		}
		
	}
	
	
	
	
	

}
