package ar.edu.unlam.pb2;

public class Main {

	public static void main(String[] args) {
	
		Equipo equipo1 = new Equipo("Los Desteñidos");
		Presupuesto presupuesto1 = new Presupuesto(120.0,1110.0,2500.0,50000.0);
		Jugadores jugador1 = new Jugadores("Gaston", "Santos", 1000.0, 33, "LI", "zurdo");
		Jugadores jugador2 = new Jugadores("Juan", "Anantos", 1500.0, 5, "Mi", "Derecho");
		Jugadores jugador3 = new Jugadores("Gaston", "Santos", 1000.0, 33, "LI", "zurdo");
		
		equipo1.AgregoJugador(jugador1);
		equipo1.AgregoJugador(jugador2);
		equipo1.AgregoJugador(jugador3);
		equipo1.ContadorJugadores();
		
		equipo1.PresupuestoDelClub(presupuesto1);
		equipo1.ListaDeJugadoresSinRepetidos();
		//equipo1.MuestroListaJugadores();
		equipo1.NombreEnMayuscula();
		//equipo1.SumaDeSueldosDeJugadores();
		//equipo1.FinanzasDelClub();
		
		
		
	

	}

}
