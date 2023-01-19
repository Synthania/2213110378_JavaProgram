import java.util.*;

public class TestBookeiei {
	static Scanner scan = new Scanner(System.in);
	static Book book = new Book();

	public static void main(String[] args) {
		System.out.print("Input book title   : ");
		book.setTitle(scan.nextLine());
		System.out.print("Input book price   : ");
		book.setPrice(scan.nextFloat());
		System.out.print("Input publish year : ");
		book.setPublishyear(scan.nextInt());
		// System.out.println();
		System.out.print("\n"+book);
	}

}
