import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Text: ");
		String text = scan.nextLine();
		int words = text.length(); /*n = text /2 - 1;*/
		int n = words/2-1;
		boolean isPalindrome = true;
		for (int i =0;i<n;i++) {
			if(text.charAt(i) == text.charAt(text.length()-1-i));
			else {
				isPalindrome = false;
				break;
			}
		}
		String result = isPalindrome ? "It is palindrom" : "It is not palindrome";
		System.out.println(result);
	}

}
