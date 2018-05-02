//Colton Leach COSC 1337.702 Lab #8

public class DemoSalesperson2 {
	public static void main(String[] args) {
		
		Salesperson sp[] = new Salesperson[10];
		int ID[] = {111, 112, 113, 114, 115, 116, 117, 118, 119, 120};
		double annSales[] = {25000, 30000, 35000, 40000, 45000, 50000, 55000, 60000, 65000, 70000};
		
		for(int ctr = 0; ctr < sp.length; ctr++) {
			sp[ctr] = new Salesperson(ID[ctr], annSales[ctr]);
		}
		
		for(int ctr = 0; ctr < sp.length; ctr++) {
			System.out.println(sp[ctr].getID() + " " + sp[ctr].getAnnSales());
		}
		
	}
}