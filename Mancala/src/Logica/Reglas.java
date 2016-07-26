package Logica;
public class Reglas {
	public Mancala mancala;
	public Boolean turnoLibre;

	public Reglas(Mancala mancala) {
		this.mancala = mancala;
		turnoLibre = false;
	}

	public Mancala getMancala() {
		return mancala;
	}

	public void setMancala(Mancala mancala) {
		this.mancala = mancala;
	}

	public Boolean getTurnoLibre() {
		return turnoLibre;
	}

	public void setTurnoLibre(boolean turnoLibre) {
		this.turnoLibre = turnoLibre;
	}

	public void capturar(int fila, int columna, int jugador) {
		int piedrasCapturadas = 0;

		if (mancala.getTablero()[fila][columna] == 1 && columna > 0 && columna < 7) {

			if (fila == 0) {
				piedrasCapturadas = mancala.getTablero()[1][columna];
				if (piedrasCapturadas > 0 && jugador == 1) {
					mancala.getTablero()[0][0] = mancala.getTablero()[0][0] + piedrasCapturadas + 1;
					mancala.getTablero()[1][0] = mancala.getTablero()[0][0];
					mancala.getTablero()[1][columna] = 0;
					mancala.getTablero()[0][columna] = 0;
				}
			} else {
				piedrasCapturadas = mancala.getTablero()[0][columna];
				if (piedrasCapturadas > 0 && jugador == 0) {
					mancala.getTablero()[1][7] = mancala.getTablero()[1][7] + piedrasCapturadas + 1;
					mancala.getTablero()[0][7] = mancala.getTablero()[1][7];
					mancala.getTablero()[0][columna] = 0;
					mancala.getTablero()[1][columna] = 0;
				}

			}
		}
	}

	public boolean turnoLibre(int columna) {
		boolean turnoLibre = false;

		if (columna == 0 || columna == 7) {
			turnoLibre = true;
		}
		return turnoLibre;
	}

	public boolean hayGanador() {
		boolean ganador = false;
		int jugador1 = mancala.getTablero()[0][0];
		int jugador2 = mancala.getTablero()[1][7];
		int PiedrasTablero = 0;
		for (int i = 0; i < mancala.getTablero().length; i++) {
			for (int j = 1; j < mancala.getTablero()[0].length - 1; j++) {
				PiedrasTablero += mancala.getTablero()[i][j];
			}
		}
		// System.out.println(PiedrasTablero);
		if (jugador1 > jugador2 + PiedrasTablero) {
			ganador = true;

		}
		if (jugador2 > jugador1 + PiedrasTablero) {
			ganador = true;

		}
		return ganador;
	}

}
