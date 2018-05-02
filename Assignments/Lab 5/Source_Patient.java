//Colton Leach COSC 1337.702 Lab #5

public class Patient {

   private String patientID;
   private int age;
   private BloodData data;
   
   public Patient(){
	   patientID = "0";
	   age = 0;
	   data = new BloodData();
   }
   
   public Patient(String ID, int age, String bType, String rFac) {
	   patientID = ID;
	   this.age = age;
	   data = new BloodData(bType, rFac);
   }
   
   public String getPatientID() {
	   return patientID;
   }
   public int getAge() {
	   return age;
   }
   public BloodData getBloodData() {
	   return data;
   }
}