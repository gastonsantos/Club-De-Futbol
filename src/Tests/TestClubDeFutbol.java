package Tests;
import ar.edu.unlam.pb2.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestClubDeFutbol {

	@Test
	public void testQueAgregaJugador() {
		Equipo equipo1 = new Equipo("Los perdedores");
		Jugadores jugador1 = new Jugadores("Gaston", "Perez", 1000.0, 33, "LI", "zurdo");
		Jugadores jugador2 = new Jugadores("Juan", "Pergamino", 1500.0, 5, "Mi", "Derecho");
		Jugadores jugador3 = new Jugadores("Gaston", "Santos", 1000.0, 33, "LI", "zurdo");
		
		equipo1.AgregoJugador(jugador1);
		equipo1.AgregoJugador(jugador2);
		equipo1.AgregoJugador(jugador3);
		Integer valorObtenido = equipo1.ContadorJugadores();
		Integer valorEsperado = 3;
		assertEquals(valorEsperado, valorObtenido);
	
	}
	
	@Test
	public void testQueEliminoJugador() {
		Equipo equipo1 = new Equipo("Los perdedores");
		Jugadores jugador1 = new Jugadores("Gaston", "Perez", 1000.0, 33, "LI", "zurdo");
		Jugadores jugador2 = new Jugadores("Juan", "Pergamino", 1500.0, 5, "Mi", "Derecho");
		Jugadores jugador3 = new Jugadores("Gaston", "Santos", 1000.0, 33, "LI", "zurdo");
		
		equipo1.AgregoJugador(jugador1);
		equipo1.AgregoJugador(jugador2);
		equipo1.AgregoJugador(jugador3);
		equipo1.EliminoJugador(jugador1);
		Integer valorObtenido = equipo1.ContadorJugadores();
		Integer valorEsperado = 2;
		assertEquals(valorEsperado, valorObtenido);
		
	}
	@Test
	public void testQueSumaLosSueldosDeLosJugaores() {
		Equipo equipo1 = new Equipo("Los perdedores");
		Jugadores jugador1 = new Jugadores("Gaston", "Perez", 1000.0, 33, "LI", "zurdo");
		Jugadores jugador2 = new Jugadores("Juan", "Pergamino", 1500.0, 5, "Mi", "Derecho");
		Jugadores jugador3 = new Jugadores("Gaston", "Santos", 1000.0, 33, "LI", "zurdo");
		
		equipo1.AgregoJugador(jugador1);
		equipo1.AgregoJugador(jugador2);
		equipo1.AgregoJugador(jugador3);
		
		
		Double valorEsperado= 3500.00;
		Double valorObtenido = equipo1.SumaDeSueldosDeJugadores();
		assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	public void ContadorDeListaDeJugadoresSinRepetidos() {
		
		Equipo equipo1 = new Equipo("Los perdedores");
		Jugadores jugador1 = new Jugadores("Gaston", "Santos", 1000.0, 33, "LI", "zurdo");
		Jugadores jugador2 = new Jugadores("Juan", "Pergamino", 1500.0, 5, "Mi", "Derecho");
		Jugadores jugador3 = new Jugadores("Gaston", "Santos", 1000.0, 33, "LI", "zurdo");
		
		equipo1.AgregoJugador(jugador1);
		equipo1.AgregoJugador(jugador2);
		equipo1.AgregoJugador(jugador3);
		equipo1.ListaDeJugadoresSinRepetidos();
		Integer valorEsperado= 2;
		Integer valorObtenido =equipo1.ContadorDeListaSinRepetidos();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	
	
	

}
