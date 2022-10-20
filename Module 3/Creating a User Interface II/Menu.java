
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Menu implements ActionListener {
	private JMenuItem option1, option2, option3, option4;
	private JMenuBar menuBar;
	private JTextField textBox;
	private JMenu menu;
	private JFrame frame;
	
	public Menu() {
		frame = new JFrame("Today's Date");
		frame.setLayout(null);
		
		menuBar = new JMenuBar();
		textBox = new JTextField();
		menu = new JMenu("Menu Options");
		
		//below are the four options users can utilize from the menu bar
		option1 = new JMenuItem("Display Date & Time");
		option2 = new JMenuItem("Print Text to a File");
		option3 = new JMenuItem("Change the Frame's Color");
		option4 = new JMenuItem("Exit Program");
		
		option1.addActionListener(this);
		option2.addActionListener(this);
		option3.addActionListener(this);
		option4.addActionListener(this);
		
		menu.add(option1);
		menu.add(option2);
		menu.add(option3);
		menu.add(option4);
		
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		
		textBox.setBounds(15, 25, 300, 30);
		textBox.setEditable(false);
		
		frame.add(textBox);
		frame.setVisible(true);
		frame.setSize(350, 150);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PrintWriter writer = null;
		
		if (e.getSource() == option1) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
			LocalDateTime currentTime = LocalDateTime.now();
			
			textBox.setText("The current date and time is " + dtf.format(currentTime) + ".");
			textBox.setHorizontalAlignment(JTextField.CENTER);
		}
		else if (e.getSource() == option2) {
			String todaysDate = textBox.getText();
			try {
				writer = new PrintWriter("./log.txt");
				writer.print(todaysDate);
			} catch(IOException e1) {
				textBox.setText("Error: Printing data failed. Caught IOException: " + e1.getMessage());
			} finally {
				writer.close();
			}
		}
		else if (e.getSource() == option3) {
			frame.getContentPane().setBackground(new Color(255, 150, 0));
		}
		else if (e.getSource() == option4) {
			frame.setVisible(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
}
