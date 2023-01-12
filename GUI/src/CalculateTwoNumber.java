import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setBounds(31, 11, 102, 22);
		contentPane.add(lblNumber1);

		txtNumber1 = new JTextField();
		txtNumber1.setBounds(135, 12, 118, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);

		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setBounds(31, 44, 102, 22);
		contentPane.add(lblNumber2);

		txtNumber2 = new JTextField();
		txtNumber2.setBounds(135, 44, 118, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);

		final JLabel lblResult = new JLabel("Show Result");
		lblResult.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblResult.setBounds(262, 194, 109, 22);
		contentPane.add(lblResult);

		JLabel lbloperator = new JLabel("Operator");
		lbloperator.setBounds(31, 77, 102, 14);
		contentPane.add(lbloperator);

		final JComboBox cbOperator = new JComboBox();
		cbOperator.setBounds(135, 77, 45, 22);
		cbOperator.addItem("+");
		cbOperator.addItem("-");
		cbOperator.addItem("*");
		cbOperator.addItem("/");
		contentPane.add(cbOperator);

		JLabel radOperator = new JLabel("How to show Digit");
		radOperator.setBounds(31, 119, 118, 14);
		contentPane.add(radOperator);

		final JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setBounds(135, 115, 109, 23);
		contentPane.add(oneDigit);

		final JRadioButton TwoDigit = new JRadioButton("2 Digit");
		TwoDigit.setBounds(135, 140, 109, 23);
		contentPane.add(TwoDigit);

		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(TwoDigit);

		JLabel lblOption = new JLabel("Option to show");
		lblOption.setBounds(31, 176, 102, 14);
		contentPane.add(lblOption);

		final JCheckBox chckbxOption = new JCheckBox("Show Result at DialogBox");
		chckbxOption.setBounds(135, 172, 174, 23);
		contentPane.add(chckbxOption);

		final JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, sum = 0;
				String operator;
				// JButton
				if (e.getSource() == btnOk) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					operator = (String) cbOperator.getSelectedItem();
					if (operator.equals("+"))
						sum = num1 + num2;
					if (operator.equals("-"))
						sum = num1 - num2;
					if (operator.equals("*"))
						sum = num1 * num2;
					if (operator.equals("/"))
						sum = num1 / num2;

					// JRadioButton
					DecimalFormat frmNumber = null;
					if (oneDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					} else if (TwoDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}

					lblResult.setText(frmNumber.format(sum));
					// JCheckBox
					if (chckbxOption.isSelected()) {
						JOptionPane.showMessageDialog(null, "Result is : " + frmNumber.format(sum));
					}
				}
			}
		});

		btnOk.setBounds(98, 227, 89, 23);
		contentPane.add(btnOk);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(237, 227, 89, 23);
		contentPane.add(btnExit);

	}
}
