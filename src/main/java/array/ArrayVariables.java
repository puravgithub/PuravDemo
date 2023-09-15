package array;

public class ArrayVariables {

	public static void main(String[] args) {

		int a[] = new int[5]; // (declaration)syntax to create array

		

		a[0] = 25;
		a[1] = 20;
		a[2] = 10;
		a[3] = 15;
		a[4] = 30;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		String stg[] = new String[2]; 
		stg[0] = "Purav";
		stg[1] = "Patel";
		
		for (int j = 0 ; j<stg.length ; j++) {
			System.out.println(stg[j]);
		}

	}

}
