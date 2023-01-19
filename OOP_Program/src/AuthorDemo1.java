import java.util.*;

public class AuthorDemo1 {

	static Scanner scan = new Scanner(System.in);
	static Author at = new Author();

	public static void main(String[] args) {
		System.out.print("Input author name   : ");
		String name = scan.nextLine();
		System.out.print("Input author e-mail : ");
		String mail = scan.nextLine();
		System.out.print("Input author gender : ");
		char gender = scan.next().charAt(0);
		Author at = new Author(name,mail,gender);
		System.out.println("\n" + at);
	}

}
