import java.awt.*;
import javax.swing.*;

public class testGUI extends JFrame {

	private static final int WTGHT = 400;
	private static final int HEIGHT = 300;
	// components

	private JLabel lblLength, lblWight, lblArea, lblPerimeter;
	//private JTextField txtLength,txtWight,txtArea,txtPerimeter;

	// Constructor method
	public testGUI() {
		setTitle("Area and Perimeter");
		setSize(WTGHT, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Properties for components
		lblLength = new JLabel("Enter the legth:",SwingConstants.RIGHT);
		lblWight = new JLabel("Enter the wight:",SwingConstants.RIGHT);
		lblArea = new JLabel("Area:",SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Perimeter:",SwingConstants.RIGHT);

		GridLayout L = new GridLayout(4, 1);
		setLayout(L);
		add(lblLength); //add(txtLength);
		add(lblWight); //add(txtWight);
		add(lblArea);// add(txtArea);
		add(lblPerimeter); //add(txtPerimeter);
	}

	public static void main(String[] args) {
		testGUI prog = new testGUI();

	}

}
