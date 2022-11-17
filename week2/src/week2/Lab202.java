package week2;
import javax.swing.*;
import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int minutesTime = scan.nextInt();
		int years = minutesTime/525600;
		int days = (minutesTime%525600)/1440;
		System.out.print(minutesTime+" minutes is approximately "+years+" years and "+days+" days");

	}

}
