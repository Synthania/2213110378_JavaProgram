import java.text.*;
import java.util.*;
public class salespersonSalary {
	static final double COMMISSION_RATE = 0.15;
	static final int SENTINEL = -1;
	public static void main(String[] args) {
		NumberFormat frm = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("Enter sales in dollars (or -1 to end): ");
			int sales = scan.nextInt();
			if(sales ==SENTINEL) {
				System.out.println("bye");
				break;
			}
			double salary = sales*COMMISSION_RATE+1000;
			System.out.print("Salary is: "+frm.format(salary));
			System.out.println();
		}
	}
}
