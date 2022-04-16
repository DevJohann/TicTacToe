package co.edu.unbosque.tictactoe;

public class Tablero {
	String[][] tablero = {{"[ ]", "[ ]", "[ ]"},
	 					  {"[ ]", "[ ]", "[ ]"}, //Tablero como matriz cuadrada 3x3
	 					  {"[ ]", "[ ]", "[ ]"}};
	
	//private boolean ganaX = false; //Se usó con el for
	//private boolean ganaO = false; //Se usó con el for 
	private boolean hayGanador = false;
			
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
						if(tablero[i][j].equals("[O]") || tablero[i][j].equals("[X]")) { //Evitar que se sobrepongan fichas
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
	
	
	public boolean comprobarGanador(String firma) {
		//Validar filas
		if(tablero[0][0].equals(firma) && tablero[0][1].equals(firma) && tablero[0][2].equals(firma)) {
			//System.out.println("El ganador es el de las fichas: " + firma);
			hayGanador = true;
		}
		else if(tablero[1][0].equals(firma) && tablero[1][1].equals(firma) && tablero[1][2].equals(firma)) {
			//System.out.println("El ganador es el de las fichas: " + firma);
			hayGanador = true;
		}
		else if(tablero[2][0].equals(firma) && tablero[2][1].equals(firma) && tablero[2][2].equals(firma)) {
			//System.out.println("El ganador es el de las fichas: " + firma);
			hayGanador = true;
		}
		
		//Validar columas
		else if(tablero[0][0].equals(firma) && tablero[1][0].equals(firma) && tablero[2][0].equals(firma)) {
			//System.out.println("El ganador es el de las fichas " + firma);
			hayGanador = true;
		}
		else if(tablero[0][1].equals(firma) && tablero[1][1].equals(firma) && tablero[2][1].equals(firma)) {
			//System.out.println("El ganador es el de las fichas " + firma);
			hayGanador = true;
		}
		else if(tablero[0][2].equals(firma) && tablero[1][2].equals(firma) && tablero[2][2].equals(firma)) {
			//System.out.println("El ganador es el de las fichas " + firma);
			hayGanador = true;
		}
		//Validar diagonal principal
		else if(tablero[0][0].equals(firma) && tablero[1][1].equals(firma) && tablero[2][2].equals(firma)) {
			//System.out.println("El ganador es el de las fichas " + firma);
			hayGanador = true;
		}
		//Validar diagonal secundaria
		else if(tablero[0][2].equals(firma) && tablero[1][1].equals(firma) && tablero[2][0].equals(firma)) {
			//System.out.println("El ganador es el de las fichas " + firma);
			hayGanador = true;
		}
		else {
			hayGanador = false;
		}
		return hayGanador;
		/* Se eliminó el for porque era muy complicado, más de lo necesario
		for(int fila = 0; fila < tablero.length; fila++) {
			for(int col = 0; col < tablero.length; col++) {
				if(tablero[0][col].equals("[X]") && tablero[1][col].equals("[X]") && tablero[2][col].equals("[X]")) {
					ganaX = true;
				}
				else if(tablero[0][col].equals("[O]") && tablero[12][col].equals("[O]") && tablero[0][col].equals("[O]")) {
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
		*/
	}
	
	//public boolean getGanaX() {
		//return this.ganaX;
	//}
	//public boolean getGanaO() { Se usó con los for
		//return this.ganaO;
	//}
	public boolean getHayGanador() {
		return this.hayGanador;
	}
}
