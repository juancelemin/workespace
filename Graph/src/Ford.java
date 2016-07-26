
public class Ford {

	public String pathFord(Graph v, int nodeStart, int nodeEnd) {

		int[] predecessor = new int[v.getnumberNode()];
		int[] distance = new int[v.getnumberNode()];

		for (int i = 0; i < distance.length; i++) {
			predecessor[i] = -1;
		}
		for (int i = 0; i < predecessor.length; i++) {
			if (i != nodeStart) {
				distance[i] = Integer.MAX_VALUE - 1;

			}

		}
		for (int k = 0; k < v.getnumberNode(); k++) {
			for (int i = 0; i < v.getnumberNode(); i++) {
				for (int j = 0; j < v.getnumberNode(); j++) {
					if (v.getadjacencyMatrix()[i][j] == 1) {
						if (distance[j] > distance[i] + 1) {

							distance[j] = distance[i] + 1;
							predecessor[j] = i;

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
