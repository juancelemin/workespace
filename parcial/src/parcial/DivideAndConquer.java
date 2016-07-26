package parcial;
public class DivideAndConquer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[7];
		a[0] = 3;
		a[1] = 5;
		a[2] = 7;
		a[3] = 9;
		a[4] = 11;
		a[5] = 15;
		a[6] = 17;
		
		recursiveSolution(0, a.length-1, a);
	}

	private static int searchd(int aa[]) {
		int n = aa[1] - aa[0];
		int b = aa[aa.length - 1] - aa[aa.length - 2];
		int c = aa[aa.length / 2] - aa[(aa.length / 2) - 1];

		int d = 0;
		if (n == b) {
			d = n;
		} else if (n == c) {
			d = n;
		} else if (b == c) {
			d = b;
		}
		return d;
	}

	private static void recursiveSolution(int from, int to, int a[]) {

		int answer = 0;
		if (to - from == 1) {
//			if (a[to] - a[from] != searchd(a)) {
//				answer = from;
//				return from;
//			}
			System.out.println(a[to]+" "+ a[from]);
		} else if( to - from > 1) {
			
			recursiveSolution(from, to / 2, a);
			//recursiveSolution((to / 2)+1, to, a);

		}
		

	}

}
