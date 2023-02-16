import java.util.*;

public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Input book title: ");
		String bt = s.nextLine();
		System.out.print("Input public year: ");
		int py = s.nextInt();

		FictionBook book = new FictionBook(bt, py);

		System.out.print("Input writer name: ");
		String wn = s.nextLine();
		System.out.print("Input writer mail: ");
		String wm = s.nextLine();

		FictionBook writer = new FictionBook(wm, py);
		
		

	}

}
