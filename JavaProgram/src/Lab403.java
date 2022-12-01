import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String Message = scan.nextLine();
		String cheakMessage = Message.toLowerCase();
		int cheak=0;
		for(int i=0; i<cheakMessage.length();i++) {
			if(cheakMessage.indexOf("nichi")>=0) {
				cheak++;
			}
		}
		if(cheak==0) {
			System.out.print(Message);
		} else {
			System.out.println("Nichi is a sentence");
		}
	}

}
