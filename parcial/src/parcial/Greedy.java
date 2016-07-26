package parcial;

import java.util.Arrays;

public class Greedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] heights = new int[4];
		heights[0] = 19;
		heights[1] = 23;
		heights[2] = 9;
		heights[3] = 12;
		// heights[4] = 3;
	
		System.out.println(getMinimum(3, heights));
		System.out.println(getMinimumOp(3, heights));

	}

	public static int getMinimum(int M, int heights[]) {
		int answer = Integer.MAX_VALUE;
		int numberFloors = 0;

		int[][] minDistances = new int[heights.length][heights.length];

		Arrays.sort(heights);

		for (int i = 0; i < minDistances.length; i++) {
			for (int j = i; j < minDistances[i].length; j++) {

				minDistances[i][j] = heights[j] - heights[i];
			}
		}

		for (int i = 0; i < minDistances.length; i++) {
			int k = i + M - 1;
			boolean n = false;
			if (k < minDistances.length) {
				n = true;
				for (int j = i; j <= k; j++) {
					numberFloors += minDistances[i][k] - minDistances[i][j];
				}
			}
			// System.out.println(numberFloors);
			if (numberFloors < answer && n) {
				answer = numberFloors;
			}
			numberFloors = 0;
		}

		// for (int i = 0; i < minDistances.length; i++) {
		// for (int j = 0; j < minDistances.length; j++) {
		// System.out.print(minDistances[i][j] + " ");
		// }
		// System.out.println();
		// }

		return answer;
	}

	public static int getMinimumOp(int M, int heights[]) {

		// O(n^2 + n*(n-M+1))
		int temp = 0;
		int answer = 1000;
		for (int i = 0; i < heights.length; i++) {
			for (int j = i; j < heights.length; j++) {
				if (j + 1 < heights.length) {
					if (heights[i] < heights[j + 1]) {
						temp = heights[i];
						heights[i] = heights[j + 1];
						heights[j + 1] = temp;
					}
				}
			}
		}

		temp = 0;
		for (int i = 0; i < heights.length; i++) {
			if (i + M - 1 < heights.length) {
				for (int j = i; j <= i + M - 1; j++) {
					temp += heights[i] - heights[j];

				}
				if (temp < answer) {
					answer = temp;
				}
				temp = 0;
			} else {
				break;
			}
		}
		return answer;
	}

}
