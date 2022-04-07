package co.edu.unbosque.tictactoe;

public class Tablero {
	String[][] tablero = {{"[]", "[]", "[]"},
	 					  {"[]", "[]", "[]"},
	 					  {"[]", "[]", "[]"}};
			
	public void showBoard() {
		for(int fila = 0; fila < tablero.length; fila++) {
			for(int col = 0; col < tablero[fila].length; col++) {
				System.out.println();
			}
		}
	}
}
