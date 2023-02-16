import java.io.*;
import java.util.*;

public class ATMBanking {
	
	static Scanner cs = new Scanner(System.in); 

	public static void main(String[] args) throws IOException {
		
		System.out.print("Enter account number: ");
		String accNumber = cs.next();
		while(accNumber != null) {
			System.out.print("Input worng type, Enter account number: ");
			int acc = cs.nextInt();
		}
		System.out.print("Enter passwoed: ");
		int pass = cs.nextInt();
		/*while(pass) {
			System.out.print("Input worng type, Enter passwoed: ");
			int passWord = cs.nextInt();
		}
		System.out.print("Enter money: ");
		int mn = cs.nextInt();
		while() {
			System.out.print("Input worng type, Enter money: ");
			int money = cs.nextInt();
		}*/
	}

}
