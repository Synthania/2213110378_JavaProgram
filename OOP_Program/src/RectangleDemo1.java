import javax.swing.*;

public class RectangleDemo1 {

	public static void main(String[] args) {
		double width = Double.parseDouble(JOptionPane.showInputDialog("Input Width: "));
		double length = Double.parseDouble(JOptionPane.showInputDialog("Input length: "));
		String color = JOptionPane.showInputDialog("Input color:");

		Rectangle rec = new Rectangle(width, length, color);
		JOptionPane.showMessageDialog(null, rec + "\nArea of Rectangle is " + rec.getArea());
	}

}
