package Feedback;

import java.util.ArrayList;

//Clase para almacenar datos estaticos de la partida
public class DatosPartida {
	//La variable numeroJugadores sera igual al resultado escrito por texto en la lamina LaminaEleccionJugadores
	static int numeroJugadores = 1;
	//La variable contadorJugadores se ira sumando en el actionListener de la lamina LaminaJugadorNuevo
	static int contadorJugadores = 1;
	//ArrayList que almacena jugadores de la clase Jugador
	static ArrayList<Jugador> jugadores = new ArrayList<>();
}
