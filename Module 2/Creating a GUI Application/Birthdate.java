import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Birthdate extends JFrame {
	private static Calendar now = Calendar.getInstance();
	
    private JButton button;
    
    private JLabel ageLabel;
    private int userAge;
    
    private JLabel monthLabel;
    private JTextField monthField;
   
    private JLabel dayLabel;
    private JTextField dayField;
    
    private JLabel yearLabel;
    private JTextField yearField;
    
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 120;
    private static final int CURRENT_MONTH = (now.get(Calendar.MONTH) + 1);
    private static final int CURRENT_DAY = now.get(Calendar.DAY_OF_MONTH);
    private static final int CURRENT_YEAR = now.get(Calendar.YEAR);

   //the class constructor
    public Birthdate() {
        createTextFields();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

	private void createPanel() {
		JPanel panel = new JPanel();

		panel.add(monthLabel);
		panel.add(monthField);
		panel.add(dayLabel);
		panel.add(dayField);
		panel.add(yearLabel);
		panel.add(yearField);
	
		panel.add(button);
		panel.add(ageLabel);
		add(panel);
		
		
	}

	private void createButton() {
		button = new JButton("Calculate Age");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int userMonth = 0;
				int userDay = 0;
				int userYear = 0;
				
				userMonth = Integer.parseInt(monthField.getText());
				userDay = Integer.parseInt(dayField.getText());
				userYear = Integer.parseInt(yearField.getText());
				
				if (userMonth < CURRENT_MONTH) {
					userAge = CURRENT_YEAR - userYear;
				} 
				else if ((userMonth == CURRENT_MONTH) && (userDay < CURRENT_DAY)) {
					userAge = CURRENT_YEAR  - userYear;
				}
				else if ((userMonth == CURRENT_MONTH) && (userDay == CURRENT_DAY)) {
					userAge = CURRENT_YEAR  - userYear;
				}
				else {
					userAge = CURRENT_YEAR - (userYear + 1);
				}
	
				ageLabel.setText("You are currently " + userAge + " years old.");
			}
		});
	}

	private void createTextFields() {
		ageLabel = new JLabel("");
		
		//FIELD_WIDTH = 2 because the month and date can have a max of 2 digits
		final int FIELD_WIDTH = 2; 
		monthLabel = new JLabel("Birth Month (Number): ");
		monthField = new JTextField(FIELD_WIDTH);
		dayLabel = new JLabel("Birth Day: ");
		dayField = new JTextField(FIELD_WIDTH);
		
		//FIELD_WIDTH = 4 because a year can contain four digits
		final int YEAR_WIDTH = 4; 
		yearLabel = new JLabel("Birth Year: ");
		yearField = new JTextField(YEAR_WIDTH);
		
		
	}
}
