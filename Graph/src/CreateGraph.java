import java.util.*;

public class CreateGraph {


	public static  int getRandomNumber(int max) {
		int number = 0;
		Random rnd = new Random();
		number = (int) (rnd.nextDouble() * (max + 1));
		return number;
	}

	public static Graph getRandomGraph(int n, double p) {

		Graph newGraph = new Graph(n);
		int b = 0;
		for (int i = 0; i < n; i++) {
			b = getRandomNumber(n - 1);
			
			if (i != b) {
				newGraph.addEdge(i, b);
				newGraph.addEdge(b, i);
			}else{
				while(i== b){
					b = getRandomNumber(n - 1);
				}
				newGraph.addEdge(i, b);
				newGraph.addEdge(b, i);
			}
		}
		return newGraph;
	}
}
