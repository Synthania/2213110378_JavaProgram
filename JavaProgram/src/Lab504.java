import java.util.*;
public final class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullName = scan.nextLine();
		int space = fullName.indexOf(' ');
		String firstName = fullName.substring(0,space);
		System.out.println(abbreviatName(fullName) +firstName);
	}
	public static String abbreviatName(String fullName) {
		String firstWord = "";
		for(int i =0; i<fullName.length(); i++) {
			if(fullName.charAt(i)==' ') {
				firstWord = (firstWord + fullName.charAt(i+1) );
				firstWord = firstWord +'.';
				firstWord.toUpperCase();
   		 }
		}
		return firstWord;
	}
}
