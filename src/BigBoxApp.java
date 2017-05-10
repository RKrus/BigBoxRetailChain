import java.util.Scanner;

public class BigBoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Big Box App!\n");
		// Perform one or more selections.
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			String division = Validator.getStringNumeric(sc, "Enter division number", 3);

			String store = Validator.getStringNumeric(sc, "Enter store number", 5);
			Store bb = StoreDB.getStoreByDivisionStore(division, store);

			System.out.println("Store found for division" + division + " and store number " + store);

			System.out.println(bb);

			// see if the user wants to continue

			choice = Validator.getString(sc, "Continue? y/n : ");
			System.out.println();

		}
		{
			System.out.println("Thanks for using the BigBoxApp! Bye!");
		}
		
	}
}
