//Colton Leach COSC 1337.702 Lab #6

public class Invoice
{
	private int invoice, month, day, year;
	private double balance;

	public Invoice(int finalInvoice, int finalMonth, int finalDay, int finalYear, double finalBalance)
	{
		if(finalInvoice < 1000)
			invoice = 0;
		else
			invoice = finalInvoice;

		if(finalMonth < 1 || finalMonth > 12)
			month = 0;
		else
			month = finalMonth;

		if(finalDay <1 || finalDay > 31)
			day = 0;
		else
			day = finalDay;

		if (finalYear < 2011 || finalYear > 2017)
			year = 0;
		else
			year = finalYear;

		balance = finalBalance;
	}

	public void display()
	{
		System.out.println("\nInvoice number: " + invoice);
		System.out.println("Balance due: " + balance + " on " + month + "/" + day + "/" + year);
	}
}