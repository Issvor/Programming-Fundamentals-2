//Colton Leach COSC 1337.702 Lab #5

public class TestPatient {
	public static void main(String[] args) {
		Patient patient1 = new Patient();
		Patient patient2 = new Patient("713", 42, "B", "-");
		   
		System.out.println("Patient ID: " + patient1.getPatientID());
		System.out.println("Patient Age: " + patient1.getAge());
		System.out.println("Patient Blood Type: " + patient1.getBloodData().getBloodType() + patient1.getBloodData().getRhFactor());

		System.out.println("\nPatient ID: " + patient2.getPatientID());
		System.out.println("Patient Age: " + patient2.getAge());
		System.out.println("Patient Blood Type: " + patient2.getBloodData().getBloodType() + patient1.getBloodData().getRhFactor());
	}
}