
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Graph {

	public int numberNode;
	public int[][] adjacencyMatrix;

	public Graph(int numberNode) {

		this.numberNode = numberNode;
		adjacencyMatrix = new int[numberNode][numberNode];
	}

	public int getnumberNode() {
		return numberNode;
	}

	public void setnumberNode(int numberNode) {
		this.numberNode = numberNode;
	}

	public int[][] getadjacencyMatrix() {
		return adjacencyMatrix;
	}

	public void setadjacencyMatrix(int[][] adjacencyMatrix) {
		this.adjacencyMatrix = adjacencyMatrix;
	}

	public void initializeMatrix() {
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			for (int j = 0; j < adjacencyMatrix[i].length; j++) {
				
				System.out.println(adjacencyMatrix[i][j]);
			}
		}
	}

	public void addEdge(int a, int b) {

		adjacencyMatrix[a][b] = 1;
		adjacencyMatrix[b][a] = 1;

	}

	public void deleteEdge(int a, int b) {

		adjacencyMatrix[a][b] = 0;
		adjacencyMatrix[b][a] = 0;
	}

	public int haveAdjacency(int n) {
		int[] fileNode = adjacencyMatrix[n];
		int p =0;
		for (int i = 0; i < fileNode.length; i++) {
			if(fileNode[i]== 1){
				p++;
			}
				
		}
		return p;
	}

	public int size() {
		int number = 0;
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			for (int j = 0; j < adjacencyMatrix[i].length; j++) {
				if (adjacencyMatrix[i][j] == 1) {
					number++;
				}
			}
		}
		return number;

	}

	public void toTxt() {
		String root = "Grahp.txt";

		try {

			PrintWriter write = new PrintWriter(root);

			write.write(numberNode + "");
			write.println();
			for (int i = 0; i < adjacencyMatrix.length; i++) {
				for (int j = 0; j < adjacencyMatrix[i].length; j++) {
					write.write(adjacencyMatrix[i][j] + " ");
				}
				write.println();
			}
			write.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
