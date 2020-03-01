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
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class AddAuthor extends JFrame {
	// declare variables need for the add window
	Integer counter = 1;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fnameField;
	private JTextField lnameField;
	private JTextField mNameField;
	private JLabel lblMiddleName;
	static ArrayList<String> authorList;
	// constructor
	public AddAuthor() {
		//setAlwaysOnTop(true); // same as the previous windows settings
		setType(Type.POPUP); // but set to pop up type
		setTitle("Add row");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 301);
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

		// create blue panel for design
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(new Color(0, 100, 0));
		bluePanel.setBounds(0, 0, 590, 53);
		contentPane.add(bluePanel);
		bluePanel.setLayout(null);

		// label for the header of the window
		JLabel addMemberLabel = new JLabel("ADD NEW AUTHOR");
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

		JButton btnCancel = new JButton("EXIT");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBackground(new Color(192, 192, 192));
		btnCancel.setBounds(460, 246, 97, 41);
		contentPane.add(btnCancel);
		
		mNameField = new JTextField();
		mNameField.setToolTipText("Input valid email that follow the standard format");
		mNameField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mNameField.setColumns(10);
		mNameField.setBounds(172, 176, 385, 36);
		contentPane.add(mNameField);
		
		lblMiddleName = new JLabel("Middle Name:");
		lblMiddleName.setHorizontalAlignment(SwingConstants.LEFT);
		lblMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMiddleName.setBounds(32, 185, 117, 16);
		contentPane.add(lblMiddleName);
		
		JButton btnCreatePatron = new JButton("ADD AUTHOR");
		btnCreatePatron.setForeground(Color.WHITE);
		btnCreatePatron.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCreatePatron.setBackground(new Color(60, 179, 113));
		btnCreatePatron.setBounds(276, 246, 172, 41);
		contentPane.add(btnCreatePatron);

		// create random object - r for the membership id
		Random r = new Random();
		authorList = new ArrayList<String>();
		
		btnCreatePatron.addActionListener(new ActionListener() {

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
					
					if (fnameField.getText().trim().equals("") || lnameField.getText().equals("")
							|| mNameField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Please input required information.", "Null",
								JOptionPane.ERROR_MESSAGE);
					}else {
						String authorID = "10" +String.format("%04d", codes.get(0)); // format memberNum to 4 digits only
									//											// the list
						Dashboard.model.addRow(new Object[] {
								// set the new row of the table to this values
								authorID, "Patron",fnameField.getText(), lnameField.getText(), mNameField.getText()});
						authorList.add(authorID);
						// LAGAY LAHAT NG ITO SA DATABASE, PATI YUNG PASSWORD NA DI KASAMA SA TABLE passwordField.getText()
						

						JOptionPane.showMessageDialog(null, "Added Author Successfully.", "Null",
								JOptionPane.INFORMATION_MESSAGE);
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
