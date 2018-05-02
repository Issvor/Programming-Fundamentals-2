//Colton Leach COSC 1337.702 Lab #6

public class Invoice2
{
	private int invoice, month, day, year;
	private double balance;

	public Invoice2(int finalInvoice, int finalMonth, int finalDay, int finalYear, double finalBalance)
	{
		if(finalInvoice < 1000)
			invoice = 0;
		else
			invoice = finalInvoice;

		if(finalMonth < 1 || finalMonth > 12) {
			month = 0;
			day = 0;
		}
		else {
			month = finalMonth;
			
			switch(finalMonth) {
			case 2:
				if(finalDay < 1 || finalDay > 28)
					day = 28;
				else
					day = finalDay;
				break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(finalDay < 1 || finalDay > 31)
					day = 31;
				else
					day = finalDay;
				break;
			default:
				if(finalDay < 1 || finalDay > 30)
					day = 30;
				else
					day = finalDay;
				break;
			}
		}

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