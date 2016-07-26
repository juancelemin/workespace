
public class Dijkstra {

	public String pathDijkstra(Graph v, int nodeStart, int nodeEnd) {
		int[] predecessor = new int[v.getnumberNode()];
		boolean[] visited = new boolean[v.getnumberNode()];
		int[] distance = new int[v.getnumberNode()];
		int vertex;
		for (int i = 0; i < distance.length; i++) {
			predecessor[i] = -1;
		}
		for (int i = 0; i < distance.length; i++) {
			if (i == nodeStart) {
				distance[nodeStart] = 0;

			} else if (v.getadjacencyMatrix()[nodeStart][i] == 1) {
				distance[i] = 1;
				predecessor[i] = nodeStart;
			} else {
				distance[i] = Integer.MAX_VALUE - 1;
			}
		}

		distance[nodeStart] = 0;
		visited[nodeStart] = true;
		predecessor[nodeStart] = nodeStart;
		while (!isAll(visited)) {

			vertex = lessVertex(visited, distance);

			visited[vertex] = true;
			for (int i = 0; i < distance.length; i++) {

				if (v.getadjacencyMatrix()[vertex][i] == 1 && !visited[i]) {

					if (distance[i] > distance[vertex] + 1) {
						distance[i] = distance[vertex] + 1;
						predecessor[i] = vertex;
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

	private boolean isAll(boolean[] visited) {
		boolean answer = true;
		for (boolean node : visited) {
			if (node == false) {
				answer = false;
				break;
			}
		}
		return answer;
	}

	private int lessVertex(boolean[] visited, int[] distance) {
		int vertex = 0;
		int less = 0;
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				vertex = i;

				break;
			}
		}
		for (int i = 0; i < distance.length; i++) {
			if (!visited[i]) {
				less = vertex;
				vertex = i;
				if (distance[less] < distance[vertex]) {
					vertex = less;
				}
			}
		}
		return vertex;

	}

}
