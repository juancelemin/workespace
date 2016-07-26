package parcial;

public class find {

	//1234 1234 1234 1234
	public static int findd (String a[], int indexFrom, int indexTo, String s){
		
		if(indexTo-indexFrom<4){
			if(a[indexFrom].equals(s)){
				return indexFrom;
			}
			else if( a[indexTo].equals(s)){
				return indexTo;
			}else{
				return 0;
			}
			
			
		}else{
			
			findd(a, indexFrom, (((indexTo+1)/4)-1), s);
			findd(a, (indexTo+1/4), (((indexTo+1)/4)*2)-1, s);
			findd(a, ((indexTo+1/4)*2), (((indexTo+1)/4)*3)-1, s);
			findd(a, ((indexTo+1/4)*3), (((indexTo+1)/4)*4)-1, s);
			
		}
		return indexTo;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String[] a = new String[8];
		a[0] = "casa";
		a[1] = "maca";
		a[2] = "nana";
		a[3] = "lima";
		
		a[4] = "mona";
		a[5] = "mico";
		a[6] = "torre";
		a[7] = "mama";
		System.out.println(((a.length+1)/4)-1);

		System.out.println(findd(a, 0, a.length-1, "casa"));
		
	}

}
