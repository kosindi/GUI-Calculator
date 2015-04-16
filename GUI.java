import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class GUI implements ActionListener {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	private JTextField textField1;
	private JButton button;
	
	public GUI() {
		frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setSize(350, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.white);
		
		label = new JLabel();
		label.setText("Enter two numbers to be added");
		label = new JLabel();
		label.setText("---");
		
		textField = new JTextField(5);
		textField1 = new JTextField(5);
		
		button = new JButton("Find sum");
		button.addActionListener(this);
		
		panel.add(button);
		panel.add(label);
		panel.add(textField);
		panel.add(textField1);
		frame.add(panel);

		
	}
	
	public void actionPerformed(ActionEvent e) {
		double num1 = Double.parseDouble(textField.getText());
		double num2 = Double.parseDouble(textField1.getText());
		double sum = num1 + num2;
		JOptionPane.showMessageDialog(null, sum);
	}

}