package co.edu.unbosque.tictactoe;

public class Tablero {
	String[][] tablero = {{"[ ]", "[ ]", "[ ]"},
	 					  {"[ ]", "[ ]", "[ ]"},
	 					  {"[ ]", "[ ]", "[ ]"}};
	
	boolean ganaX = false;
	boolean ganaO = false;
			
	public void showBoard() {
		for(int fila = 0; fila < tablero.length; fila++) {
			for(int col = 0; col < tablero[fila].length; col++) {
				System.out.print(tablero[fila][col]);
			}
			System.out.println();
		}
	}
	
	public void addX(int fila, int col) {
		for(int i = 0; i < tablero.length; i++) {
			if(i == fila) {
				for(int j = 0; j < tablero[i].length; j++) {
					if(j == col) {
						if(tablero[i][j].equals("[O]") || tablero[i][j].equals("[X]")) {
							System.out.println("Error, esa casilla está ocupada");
							break;
						}
						else {
							tablero[i][j] = "[X]";
							break;	
						}
						
					}
				}
				break;
			}
		}
		showBoard();
	}
	
	
	public void addO(int fila, int col) {
		for(int i = 0; i < tablero.length; i++) {
			if(i == fila) {
				for(int j = 0; j < tablero[i].length; j++) {
					if(j == col) {
						if(tablero[i][j].equals("[O]") || tablero[i][j].equals("[X]")) {
							System.out.println("Error, esa casilla está ocupada");
							break;
						}
						else {
							tablero[i][j] = "[O]";
							break;	
						}
					}
				}
				break;
			}
		}
		showBoard();
	}
	
	int contadorX = 0;
	public void comprobarGanador(String nombreX, String nombreO) {
		for(int fila = 0; fila < tablero.length; fila++) {
			for(int col = 0; fila < tablero[fila].length; col++) {
				
			}
		}
	}
	
	public boolean getGanaX() {
		return this.ganaX;
	}
	public boolean getGanaO() {
		return this.ganaO;
	}
}
