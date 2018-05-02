//Colton Leach COSC 1337.702 Lab #5

public class BloodData {
	
   private String bloodType;
   private String rhFactor;
   
   //constructor (default)
   public BloodData() {
	   bloodType = "O";
	   rhFactor = "+";
   }
   
   //Overloaded constructor
   public BloodData(String bType, String rFac) {
	   bloodType = bType;
	   rhFactor = rFac;
   }

   //getters
   public String getBloodType(){
	   return bloodType;
   }
   public String getRhFactor(){
	   return rhFactor;
   }
   
   //setters
   public void setBloodType(String btype) {
	   bloodType = btype;
   }
   public void setRhFactor(String rFac) {
	   rhFactor = rFac;
   }

}