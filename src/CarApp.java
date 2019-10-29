import java.util.Scanner;

public class CarApp {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	String make = "", model = "";
	int year = 0;
	double price = 0.0;

	int numCars = Validator.getInt(scn, "How many cars would you like to enter? ");
	
	Car carArr[] = new Car[numCars];
	
	for (int i = 0; i < numCars; i++) {
		System.out.println("Car #" + (i + 1));
		System.out.println("");
		make = Validator.getString(scn, "Enter make: ");
		model = Validator.getString(scn, "Enter model: ");
		year = Validator.getInt(scn, "Enter year: ",1900,2020);
		price = Validator.getDouble(scn, "Enter price: ");
		
		carArr[i] = new Car(make, model, year, price);
		System.out.println("");

	}

	String format = "%-15s%-15s%-10s%-10s";
	System.out.printf(format,"Make","Model","Year","Price");
	System.out.println("");
	
	for (Car c : carArr) {
		System.out.printf(format, c.getMake(),c.getModel(),String.valueOf(c.getYear()),String.valueOf(c.getPrice()));
		System.out.println("");
	}
	
	/*
	// While loop
	while (cont.equals("yes")) {
		System.out.println("Play!");

		// Logic should stop here if it doesn't need to be included in loop
		System.out.println("Do you want to continue?  (yes/no)");
		cont = scn.next();
	}

	// Indication that the program has ended*/
	System.out.println("Goodbye.");
	scn.close();
}
}
