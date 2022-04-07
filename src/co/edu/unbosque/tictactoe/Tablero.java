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
	
	
	public boolean comprobarGanador() {
		//Validar columnas
		for(int fila = 0; fila < tablero.length; fila++) {
			for(int col = 0; col < tablero.length; col++) {
				if(tablero[fila][col].equals("[X]") && tablero[fila][col].equals("[X]") && tablero[fila][col].equals("[X]")) {
					ganaX = true;
				}
				else if(tablero[fila][col].equals("[O]") && tablero[fila][col].equals("[O]") && tablero[fila][col].equals("[O]")) {
					ganaO = true;
				}
				else {
					ganaX = false;
					ganaO = false;
				}
			}
			
		}
		//Validar filas
		
		for(int col = 0; col <= tablero[0].length; col++) {
			if(tablero[0][0].equals("[X]") && tablero[1][0].equals("[X]") && tablero[2][0].equals("[X]")) {
				ganaX = true;
			}
			else if(tablero[0][0].equals("[O]") && tablero[1][0].equals("[O]") && tablero[2][0].equals("[O]")) {
				ganaO = true;
			}
			else {
				ganaX = false;
				ganaO = false;
			}
		}
		//Validar diagonales
		
		if(tablero[0][0].equals("[X]") && tablero[1][1].equals("[X]") && tablero[2][2].equals("[X]")) {
			ganaX = true;
		}
		else if(tablero[0][0].equals("[O]") && tablero[1][1].equals("[O]") && tablero[2][2].equals("[O]")) {
			ganaO = true;
		}
		//Validar la otra diagonal
		if(tablero[0][2].equals("[X]") && tablero[1][1].equals("[X]") && tablero[2][0].equals("[X]")) {
			ganaX = true;
		}
		else if(tablero[0][2].equals("[O]") && tablero[1][1].equals("[O]") && tablero[2][0].equals("[O]")) {
			ganaO = true;
		}
		
		
		if(ganaX) {
			return ganaX;
		}
		else if(ganaO) {
			return ganaO;
		}
		else {
			return false;
		}
	}
	
	public boolean getGanaX() {
		return this.ganaX;
	}
	public boolean getGanaO() {
		return this.ganaO;
	}
}
