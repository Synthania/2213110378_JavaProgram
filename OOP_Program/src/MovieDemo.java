import java.util.*;

public class MovieDemo {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Movie mv = new Movie();
		System.out.print("Input movie id   : ");
		String mId = sc.nextLine();
		System.out.print("Input movie name : ");
		String mName = sc.nextLine();

		System.out.print("\nInput director name   : ");
		String dName = sc.nextLine();
		System.out.print("Input director e-mail : ");
		String dMail = sc.nextLine();
		System.out.print("Input director gender : ");
		char gender = sc.next().charAt(0);
		while (!(gender + "").equalsIgnoreCase("M") && (!(gender + "").equalsIgnoreCase("F"))) {
			System.out.print("Input director gender, again : ");
			gender = sc.next().charAt(0);
		}

		System.out.print("\nInput movie theater no.  : ");
		int theater = sc.nextInt();
		while (theater < 1 || theater > 15) {
			System.out.print("Please input 1 - 15 only : ");
			theater = sc.nextInt();
		}
		Theater theaterr = new Theater(mId,mName,new Director(dName,dMail,gender),theater);
		System.out.println("\n"+theaterr);
	}

}
