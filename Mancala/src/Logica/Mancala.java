package Logica;

public class Mancala {

	public int[][] tablero;

	public Mancala() {
		tablero = new int[2][8];

	}

	public int[][] getTablero() {
		return tablero;
	}

	public void setTablero(int[][] tablero) {
		this.tablero = tablero;
	}

}
