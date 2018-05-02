//Colton Leach COSC 1337.702 Lab #6

public class TestInvoice{
	public static void main(String[] args) {

	Invoice invoice1 = new Invoice(15871, 2, 13, 2013, 8639);
	Invoice invoice2 = new Invoice(3631, 6, 30, 2010, 1321);
	Invoice invoice3 = new Invoice(5888, 11, 32, 2018, 8632);
	Invoice invoice4 = new Invoice(13089, 13, 6, 2013, 2566);

	System.out.println("All invoice due dates are in month/day/year");
	invoice1.display();
	invoice2.display();
	invoice3.display();
	invoice4.display();
	}
}