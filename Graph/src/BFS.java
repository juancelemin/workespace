import java.util.ArrayList;

public class BFS {

	public BFS() {

	}

	public String pathBFS(Graph v, int nodeStart, int nodeEnd) {

		ArrayList<Integer> stack = new ArrayList<>();
		int[] distance = new int[v.getnumberNode()];
		int[] predecessor = new int[v.getnumberNode()];
		boolean[] visited = new boolean[v.getnumberNode()];
		
		for (int i = 0; i < visited.length; i++) {
			predecessor[i] = -1;
		}
		int nodeActual = nodeStart;

		visited[nodeStart] = true;
		stack.add(nodeStart);
		distance[nodeStart] = 0;
		predecessor[nodeStart] = 0;

		while (!stack.isEmpty()) {
			nodeActual = stack.get(0);
			stack.remove(0);
			for (int i = 0; i < visited.length; i++) {
				if (v.getadjacencyMatrix()[nodeActual][i] == 1 && !visited[i]) {
					visited[i] = true;
					distance[i] = distance[nodeActual] + 1;
					predecessor[i] = nodeActual;
					stack.add(i);
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

	
	
	public void DFSStack(Graph v, int StratNode, int EndNode) {

		ArrayList<Integer> stack = new ArrayList<>();
		boolean visited[] = new boolean[v.getnumberNode()];

		stack.add(StratNode);
		visited[StratNode] = true;
		int u = 0;
		while (!stack.isEmpty()) {
			u = stack.get(0);
			stack.remove(0);
			visited[u] = true;
			System.out.print(u + " ");
			for (int i = v.getnumberNode() - 1; i > 0; i--) {
				if (v.getadjacencyMatrix()[u][i] == 1 && !visited[i]) {

					stack.add(0, i);

				}
			}

		}

	}

}
