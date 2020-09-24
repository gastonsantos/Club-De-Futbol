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
	
	@Test
	public void TestQueBuscaJugadorCorrectamente() {
		Equipo equipo1 = new Equipo("Los perdedores");
		Jugadores jugador1 = new Jugadores("Gaston", "Santos", 1000.0, 33, "LI", "zurdo");
		Jugadores jugador2 = new Jugadores("Juan", "Pergamino", 1500.0, 5, "Mi", "Derecho");
		Jugadores jugador3 = new Jugadores("Gaston", "Santosa", 1000.0, 33, "LI", "zurdo");
		
		equipo1.AgregoJugador(jugador1);
		equipo1.AgregoJugador(jugador2);
		equipo1.AgregoJugador(jugador3);
		equipo1.ListaDeJugadoresSinRepetidos();
		
		
		assertTrue(equipo1.BuscarJugador("Santos"));
		
	}
	@Test
	public void TestQueBuscaJugadorYNoEncuentra(){
		Equipo equipo1 = new Equipo("Los perdedores");
		Jugadores jugador1 = new Jugadores("Gaston", "Santos", 1000.0, 33, "LI", "zurdo");
		Jugadores jugador2 = new Jugadores("Juan", "Pergamino", 1500.0, 5, "Mi", "Derecho");
		equipo1.AgregoJugador(jugador1);
		equipo1.AgregoJugador(jugador2);
		assertFalse(equipo1.BuscarJugador("Guzman"));
		
	}

	
	@Test
	public void TestQueSumaSueldoDeCuerpoTecnico() {
		
		Equipo equipo1 = new Equipo ("Los PAPACHULOS");
		CuerpoTecnico tecnico1 = new CuerpoTecnico("Julio", "Falcioni", 300.00, 56,"DIRECTOR TECNICO");
		CuerpoTecnico tecnico2 = new CuerpoTecnico("Perez", "Acuña", 350.00, 66,"DIRECTOR DEPORTIVO");
		equipo1.AgregarIntegranteDeCT(tecnico1);
		equipo1.AgregarIntegranteDeCT(tecnico2);
		Double valorEsperado= 650.00;
		Double valorObtenido = equipo1.sumoSueldoCuerpoTecnico();
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void TestQueCuentaCorrectamenteLasFinanzasDelClub() {
		Equipo equipo1 = new Equipo ("Los PAPACHULOS");
		Jugadores jugador1 = new Jugadores("Gaston", "Santos", 1000.0, 33, "LI", "zurdo");
		Jugadores jugador2 = new Jugadores("Juan", "Pergamino", 1000.0, 5, "Mi", "Derecho");
		Jugadores jugador3 = new Jugadores("Gaston", "Santosa", 1000.0, 33, "LI", "zurdo");
		CuerpoTecnico tecnico1 = new CuerpoTecnico("Julio", "Falcioni", 1000.00, 56,"DIRECTOR TECNICO");
		CuerpoTecnico tecnico2 = new CuerpoTecnico("Perez", "Acuña", 500.00, 66,"DIRECTOR DEPORTIVO");
		equipo1.AgregarIntegranteDeCT(tecnico1);
		equipo1.AgregarIntegranteDeCT(tecnico2);
		equipo1.AgregoJugador(jugador1);
		equipo1.AgregoJugador(jugador2);
		equipo1.AgregoJugador(jugador3);
		Presupuesto presupuesto1 = new Presupuesto (200.00,500.00,340.0,600.00);
		equipo1.SumaDeSueldosDeJugadores();
		equipo1.sumoSueldoCuerpoTecnico();
		presupuesto1.SumaDePresupuesto();
		Double valorEsperado = -2860.00;
		Double valorObtenido= equipo1.FinanzasDelClub(presupuesto1);
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	@Test
	public void testQueElCLubEstaEnBancarrota(){
		Equipo equipo1 = new Equipo ("Los PAPACHULOS");
		Jugadores jugador1 = new Jugadores("Gaston", "Santos", 1000.0, 33, "LI", "zurdo");
		Jugadores jugador2 = new Jugadores("Juan", "Pergamino", 1000.0, 5, "Mi", "Derecho");
		CuerpoTecnico tecnico1 = new CuerpoTecnico("Julio", "Falcioni", 1000.00, 56,"DIRECTOR TECNICO");
		equipo1.AgregoJugador(jugador1);
		equipo1.AgregoJugador(jugador2);
		equipo1.AgregarIntegranteDeCT(tecnico1);
		Presupuesto presupuesto1 = new Presupuesto (200.00,500.00,340.0,600.00);
		equipo1.SumaDeSueldosDeJugadores();
		equipo1.sumoSueldoCuerpoTecnico();
		presupuesto1.SumaDePresupuesto();
		equipo1.FinanzasDelClub(presupuesto1);
		assertTrue(equipo1.bancaRota());
	}
	@Test
	public void testQueElClubNoEstaEnBancarota(){
		
		Equipo equipo1 = new Equipo ("Los PAPACHULOS");
		Jugadores jugador1 = new Jugadores("Gaston", "Santos", 1000.0, 33, "LI", "zurdo");
		Jugadores jugador2 = new Jugadores("Juan", "Pergamino", 1000.0, 5, "Mi", "Derecho");
		CuerpoTecnico tecnico1 = new CuerpoTecnico("Julio", "Falcioni", 1000.00, 56,"DIRECTOR TECNICO");
		equipo1.AgregoJugador(jugador1);
		equipo1.AgregoJugador(jugador2);
		equipo1.SumaDeSueldosDeJugadores();
		equipo1.AgregarIntegranteDeCT(tecnico1);
		equipo1.sumoSueldoCuerpoTecnico();
		Presupuesto presupuesto1 = new Presupuesto (200.00,500.00,340.0,600000.00);
		presupuesto1.SumaDePresupuesto();
		equipo1.FinanzasDelClub(presupuesto1);
		
		assertFalse(equipo1.bancaRota());
	}


}

