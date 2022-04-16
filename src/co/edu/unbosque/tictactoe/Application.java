package co.edu.unbosque.tictactoe;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Tablero tablero = new Tablero();
		Jugador JugX = new Jugador(); //Jugador 1
		Jugador JugO = new Jugador(); //Jugador 2
		
		//boolean ganaX = tablero.getGanaX();
		//boolean ganaO = tablero.getGanaO(); Descontinuado
		boolean hayGanador = tablero.getHayGanador();
		
		System.out.println("Ingrese el nombre del jugador 1");
		String nombreJugX = sc.nextLine();
		System.out.println("Ingrese el nombre del jugador 2");
		String nombreJugO = sc.nextLine();
		
		JugX.setNombre(nombreJugX);
		JugX.setEquipo("X");
		
		JugO.setNombre(nombreJugO);
		JugO.setEquipo("O");
		
		System.out.println("Instrucciones: ");
		System.out.println("- Ingrese las coordenadas para poner su ficha");
		System.out.println("- Se actualiza el tablero cada jugada");
		System.out.println("- " + JugX.getNombre() + ": X 	" + JugO.getNombre()+  ": O");
		System.out.println("Tablero: ");
		tablero.showBoard();
		
		while(hayGanador == false) {
			System.out.println("Ahora: " + JugX.getNombre());
			System.out.println("Ingrese la fila: ");
			int filaX = sc.nextInt();
			System.out.println("Ingrese la columna: ");
			int colX = sc.nextInt();
			
			tablero.addX(filaX, colX);
			if(tablero.comprobarGanador("[X]")) {
				System.out.println("El ganador es: " + JugX.getNombre());
				break;
			}
			
			
			System.out.println("Ahora " + JugO.getNombre());
			System.out.println("Ingrese la fila: ");
			int filaO = sc.nextInt();
			System.out.println("Ingrese la columna: ");
			int colO = sc.nextInt();
			
			tablero.addO(filaO, colO);
			if(tablero.comprobarGanador("[O]")) {
				System.out.println("El ganador es: " + JugO.getNombre());
				break;
			}
			
		}
	
		/*
		ganaX = tablero.getGanaX();
		ganaO = tablero.getGanaO();
		
		if(ganaX == true) {
			System.out.println("El ganador es: " + JugX.getNombre());
																			//Descontinuado, se us� con los for
		}
		if(ganaO == true) {
			System.out.println("El ganador es: " + JugO.getNombre());
		}
		*/
		
		
	}

}
