import java.io.*;

public class ATMChecking extends ATMData {

	private int money;

	public ATMChecking(String acc, String pass, int money) {
		super(acc, pass);
		this.money = money;

	}

	public boolean checkBookBank() throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("ATMBookBank.txt"));
		String temp = "";
		boolean check = false;
		while ((temp = read.readLine()) != null) {
			String[] data = temp.split(" ");
			String acc = data[0];
			String pass = data[1];
			int amount = Integer.parseInt(data[2]);
			if (acc == getID() && pass == getPass() && amount <= money) {
				check = true;
				break;
			}
		}
		read.close();
		return check;
	}

	public void show() throws IOException {
		if (checkBookBank()) {
			System.out.print("\nYou drawing for " + money + ", get");
			int thousandBanknotes = money / 1000;
			money &= 1000;
			System.out.println("1000 = " + thousandBanknotes);
			int fivehundredBanknotes = money / 500;
			money %= 500;
			System.out.println("500 = " + fivehundredBanknotes);
			int hundredBanknotes = money / 100;
			money %= 100;
			System.out.println("100 = " + hundredBanknotes);
			int bl = -this.money;
			System.out.printf("You balance is %2n" , bl + " baht.");

		} else {
			System.out.print("\nSorry, you id or password is worg, or you amount not enough. ");
		}
	}

}
