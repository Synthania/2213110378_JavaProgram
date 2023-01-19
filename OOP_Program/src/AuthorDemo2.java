import java.util.Scanner;

public class AuthorDemo2 {

	static Scanner scan = new Scanner(System.in);
	static Author at[] = new Author[4];

	public static void main(String[] args) {
		for(int i = 0; i<at.length;i++) {
			System.out.println("Information Author "+i+1);
			line();
			System.out.print("\nInput author name   : ");
			String name = scan.nextLine();
			System.out.print("Input author e-mail : ");
			String mail = scan.nextLine();
			at[i] = new Author(name,mail);
			line();
			System.out.print("\nInput author gender : ");
			char gender = scan.next().charAt(0);
			System.out.println("\n" + at);
		}
	}

	public static void line() {
		for (int i = 0; i <= 40; i++) {
			System.out.print("-");
		}
	}
}
