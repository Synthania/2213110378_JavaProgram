import javax.swing.*;
import java.text.*;
public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.#");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input wight:"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
        double BMT = weight/((height/100)*(height/100));
        if (BMT <= 18.5 ) {
        	BMT = JOptionPane.showConfirmDialog(null,
            		"BMI = "+frm.format(BMT)+""
            				+ "\nYou're Underweight" ,"BMI", JOptionPane.WARNING_MESSAGE);
        }
        else if (BMT >=18.5|| BMT <=24.9) {
        	BMT = JOptionPane.showConfirmDialog(null,
            		"BMI = "+frm.format(BMT)+""
            				+ "\nYou're Normal-weight" ,"BMI", JOptionPane.WARNING_MESSAGE);
        }
        else if (BMT >= 25.0 || BMT <= 29.9) {
        	BMT = JOptionPane.showConfirmDialog(null,
            		"BMI = "+frm.format(BMT)+""
            				+ "\nYou're Overweight" ,"BMI", JOptionPane.WARNING_MESSAGE);
        }
        else {
        	BMT = JOptionPane.showConfirmDialog(null,
            		"BMI = "+frm.format(BMT)+""
            				+ "\nYou're Obesity" ,"BMI", JOptionPane.WARNING_MESSAGE);
        }
	}

}
