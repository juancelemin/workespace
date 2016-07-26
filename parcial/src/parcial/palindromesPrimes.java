package parcial;

public class palindromesPrimes {

	public static int countPalindromicPrimes(int a ,int b){
		
		int answer =0;
		
		for (int i = a; i <=b; i++) {
			if(nPrime(i) && palindrome(i)){
				answer++;
			}
		}
		return answer;
	}

	public static boolean nPrime(int n) {

		if (n == 2) {
			return true;
		} else {
			int cont = 2;
			boolean prime = true;
			while ((prime) && (cont != n)) {
				if (n % cont == 0)
					prime = false;
				cont++;
			}

			return prime;
		}
	}

	public static boolean palindrome(int n) {
		String p = Integer.toString(n);
		String k ="";
		for (int i = p.length()-1; i >=0; i--) {
			k+= p.charAt(i);
		}
		if(k.equals(p)){
			return true;
		}
		else{
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countPalindromicPrimes(2, 51));
	}

}
