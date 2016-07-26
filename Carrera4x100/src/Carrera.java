
import java.util.Random;

public class Carrera extends Thread {

	public static String testigo = "testigo"; // nombre del objecto testigo 
	public String atleta; //objecto atleta
	public static int last = 0; // variable que guarda la cantidad de Altetas que ya terminaron 
	public static int racetime = 0; // variable que guarda la cantidad el tiempo que duro la carrera 

	public Carrera(String s) {
		atleta = s;
	}

	public synchronized void run() {
		synchronized (Carrera.class) {// el hilo atleta obtiene el control del metodo
			Random rnd = new Random();//Objecto para generar numeros aleatorios
			int time;//variable para guadar el tiempo por atleta

			try {
				time = ((int) (rnd.nextDouble() * 3 + 9) * 1000); // calcula el tiempo aleaotoriamente por cada altlta entre 9 y 11 segundos
				getClass().notifyAll();// notifica a todos q ha terminado
				racetime+= (time/1000);
				System.out.println("El corredor -> " + atleta + " tiene el " + testigo);
				System.out.println("El tiempo del corredor -> " + atleta + " fue : " + time / 1000 + " segundos");
				Thread.sleep(time); //para el la ejecucion del hilo tanto tiempo como el valor de la variable time
				last++; //aumeta en uno la varible para saber si ya es el ultimo corredor
				if (last == 4) {
					System.out.println("Termino La carrera en -> "+racetime+" segundos");
				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();// si se presenta un error lo captura y los muestra
			}

		}
	}

	public static void main(String[] args) {

		Thread atleta1 = new Carrera("1");
		Thread atleta2 = new Carrera("2");
		Thread atleta3 = new Carrera("3");
		Thread atleta4 = new Carrera("4");

		atleta1.start();
		atleta2.start();
		atleta3.start();
		atleta4.start();

	}

}
