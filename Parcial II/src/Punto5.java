
public class Punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p[] = new int[9];
		p[0] = 5;
		p[1] = 20;
		p[2] = 800;
		p[3] = 320;
		p[4] = 1280;
		p[5] = 5120;
		p[6] = 20480;
		p[7] = 81920;
		p[8] = 327680;
		// p[9] = 1310720;
	
		HallarLaRazon(p);
	}

	public static void HallarLaRazon(int[] arr) {

		// if (arr.length > 3) {
		// if (arr[1] / arr[0] != arr[2] / arr[1]) {
		// if (arr[2] / arr[1] == arr[3] / arr[2]) {
		// System.out.println(0);
		// } else {
		// if (arr[3] / (arr[1] * (arr[1] / arr[0])) == arr[1] / arr[0]) {
		// System.out.println(2);
		// } else {
		// System.out.println(1);
		// }
		// }
		//
		// } else if (arr[2] / arr[1] != arr[3] / arr[2]) {
		// System.out.println(3);
		//
		// } else {
		//
		// System.out.println(arr[1] / arr[0]);
		System.out.println(HallarLaPos(arr, 0, 8, 4));
		// }

		// }
	}

	public static int HallarLaPos(int[] arr, int indexStart, int indexEnd, int Razon) {

		int index = 0;
		if (indexEnd - indexStart == 3 || indexEnd - indexStart == 2) {

			if (indexEnd - indexStart == 3) {
				if (arr[indexStart + 1] / arr[indexStart] != Razon) {
					if (arr[indexEnd] / arr[indexStart + 1] != Razon) {
						return indexStart + 1;
					}
				}

			} else {
				if(arr[indexStart]){
					
				}
			
			}
		} else {

	
				index += HallarLaPos(arr, indexStart, indexEnd / 2, Razon);
				//index += HallarLaPos(arr, (indexEnd / 2) + 1, indexEnd, Razon);
	

		}
		return index;

	}

}
