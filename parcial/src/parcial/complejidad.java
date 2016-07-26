package parcial;

public class complejidad {

	public static int fourpowN(String p, int n) {

		int k=0;
		if (p.length() == n) {
			k++;
			System.out.println(p);
		} else {
			k+= fourpowN(p + "0", n);
			k+=fourpowN(p + "1", n);
			k+=fourpowN(p + "2", n);
			k+=fourpowN(p + "3", n);
		}
		return k;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fourpowN("", 2));
	}

}
