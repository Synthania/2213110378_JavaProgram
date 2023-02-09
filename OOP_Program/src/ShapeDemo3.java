import javax.swing.*;
public class ShapeDemo3 {

	public static void main(String[] args) {
		Cylinder cyl[] = new Cylinder[5];
		String cyll = "";
		for (int i = 0; i < cyl.length; i++) {
			double radius = Double.parseDouble(JOptionPane.showInputDialog("Input radius: "));
			double height = Double.parseDouble(JOptionPane.showInputDialog("Input height: "));
			cyl[i] = new Cylinder(radius, height);
		}

		for (int i = 0; i < cyl.length; i++) {
			cyll +=  "Cylinder " + (i + 1) + ", volume=" + cyl[i].getVolume()+"\n";
		}
	   JOptionPane.showMessageDialog(null, cyll);
	}

}
