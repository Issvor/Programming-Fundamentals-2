//Colton Leach COSC 1337.702 Lab #8

public class DemoSalesperson {
	public static void main(String[] args) {
		
		Salesperson sp[] = new Salesperson[10];
		
		for(int ctr = 0; ctr < sp.length; ctr++) {
			sp[ctr] = new Salesperson(9999, 0);
		}
		
		for(int ctr = 0; ctr < sp.length; ctr++) {
			System.out.println(sp[ctr].getID() + " " + sp[ctr].getAnnSales());
		}
	}
}
