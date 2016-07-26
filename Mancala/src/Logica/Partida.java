package Logica;
public class Partida {
	public Mancala mancala;
	public int jugador1;
	public int jugador2;
	public int jugadorActual;
	public Reglas reglas;
	public String Tablero[][];
	public int filaA;
	public int columnaA;

	public Partida() {
		mancala = new Mancala();
		jugador1 = 0;
		jugador2 = 1;
		jugadorActual = 0;
		Tablero = new String[2][8];
		reglas = new Reglas(null);
		InicializarTablero();
	}

	public Mancala getMancala() {
		return mancala;
	}

	public void setMancala(Mancala mancala) {
		this.mancala = mancala;
	}

	public int getJugador1() {
		return jugador1;
	}

	public void setJugador1(int jugador1) {
		this.jugador1 = jugador1;
	}

	public int getJugador2() {
		return jugador2;
	}

	public void setJugador2(int jugador2) {
		this.jugador2 = jugador2;
	}

	public int getJugadorActual() {
		return jugadorActual;
	}

	public void setJugadorActual(int jugadorActual) {
		this.jugadorActual = jugadorActual;
	}

	public Reglas getReglas() {
		return reglas;
	}

	public void setReglas(Reglas reglas) {
		this.reglas = reglas;
	}

	public String[][] getTablero() {
		mostrar();
		return Tablero;
	}

	public void setTablero(String[][] tablero) {
		Tablero = tablero;
	}

	public int getFilaA() {
		return filaA;
	}

	public void setFilaA(int filaA) {
		this.filaA = filaA;
	}

	public int getColumnaA() {
		return columnaA;
	}

	public void setColumnaA(int columnaA) {
		this.columnaA = columnaA;
	}

	private void InicializarTablero() {
		for (int i = 0; i < mancala.getTablero().length; i++) {
			for (int j = 0; j < mancala.getTablero()[i].length; j++) {
				if (j != 0 && j != (mancala.getTablero()[0].length - 1)) {
					mancala.getTablero()[i][j] = 4;
				} else {
					mancala.getTablero()[i][j] = 0;
				}
			}
		}
	}

	public void inicializarTurno(int fila, int columna) {
		int cantidad = mancala.getTablero()[fila][columna];
		mancala.getTablero()[fila][columna] = 0;
		if (fila == 0) {
			turno(fila, columna - 1, cantidad);
		} else {
			turno(fila, columna + 1, cantidad);
		}
	}

	public void turnoJuagador() {
		if (jugadorActual == jugador1) {
			jugadorActual = 1;
		} else {
			jugadorActual = 0;
		}
	}

	public void turno(int fila, int columna, int piedras) {
		if (piedras == 0) {
			filaA = fila;

			if (fila == 0) {
				columnaA = columna + 1;

			}
			if (fila == 1) {
				columnaA = columna - 1;

			}

			return;
		} else {
			mancala.getTablero()[fila][columna] = mancala.getTablero()[fila][columna] + 1;
			if ((columna == 0) || (columna == 7)) {

				if (fila == 0) {
					mancala.getTablero()[1][0] = mancala.getTablero()[0][0];
					if (piedras == 1) {
						filaA = fila;
						columnaA = columna;
						return;
					} else {
						turno(1, 1, piedras - 1);
					}

				} else if (fila == 1) {

					mancala.getTablero()[0][7] = mancala.getTablero()[1][7];
					if (piedras == 1) {
						filaA = fila;
						columnaA = columna;
						return;
					} else {
						turno(0, 6, piedras - 1);
					}

				}
			} else {
				// mancala.getTablero()[fila][columna] =
				// mancala.getTablero()[fila][columna] + 1;
				if (fila == 0) {
					turno(fila, columna - 1, piedras - 1);
				}
				if (fila == 1) {
					turno(fila, columna + 1, piedras - 1);
				}
			}
		}

	}

	public void comprobarReglas() {
		reglas.setMancala(mancala);
		if (reglas.turnoLibre(columnaA) == false) {

			turnoJuagador();
		}
		reglas.capturar(filaA, columnaA, jugadorActual);
		mancala = reglas.getMancala();

		reglas.hayGanador();

	}

	public void mostrar() {
		for (int i = 0; i < mancala.getTablero().length; i++) {
			for (int j = 0; j < mancala.getTablero()[i].length; j++) {
				Tablero[i][j] = mancala.getTablero()[i][j] + " ";
				// System.out.print(mancala.getTablero()[i][j] + " ");
			}
			// System.out.println();
		}
		// System.out.println();

	}

}
