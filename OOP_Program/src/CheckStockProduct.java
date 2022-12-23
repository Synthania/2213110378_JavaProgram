import java.util.*;

public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int product = scan.nextInt();
		System.out.println();
		Product[] productList = new Product[product];
		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product Id    : ");
			productList[i].setId(scan.next());
			System.out.print("Input product unit  : ");
			productList[i].setUnit(scan.nextInt());
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("--------------------------------------------");
		for (Product pdList : productList) {
			if (pdList.getUnit() < 5) {
				pdList.ListProduct(pdList.getUnit());
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("--------------------------------------------");
		for (Product pdList : productList) {
			if (pdList.getUnit() >= 5 && pdList.getUnit() <= 50) {
				pdList.ListProduct(pdList.getUnit());
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("List of product in 'HIGHT' status.");
		System.out.println("--------------------------------------------");
		for (Product pdList : productList) {
			if (pdList.getUnit() >= 50) {
				pdList.ListProduct(pdList.getUnit());
			}
		}
	}

}
