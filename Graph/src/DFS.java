
public class DFS {

	public int[] previous;
	public int[] distance;
	public boolean[] visited;

	public DFS() {

	}

	public String startAlgorithmDFS(Graph v, int strat, int end) {
		this.previous = new int[v.getnumberNode()];
		this.visited = new boolean[v.getnumberNode()];
		this.distance = new int[v.getnumberNode()];
		for (int i = 0; i < distance.length; i++) {
			previous[i] = -1;
			distance[i] = Integer.MAX_VALUE;

		}
		algorithmDFS(v, strat, end, 0);
		return shortPath(v, strat, end);
	}

	private void algorithmDFS(Graph v, int strat, int end, int level) {

		if (!visited[strat]) {
			visited[strat] = true;
			level++;
			for (int i = 0; i < visited.length; i++) {
				if (v.getadjacencyMatrix()[strat][i] == 1 && !visited[i]) {

					previous[i] = strat;
					distance[i] = level;
					algorithmDFS(v, i, end, level);
				}

			}
		}

	}

	private String shortPath(Graph v, int nodeStart, int nodeEnd) {

		int dintanceFatherActual = 0;

		for (int i = 0; i < previous.length; i++) {
			for (int j = 0; j < distance.length; j++) {
				if (previous[i] != -1) {
					if (distance[previous[i]] != Integer.MAX_VALUE) {
						dintanceFatherActual = distance[previous[i]];
						if (v.getadjacencyMatrix()[i][j] == 1) {
							if (distance[j] < dintanceFatherActual) {
								previous[i] = j;
							}
						}
					}
				}
			}
		}

		String path = "";
		try {
			while (nodeEnd != nodeStart) {
				path = nodeEnd + " " + path;
				nodeEnd = previous[nodeEnd];
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return "-1";
		}
		return nodeStart + " " + path;
	}

}