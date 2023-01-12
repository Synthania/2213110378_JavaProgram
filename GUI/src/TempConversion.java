import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TempConversion extends JFrame {
	private JLabel lblCelsius;
	private JLabel lblFahrenhiet;
	private JTextField tfCelsius;
	private JTextField tfFahrenhiet;

	private static final int WTGHT = 500;
	private static final int HEIGHT = 100;
	private static final double FTOC = 5.0 / 9.0;
	private static final double CTOF = 9.0 / 5.0;
	private static final double OFFSET = 32;

	public TempConversion() {

		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 4));
		lblCelsius = new JLabel("Temp in Celsius:", SwingConstants.RIGHT);
		lblFahrenhiet = new JLabel("Temp in Fahrenhiet:", SwingConstants.RIGHT);
		tfCelsius = new JTextField(10);
		tfFahrenhiet = new JTextField(10);

		c.add(lblCelsius);
		c.add(tfCelsius);
		c.add(lblFahrenhiet);
		c.add(tfFahrenhiet);

		CelsHandler celsiusHandler = new CelsHandler();
		tfCelsius.addActionListener(celsiusHandler);
		fahrenhiet fahrenhiett = new fahrenhiet();
		tfFahrenhiet.addActionListener(fahrenhiett);

		setTitle("Temperature conversion");
		setSize(WTGHT, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private class CelsHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double celsius, fahrenhiet;
			celsius = Double.parseDouble(tfCelsius.getText());
			fahrenhiet = celsius * CTOF + OFFSET;
			tfFahrenhiet.setText(String.format("%.2f", fahrenhiet));
		}
	}

	private class fahrenhiet implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double celsius, fahrenhiet;
			fahrenhiet = Double.parseDouble(tfFahrenhiet.getText());
			celsius = (fahrenhiet - OFFSET) * FTOC;
			tfCelsius.setText(String.format("%.2f", celsius));
		}
	}

	public static void main(String[] args) {
		TempConversion temp = new TempConversion();
	}

}
