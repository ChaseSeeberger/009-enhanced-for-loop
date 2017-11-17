
public class OneDimArrays {
	int[] myInts = { 5, 2, 8, 9, 12, 43 };
	String myStrings[] = { "Hello", "Happy", "Wednesday", "Period", "A2" };
	float[] myFloat = new float[5];
	double[] myDouble = new double[5];

	private void init_myDouble() {
		myDouble[0] = 0.5;
		myDouble[1] = 1.5;
		myDouble[2] = 2.5;
		myDouble[3] = 3.5;
		myDouble[4] = 4.5;
	}

	private void init_myFloat() {
		myFloat[0] = (float) 0.5;
		myFloat[1] = (float) 1.5;
		myFloat[2] = (float) 2.5;
		myFloat[3] = (float) 3.5;
		myFloat[4] = (float) 4.5;
	}

	public void sysoArray() {
		init_myFloat();
		init_myDouble();
		
		System.out.println("starting conventional for loop for ints");
		for (int i = 0; i < myInts.length; i++) {
			System.out.println(myInts[i]);
		}
		System.out.println("starting enchanced for loop for ints");
		for (int i : myInts) {
			System.out.println(i);
		}
		
		System.out.println("starting conventional for loop for strings");
		for (int i = 0; i < myStrings.length; i++) {
			System.out.println(myStrings[i]);
		}
		System.out.println("starting enchanced for loop for strings");
		for (String i : myStrings) {
			System.out.println(i);
		}
		
		System.out.println("starting conventional for loop for floats");
		for (int i = 0; i < myFloat.length; i++) {
			System.out.println(myFloat[i]);
		}
		System.out.println("starting enchanced for loop for floats");
		for (float i : myFloat) {
			System.out.println(i);
		}
		
		System.out.println("starting conventional for loop for doubles");
		for (int i = 0; i < myDouble.length; i++) {
			System.out.println(myDouble[i]);
		}
		System.out.println("starting enchanced for loop for doubles");
		for (double i : myDouble) {
			System.out.println(i);
		}
		
	}
}
