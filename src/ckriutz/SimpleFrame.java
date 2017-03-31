package ckriutz;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SimpleFrame  implements  ActionListener {

	private JTextField textField;
	
	void createFrame() {
		// First thing we want is a frame. So, like a window.
		JFrame frame = new JFrame(); //creating instance of JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Hello Frame"); //give it a title.
		
		// Now we need a panel. We put things into this panel.
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(20, 20, 20, 20)); // Padding.
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		frame.add(panel);
		
		// Lets add a label to put some text in.
		JLabel titleLabel = new JLabel("Simple Desktop Application", JLabel.LEFT);
		titleLabel.setFont(new Font("Serif", Font.PLAIN, 38));
		titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		titleLabel.setBorder(new EmptyBorder(20,20,20,20)); // more padding.
		panel.add(titleLabel);
		
		// Now a button. When we press it. It will call actionPerformed.
		JButton button = new JButton("Press Me"); //creating instance of JButton 
		button.setFont(new Font("Serif", Font.PLAIN, 28));
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.addActionListener(this); // This is how we wire it up I guess.
		panel.add(button);
		
		// This is like a spacer to give some room in between the button and
		// the textfield below it.
		panel.add(Box.createRigidArea(new Dimension(20,20)));
		
		// This textfield will hold text.
		textField = new JTextField("");
		textField.setFont(new Font("Serif", Font.PLAIN, 28));
		textField.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(textField);


		frame.pack(); // This means make the window fit the contents.
		frame.setLocationByPlatform(true);   
		frame.setVisible(true); //making the frame visible
		
	}
	
	// Button Action Event.
	public void actionPerformed(ActionEvent event) {
		textField.setText("Button Pressed");
	}

}
