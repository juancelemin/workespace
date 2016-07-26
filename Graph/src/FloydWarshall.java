
public class FloydWarshall {

	public String PathFloydWarshall(Graph v, int StratNode, int EndNode) {
		int dist[][] = new int[v.getnumberNode()][v.getnumberNode()];
		int next[][] = new int[v.getnumberNode()][v.getnumberNode()];
		
		for (int i = 0; i < next.length; i++) {
			for (int j = 0; j < next.length; j++) {
				next[i][j] = -1;
			}
		}
		for (int i = 0; i < dist.length; i++) {
			for (int j = 0; j < dist.length; j++) {
				if (i == j) {

				} else {
					dist[i][j] = Integer.MAX_VALUE;
				}
			}
		}
		for (int i = 0; i < dist.length; i++) {
			for (int j = 0; j < dist.length; j++) {
				if (v.getadjacencyMatrix()[i][j] == 1) {
					dist[i][j] = 1;
					next[i][j] = j;
				}
			}
		}
		for (int k = 0; k < dist.length; k++) {
			for (int i = 0; i < dist.length; i++) {
				for (int j = 0; j < dist.length; j++) {
					if (dist[i][k] == Integer.MAX_VALUE || dist[k][j] == Integer.MAX_VALUE) {
					} else if (dist[i][j] > dist[i][k] + dist[k][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
						next[i][j] = next[i][k];
					}
				}
			}
		}
		int u = StratNode;
		String path = "";
		while (u != EndNode) {
			if(u != -1){
			u = next[u][EndNode];
			path = path + " " + u;}
			else{
				return "-1";
				
			}
		}
		path = StratNode + path;
		return path;
	}
}
