import java.util.Random;
import java.util.concurrent.Semaphore;

public class Race extends Thread { // clase carrera que extiende de la clase abstracta Thread

	private Semaphore witness ; // Objecto de tipo semaforo que controla el acceso al metodo run
	private String athlete; // objecto atleta

	/* Contructor de la clase carrera recibe un alteta y un semaforo por parametro */
	public Race(String athlete, Semaphore witness) {

		this.athlete = athlete;
		this.witness = witness;
	}
	/* metodo run donde se ejecuta la carrera*/
	public void run() {
		
		try {
			witness.acquire(); // miestras el testigo(semaphore) sea mayor a cero permite la entrada del hilo(atleta)
			int time =time(); // variable q guarda el tiempo por atleta
			System.out.println("The athlete is running : " +athlete);
			Thread.sleep(time); // para la ejecucion del hilo por el tiempo que le tomo al atleta (9-11 ) segundos
			System.out.println("Athlete time was :" +time +" miliseconds"+ "\n");
			witness.release(); // libera el semaphore para que pueda accerder otro hilo

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // captura el error
		}

	}
	/* metodo que calcula el tiempo por atleta de forma aleatoria entre 9 y 11 segundos */
	public int time(){
		Random rnd = new Random(); //objecto random
		return ((int) (rnd.nextDouble() * 3 + 9) * 1000); // funcion de tiempo
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaphore witness = new Semaphore(1); // delcaracion del semaforo  prmitiendo solo 1 hilo ala vez
		
		
		/* declaracon de los 4(atletas) hilos  */
		Thread one = new Race("1",witness); 
		Thread two = new Race("2",witness);
		Thread three = new Race("3",witness);
		Thread four = new Race("4",witness);
		
		/* inicio de los hilos */
		one.start();
		two.start();
		three.start();
		four.start();
	}

}
