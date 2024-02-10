package javaPractice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiJava implements ActionListener {
	private static JLabel label1, label2, output;
	private static JButton button;
	private static JTextField textfield;
	
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		
		JFrame frame = new JFrame();
		frame.setTitle("GUI SAKALAM");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350,300);
		frame.add(panel);
		
		label1 = new JLabel("Hello");
		label1.setBounds(10,20, 80, 25);
		panel.add(label1);
		
		label2 = new JLabel("WOORLD!!!");
		label2.setBounds(50, 20, 80, 25);
		panel.add(label2);
		
		button = new JButton("AIGOO");
		button.setBounds(10, 50, 85, 30);
		button.setFocusable(false);
		button.setBackground(Color.RED);
		button.setForeground(Color.WHITE);
		button.addActionListener(new GuiJava());
		panel.add(button);
		
		textfield = new JTextField(30);
		textfield.setBounds(10, 110, 200, 20);
		panel.add(textfield);
		
		output = new JLabel("");
		output.setBounds(10, 140, 110, 25);
		panel.add(output);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String input = textfield.getText();
		
		if(input.equalsIgnoreCase("Aigoo")) {
			output.setText("Gumana aigoo!!");
		}else {
			output.setText("Di gumana Aishhh");
		}
	}
}
