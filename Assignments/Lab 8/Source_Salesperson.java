//Colton Leach COSC 1337.702 Lab #8

public class Salesperson {
	int ID;
	double annSales;
	
	//Constructor
	public Salesperson(int ID, double annSales) {
		this.ID = ID;
		this.annSales = annSales;
	}
	
	//Getters
	public int getID() {
		return ID;
	}
	
	public double getAnnSales() {
		return annSales;
	}
	
	//Setters
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public void setAnnSales(double annSales) {
		this.annSales = annSales;
	}
}