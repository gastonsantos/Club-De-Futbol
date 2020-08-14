package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Equipo {
	private ArrayList<Jugadores> listaJugadores = new  ArrayList<Jugadores>();
	private ArrayList<CuerpoTecnico> listaCuerpoTecnico = new  ArrayList<CuerpoTecnico>();
	private Integer contadorJugadores = 0;
	private Integer contadorEntrenadores = 0;
	static Integer topeJugadores=23;
	static Integer topeCuerpoTecnico=6;
	
	private Double sumaSueldoJugadores =0.0; 
	
	private Double sumaPresupuesto=0.0;
	//private Presupuesto presupuesto1;
	
	
	
	//Constructor Del ArrayList
	public Equipo(ArrayList<Jugadores> listaJugadores, ArrayList<CuerpoTecnico> listaCuerpoTecnico) {
		this.listaJugadores = listaJugadores;
		this.listaCuerpoTecnico = listaCuerpoTecnico;
	}
	
	//Metodos de  Jugadores 
	
	//Agrego Jugador mientras que tengo menos de 23
	public Boolean AgregoJugador(Jugadores jugador1){
		if(topeJugadores<=listaJugadores.size()){
			
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
		contadorJugadores = listaJugadores.size();
		return contadorJugadores;
	}
	//SUMo los Sueldo De los Jugadores
	
public Double SumaDeSueldosDeJugadores(Jugadores jugador1){
		
		for(Jugadores e: listaJugadores){
			sumaSueldoJugadores= e.getSueldo();
		}
		return sumaSueldoJugadores;
		
	}
	
	

//Mostrar Lista De jugadores por Pantalla


public void MuestroListaJugadores(){
	System.out.println("PLANTEL:\n");
	for(Jugadores e: listaJugadores){
		
		System.out.println(e.getApellido()+" "+e.getNombre()+"\n");
		
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
	
	
	//Presupuesto
	public Double PresupuestoDelClub(Presupuesto presupuesto1){
		sumaPresupuesto = presupuesto1.getIngresoMarketing()+presupuesto1.getIngresoTV()+presupuesto1.getSponsors()+presupuesto1.getTickets();
		return sumaPresupuesto;
	}
	
	
	
	
	

}
