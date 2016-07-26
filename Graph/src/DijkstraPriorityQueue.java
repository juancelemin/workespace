import java.util.ArrayList;

public class DijkstraPriorityQueue {


	public String pathDijkstraPriorityQueue(Graph v, int nodeStart, int nodeEnd) {
		int[] predecessor = new int[v.getnumberNode()];
		boolean[] visited = new boolean[v.getnumberNode()];
		int[] distance = new int[v.getnumberNode()];
		ArrayList<Integer> queue = new ArrayList<>();
		for (int i = 0; i < distance.length; i++) {
			predecessor[i] =-1;
		}

		int vertex = 0;
		for (int i = 0; i < distance.length; i++) {
			if (i == nodeStart) {
				predecessor[nodeStart] = nodeStart;
			} else {
				distance[i] = Integer.MAX_VALUE - 1;
			}
		}

		queue.add(nodeStart);
		while (!queue.isEmpty()) {
			vertex = queue.get(lessVertex(queue, distance));
			queue.remove(lessVertex(queue, distance));
			visited[nodeStart] = true;
			for (int i = 0; i < v.getnumberNode(); i++) {
				if (!visited[i] && v.getadjacencyMatrix()[vertex][i] == 1) {
					if (distance[i] > distance[vertex] + 1) {
						distance[i] = distance[vertex] + 1;
						predecessor[i] = vertex;
						queue.add(i);
					}
				}
			}

		}
		String path = "";
		try {
			while (nodeEnd != nodeStart) {
				path = nodeEnd + " " + path;
				nodeEnd = predecessor[nodeEnd];
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return "-1";
		}
		return nodeStart + " " + path;
	}

	private int lessVertex(ArrayList<Integer> queue, int[] distance) {
		int vertex = 0;

		for (int i = 0; i < queue.size(); i++) {
			if (distance[queue.get(i)] < distance[queue.get(vertex)]) {
				vertex = i;
			}

		}

		return vertex;
	}
}
