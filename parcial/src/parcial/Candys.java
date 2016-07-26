package parcial;

public class Candys {
	
	
	public static int minimunBoxVolumeForCandies(int [] c) {
		int answer =0;
		int volum [] = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			int k =0;
			while(Math.pow(2, k)<c[i]){
				k++;
			}
			
			k = (int) Math.pow(2, k);
			volum[i] = k;
		}
		for (int i = 0; i < volum.length; i++) {
			answer+= volum[i];
		}
		int p =0;
		while(Math.pow(2, p)<answer){
			p++;
		}
		answer= (int) Math.pow(2, p);
		return answer;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] c = new int[5];
		c[0] = 1;
		c[1] = 1;
		c[2] = 13;
		c[3] = 1;
		c[4] = 1;
		
		System.out.println(minimunBoxVolumeForCandies(c));

	}

}
