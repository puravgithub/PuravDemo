package examples;

public class CalculateTax {
	
	public int Caltax(int salary, int taxpercent) {
		
		int totalTax = salary * taxpercent/100 ;
		return totalTax;
		
	}

}
