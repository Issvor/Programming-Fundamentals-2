//Colton Leach COSC 1337.702 Lab #6

public class TestInvoice2{
	public static void main(String[] args) {

	Invoice2 invoice1 = new Invoice2(34789, 4, 31, 2013, 8639);
	Invoice2 invoice2 = new Invoice2(9356, 2, 30, 2010, 1321);
	Invoice2 invoice3 = new Invoice2(23580, 11, 32, 2018, 8632);
	Invoice2 invoice4 = new Invoice2(14592, 12, 6, 2013, 2566);

	System.out.println("All invoice due dates are in month/day/year");
	invoice1.display();
	invoice2.display();
	invoice3.display();
	invoice4.display();
	}
}