import java.util.ArrayList;

public class GraphList {

	public ArrayList<ArrayList<Integer>> adjacencyList;

	public GraphList(int n) {
		adjacencyList = new ArrayList<>();
		initializeList(n);
	}

	public ArrayList<ArrayList<Integer>> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(ArrayList<ArrayList<Integer>> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}

	public void initializeList(int n) {
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> p = new ArrayList<>();
			adjacencyList.add(p);
		}
	}

	public void addEdge(int a, int b) {

		adjacencyList.get(a).add(b);
		adjacencyList.get(b).add(a);

	}

	public void deleteEdge(int a, int b) {
		for (Integer index : adjacencyList.get(a)) {
			if (index == b) {
				adjacencyList.get(a).remove(index);
			}
		}
		for (Integer index : adjacencyList.get(b)) {
			if (index == a) {
				adjacencyList.get(b).remove(index);
			}
		}
	}

	public int size() {
		int number = 0;
		for (ArrayList<Integer> arrayList : adjacencyList) {
			number += arrayList.size();
		}

		return number;

	}

}
