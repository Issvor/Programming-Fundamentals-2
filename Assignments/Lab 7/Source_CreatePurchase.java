//Colton Leach COSC 1337.702 Lab #7
import java.util.Scanner;

public class CreatePurchase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int invoice;
		double saleAmount;
		Purchase sold = new Purchase();
		
		System.out.println("What is the invoice number? ");
		invoice = input.nextInt();
		
		while (invoice < 1000 || (invoice > 8000)){
			System.out.println("Please enter a valid number: ");
			invoice = input.nextInt();
		}
		
		System.out.println("What is the sale amount? ");
		saleAmount = input.nextDouble();
		
		while (saleAmount <= 0) {
			System.out.println("Please enter a valid number: ");
			saleAmount = input.nextDouble();
		}
		
		sold.setInvoiceNumber(invoice);
		sold.setPrice(saleAmount);
		sold.showSale();
	}
}
