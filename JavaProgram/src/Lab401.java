import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();
		if (!fullName.contains(" ")) {
			System.out.print("Incorrect Name");
		}else {
			String firstName = fullName.substring(0,fullName.indexOf(' '));
			String lastName = fullName.substring(fullName.indexOf(' ')+1);
			System.out.println("First Name: "+firstName.toUpperCase());
			System.out.println("Last Name: "+lastName.toLowerCase());
		}
	}

}
