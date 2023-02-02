import javax.swing.*;

public class Shop100Baht {

	public static void main(String[] args) {
		Product1 arnpab = new Product1();
		int yn = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakan Branch?", "Run Program",
				JOptionPane.YES_NO_OPTION);
		if (yn == 0) {
			arnpab = new PattanakarnBranch();
		}
		arnpab.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the nmber of product")));
		JOptionPane.showMessageDialog(null, arnpab);
	}
}
