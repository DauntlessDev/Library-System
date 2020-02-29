import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AddWindow extends JFrame {
	// declare variables need for the add window
	Integer counter = 1;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fnameField;
	private JTextField lnameField;
	private JTextField emailField;

	// constructor
	public AddWindow() {
		setAlwaysOnTop(true); // same as the previous windows settings
		setType(Type.POPUP); // but set to pop up type
		setTitle("Add row");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 284);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		setResizable(false);

		// create labels and set fonts and size
		JLabel firstnameLabel = new JLabel("First Name:");
		firstnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		firstnameLabel.setBounds(32, 88, 147, 16);
		contentPane.add(firstnameLabel);

		JLabel lastnameLabel = new JLabel("Last Name:");
		lastnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lastnameLabel.setBounds(32, 137, 122, 16);
		contentPane.add(lastnameLabel);

		JLabel emailLabel = new JLabel("Address:");
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		emailLabel.setBounds(32, 186, 117, 16);
		contentPane.add(emailLabel);

		// create blue panel for design
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(new Color(0, 100, 0));
		bluePanel.setBounds(0, 0, 590, 53);
		contentPane.add(bluePanel);
		bluePanel.setLayout(null);

		// label for the header of the window
		JLabel addMemberLabel = new JLabel("ADD NEW PATRON");
		addMemberLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
		addMemberLabel.setBounds(230, 0, 153, 53);
		addMemberLabel.setForeground(new Color(255, 255, 255));
		bluePanel.add(addMemberLabel);

		// create text fields and set the inputs' font and size
		fnameField = new JTextField();
		fnameField.setToolTipText("First name should start with capital letter");
		fnameField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fnameField.setColumns(10);
		fnameField.setBounds(172, 79, 385, 36);
		contentPane.add(fnameField);

		lnameField = new JTextField();
		lnameField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lnameField.setColumns(10);
		lnameField.setBounds(172, 128, 385, 36);
		contentPane.add(lnameField);

		emailField = new JTextField();
		emailField.setToolTipText("Input valid email that follow the standard format");
		emailField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		emailField.setColumns(10);
		emailField.setBounds(172, 177, 385, 36);
		contentPane.add(emailField);

		// create buttons save, cancel
		JButton saveButton = new JButton("SAVE");
		saveButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		saveButton.setBackground(new Color(60, 179, 113));
		saveButton.setForeground(Color.WHITE);
		saveButton.setBounds(355, 226, 97, 41);
		contentPane.add(saveButton);

		JButton btnCancel = new JButton("EXIT");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBackground(new Color(192, 192, 192));
		btnCancel.setBounds(460, 226, 97, 41);
		contentPane.add(btnCancel);

		// create random object - r for the membership id
		Random r = new Random();

		// save button
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// shows confirmation message
				int response = JOptionPane.showConfirmDialog(rootPane, "Add this to table?", "Confirm addition",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

				if (response == 0) { // if ok then
					// create list to put all numbers generated to keep track if has duplicates
					// if has duplicate then try to generate another random number to set it to
					// membership id
					List<Integer> codes = new ArrayList<>();
					for (int i = 0; i < 10; i++) {
						int x = r.nextInt(9999);
						while (codes.contains(x))
							x = r.nextInt(9999);
						codes.add(x);
					}
					// check if email has duplicate
					if (!Dashboard.ifNotDuplicate("MemberID")) {
						JOptionPane.showMessageDialog(null, "There is a duplicate email", "Duplicate",
								JOptionPane.ERROR_MESSAGE);
					} // check if empty field
					else if (fnameField.getText().trim().equals("") || lnameField.getText().equals("")
							|| emailField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Please input required information.", "Null",
								JOptionPane.ERROR_MESSAGE);
					}
					// check if it follows the format for the first name, last name and email
					else if (!Dashboard.isFirstNameValid(fnameField.getText())) {
						JOptionPane.showMessageDialog(null,
								"Please input a valid First Name that starts with capital letter.", "Input Error",
								JOptionPane.WARNING_MESSAGE);
					} else if (!Dashboard.isLastNameValid(lnameField.getText())) {
						JOptionPane.showMessageDialog(null,
								"Please input a valid Last Name that starts with capital letter.", "Input Error",
								JOptionPane.WARNING_MESSAGE);
					} // else if not error then proceed in saving
					else {
						String memberNum = String.format("%04d", codes.get(0)); // format memberNum to 4 digits only
																				// the list
						Dashboard.model.addRow(new Object[] {
								// set the new row of the table to this values
								memberNum, fnameField.getText(), lnameField.getText(), emailField.getText(), "true", "0", "0"});
					}

				}

			}
		});
		// cancel button - same as other windows
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(rootPane, "Exit Add Window?", "Confirm exit",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

				if (response == 0) {
					dispose();
				}

			}
		});
	}

}
