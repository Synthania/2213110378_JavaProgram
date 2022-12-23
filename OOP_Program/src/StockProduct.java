import java.util.*;
import java.text.*;

public class StockProduct {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		Product[] pd = new Product[4];
		for (int i = 0; i < pd.length; i++) {
			pd[i] = new Product();
			System.out.print("Input product Id    : ");
			pd[i].setId(scan.next());
			System.out.print("Input product unit  : ");
			pd[i].setUnit(scan.nextInt());
			System.out.print("Input product Price : ");
			pd[i].setPrice(scan.nextDouble());
			System.out.println();
		}
		System.out.println("----------------------------------------------------");
		double Total = 0;
		for (int i = 0; i < pd.length; i++) {
			System.out.println("Product ID : " + pd[i].getId() + ", Total price = " + frm.format(pd[i].calculate()) + " baht.");
			Total += pd[i].calculate();
		}

		System.out.println("----------------------------------------------------");
		System.out.println("Total price of all products is " + frm.format(Total) + " baht.");
	}

}
