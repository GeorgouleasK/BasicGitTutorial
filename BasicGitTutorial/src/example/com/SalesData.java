package example.com;

public class SalesData {
	
	private int sales[] = {2, 4, 8};
	
	public SalesData() {
		
	}
	
	public void displayData() {
		for (int i=0; i<sales.length; i++) {
			System.out.println(sales[i]);
		}
	}
	

}
