import java.util.Scanner;

public class CarApp {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);

	String cont = "yes";

	// While loop
	while (cont.equals("yes")) {
		System.out.println("Play!");

		// Logic should stop here if it doesn't need to be included in loop
		System.out.println("Do you want to continue?  (yes/no)");
		cont = scn.next();
	}

	// Indication that the program has ended
	System.out.println("Goodbye.");
	scn.close();
}
}
