import java.util.ArrayList;

public class DFSWithStack {

	public String DFSStack(Graph v, int StratNode, int EndNode) {

		ArrayList<Integer> stack = new ArrayList<>();
		boolean visited[] = new boolean[v.getnumberNode()];
		int[] predecessor = new int[v.getnumberNode()];
		int[] distance = new int[v.getnumberNode()];
		int dist = 0;

		for (int i = 0; i < predecessor.length; i++) {
			predecessor[i] = -1;
			distance[i] = Integer.MAX_VALUE;
		}

		stack.add(StratNode);
		visited[StratNode] = true;
		int u = 0;
		while (!stack.isEmpty()) {
			u = stack.get(0);
			stack.remove(0);
			visited[u] = true;
			distance[u] = dist;
			// System.out.print(u + " ");
			dist++;
			for (int i = v.getnumberNode() - 1; i > 0; i--) {
				if (v.getadjacencyMatrix()[u][i] == 1 && !visited[i]) {

					distance[i] = dist;
					predecessor[i] = u;
					stack.add(0, i);

				}
			}

		}
		return shortPath(v, StratNode, EndNode, predecessor, distance);

	}

	private String shortPath(Graph v, int nodeStart, int nodeEnd, int[] predecessor, int distance[]) {

		int dintanceFatherActual = 0;

		for (int i = 0; i < predecessor.length; i++) {
			for (int j = 0; j < distance.length; j++) {
				if (predecessor[i] != -1) {
					if (distance[predecessor[i]] != Integer.MAX_VALUE) {
						dintanceFatherActual = distance[predecessor[i]];
						if (v.getadjacencyMatrix()[i][j] == 1) {
							if (distance[j] < dintanceFatherActual) {
								predecessor[i] = j;
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
				nodeEnd = predecessor[nodeEnd];
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return "-1";
		}
		return nodeStart + " " + path;
	}
}