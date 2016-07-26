
public class ExperimentationScheme {

	public final static int numberExperiment = 1000;
	public final static int sizeGraph = 10;
	public final static int numberOfPaths = 5;
	public static int StarNode = -1;
	public static int EndNode = -1;

	public static void main(String[] args) {

		for (int j = 0; j < numberExperiment; j++) {
			
			for (int i = 0; i < numberOfPaths; i++) {

				StarNode = CreateGraph.getRandomNumber(sizeGraph - 1);
				EndNode = CreateGraph.getRandomNumber(sizeGraph - 1);

				System.out.println("Start Node " + StarNode + " -> " + "End Node " + EndNode);
				// crea un grafo aleatoriamente
				Graph p = CreateGraph.getRandomGraph(sizeGraph, 0);
				long[] time = new long[6];

				long init = System.nanoTime();


				DFS dfs = new DFS();
				System.out.print(dfs.startAlgorithmDFS(p, StarNode, EndNode));
				time[0] = System.nanoTime() - init;
				System.out.print(" Time -> " + time[0] + "\n");

				BFS bfs = new BFS();
				System.out.print(bfs.pathBFS(p, StarNode, EndNode));
				time[1] = System.nanoTime() - init;
				System.out.print(" Time -> " + time[1] + "\n");

				Ford ford = new Ford();
				System.out.print(ford.pathFord(p, StarNode, EndNode));
				time[2] = System.nanoTime() - init;
				System.out.print(" Time -> " + time[2] + "\n");

				Dijkstra dijkstra = new Dijkstra();
				System.out.print(dijkstra.pathDijkstra(p, StarNode, EndNode));
				time[3] = System.nanoTime() - init;
				System.out.print(" Time -> " + time[3] + "\n");

				DijkstraPriorityQueue dijkstraPriorityQueue = new DijkstraPriorityQueue();
				System.out.print(dijkstraPriorityQueue.pathDijkstraPriorityQueue(p, StarNode, EndNode));
				time[4] = System.nanoTime() - init;
				System.out.print(" Time -> " + time[4] + "\n");

				FloydWarshall floydWarshall = new FloydWarshall();
				System.out.print(floydWarshall.PathFloydWarshall(p, StarNode, EndNode));
				time[5] = System.nanoTime() - init;
				System.out.print("  Time -> " + time[5] + "\n");

				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
			}
		}
	}
}
