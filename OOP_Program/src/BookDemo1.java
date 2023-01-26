import java.util.*;

public class BookDemo1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Input author name   : ");
		String name = sc.nextLine();
		System.out.print("Input author e-mil  : ");
		String mail = sc.next();

		Author1 aut = new Author1(name, mail);
		System.out.println(aut);

		System.out.print("\nInput book title : ");
		sc.nextLine();
		String ti = sc.nextLine();
		System.out.print("Input book page  : ");
		int page = sc.nextInt();

		Book1 book1 = new Book1(ti, aut, page);
		System.out.println(book1);
	}

}
