
public class DemoBlock {
	public static void main(String[] args) {
		int x = 1111;
		System.out.println("In the first block x is " + x);
		{
			int y = 2222;
			System.out.println("In the second block x is " + x);
			System.out.println("In the second block y is " + y);
			{
				y = 3333;
				System.out.println("In the third block x is " + x);
				System.out.println("In the third block y is " + y);
				demoMethod();
				System.out.println("After method x is " + x);
				System.out.println("After method y is " + y);
				{
					System.out.println("At the end x is " + x);
				}
			}
		}
	}
	public static void demoMethod() {
		int x = 8888, y = 9999;
		System.out.println("In this method x is " + x);
		System.out.println("In this method y is " + y);
	}
}
