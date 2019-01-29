package co.indebted.picker;
import java.util.Random;

public class picker {

	public static void main(String[] args) throws InterruptedException {
		

		String[] employeeList = {
				"David", "Wenbo"
		};

		int idx = new Random().nextInt(employeeList.length);
		String random = (employeeList[idx]);
		
		System.out.println("#####################################\n");
		
		System.out.println("drawing\n");
		for (int i = 0; i < 6 ; i++) {
			System.out.print(".");
			Thread.sleep(500);
		}
		
		System.out.println("\n\nAnd the winner is\n");

		for (int i = 0; i < 6 ; i++) {
			System.out.print(".");
			Thread.sleep(500);
		}
		
		System.out.println("\n\n" + random + "!" + "\n\n#####################################");
	}

	
}
