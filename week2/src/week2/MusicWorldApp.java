package week2;
import javax.swing.*;
import java.text.*;

public class MusicWorldApp {

	public static void main(String[] args) {
		String cdId = JOptionPane.showInputDialog("This program calculates the total cost of a CD order"
				+ "\nplease enter the ID of the CD");
		String cdTitle = JOptionPane.showInputDialog("Please enter the tittle of the CD");
		double cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));
		int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("please enter the quantity to be purchased"));
		double cdSubtotal = cdPrice*cdQuantity;
        final double TAX_RATE = 0.0625;
		double cdtotal = cdSubtotal * (1 + TAX_RATE);
		JOptionPane.showMessageDialog(null, 
				"Summary of the transaction:"
				+ "\n\nCD ID:"+cdId+"\nCD Title:"+cdTitle+"\nCD Unit Price:"+cdPrice+"\nCD Quantity:"+cdQuantity+""
				+"\n\nSubtotal:$"+cdSubtotal+"\nTax rate: "+TAX_RATE*100+"%\nTotal: $"+cdtotal+"\n\nEnd of Program");
	}

}
