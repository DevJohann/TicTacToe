package co.edu.unbosque.tictactoe;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Tablero tablero = new Tablero();
		Jugador JugX = new Jugador(); //Jugador 1
		Jugador JugO = new Jugador(); //Jugador 2
		
		boolean ganaX = tablero.getGanaX();
		boolean ganaO = tablero.getGanaO();
		
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
		
		while(ganaX == false && ganaO == false) {
			System.out.println("Ahora: " + JugX.getNombre());
			System.out.println("Ingrese la fila: ");
			int filaX = sc.nextInt();
			System.out.println("Ingrese la columna: ");
			int colX = sc.nextInt();
			
			tablero.comprobarGanador(nombreJugX, nombreJugO);
			ganaX = tablero.getGanaX();
			ganaO = tablero.getGanaO();
			if(ganaX || ganaO) {
				break;
			}
			
			tablero.addX(filaX, colX);
			
			System.out.println("Ahora " + JugO.getNombre());
			System.out.println("Ingrese la fila: ");
			int filaO = sc.nextInt();
			System.out.println("Ingrese la columna: ");
			int colO = sc.nextInt();
			
			tablero.addO(filaO, colO);
			
			tablero.comprobarGanador(nombreJugX, nombreJugO);
			ganaX = tablero.getGanaX();
			ganaO = tablero.getGanaO();
			
			if(ganaX || ganaO) {
				break;
			}
			
			System.out.println("Ahora " + JugX.getNombre());
		}
		
		if(ganaX == true) {
			System.out.println("El ganador es: " + JugX.getNombre());
			
		}
		if(ganaO == true) {
			System.out.println("El ganador es: " + JugO.getNombre());
		}
		
		
		
	}

}
