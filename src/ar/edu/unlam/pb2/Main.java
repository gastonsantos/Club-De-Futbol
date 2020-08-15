package ar.edu.unlam.pb2;

public class Main {

	public static void main(String[] args) {
	
		Equipo equipo1 = new Equipo("Los Desteñidos");
		Jugadores jugador1 = new Jugadores("Gaston", "Santos", 1000.0, 33, "LI", "zurdo");
		Jugadores jugador2 = new Jugadores("Juan", "Santos", 1500.0, 5, "Mi", "Derecho");
		
		equipo1.AgregoJugador(jugador1);
		equipo1.AgregoJugador(jugador2);
		
		equipo1.ContadorJugadores();
		equipo1.MuestroListaJugadores();
		equipo1.SumaDeSueldosDeJugadores();
	

	}

}
