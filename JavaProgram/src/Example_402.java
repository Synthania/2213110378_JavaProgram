import javax.swing.*;
public class Example_402 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
		while (inputEmail.startsWith("@")||inputEmail.contains(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail, agian:");
		}
		inputEmail = inputEmail.toLowerCase();
		/*if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com")){
			JOptionPane.showConfirmDialog(null, "You e-mail is "+inputEmail);
		}
		else {
			JOptionPane.showConfirmDialog(null, "You e-mail is not hotmail or gmail dot com");
		}*/
		boolean cheakEmail = inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com");
		JOptionPane.showConfirmDialog(null, (cheakEmail)?"Your e-mail is "+inputEmail : "You e-mail is not hotmail or gmail dot com" );
	}

}
