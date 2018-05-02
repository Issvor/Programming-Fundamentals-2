//Colton Leach COSC 1337.702 Lab #7

public class Purchase {
		int invoiceNumber = 0;
		double price = 0.00;
		double tax;
		
		public void setInvoiceNumber( int invoice) {
			invoiceNumber = invoice;
		}
		
		public void setPrice(double saleAmount) {
			price = saleAmount;
			tax = (saleAmount * 0.05);
		}
		
		public void showSale() {
			System.out.println("Invoice number: " + invoiceNumber);
			System.out.println("Price: " + price);
			System.out.println("Sales tax: " + tax);
			
		}
}
