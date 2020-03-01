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

public class AddWindow extends JFrame {
	// declare variables need for the add window
	Integer counter = 1;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fnameField;
	private JTextField lnameField;
	private JTextField houseField;
	private JTextField streetField;
	private JTextField mNameField;
	private JTextField cityField;
	private JTextField countryField;
	private JTextField usernameField;
	private JLabel lblHouseNo;
	private JLabel lblStreet;
	private JLabel lblCity;
	private JLabel lblCountry;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblConfirm;
	private JLabel lblUserDetails;
	private JLabel lblMiddleName;
	private JPasswordField passwordField;
	private JPasswordField confirmField;

	// constructor
	public AddWindow() {
		//setAlwaysOnTop(true); // same as the previous windows settings
		setType(Type.POPUP); // but set to pop up type
		setTitle("Add row");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 708);
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

		JLabel emailLabel = new JLabel("Full Address");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		emailLabel.setBounds(314, 222, 117, 16);
		contentPane.add(emailLabel);

		// create blue panel for design
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(new Color(0, 100, 0));
		bluePanel.setBounds(0, 0, 590, 53);
		contentPane.add(bluePanel);
		bluePanel.setLayout(null);

		// label for the header of the window
		JLabel addMemberLabel = new JLabel("ADD NEW USER");
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

		houseField = new JTextField();
		houseField.setToolTipText("Input valid email that follow the standard format");
		houseField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		houseField.setColumns(10);
		houseField.setBounds(172, 251, 385, 36);
		contentPane.add(houseField);

		// create buttons save, cancel
		JButton createLibrarian = new JButton("Create Librarian");
		createLibrarian.setFont(new Font("Tahoma", Font.BOLD, 14));
		createLibrarian.setBackground(new Color(60, 179, 113));
		createLibrarian.setForeground(Color.WHITE);
		createLibrarian.setBounds(83, 646, 172, 41);
		contentPane.add(createLibrarian);

		JButton btnCancel = new JButton("EXIT");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBackground(new Color(192, 192, 192));
		btnCancel.setBounds(478, 646, 97, 41);
		contentPane.add(btnCancel);
		
		streetField = new JTextField();
		streetField.setToolTipText("Input valid email that follow the standard format");
		streetField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		streetField.setColumns(10);
		streetField.setBounds(172, 300, 385, 36);
		contentPane.add(streetField);
		
		mNameField = new JTextField();
		mNameField.setToolTipText("Input valid email that follow the standard format");
		mNameField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mNameField.setColumns(10);
		mNameField.setBounds(172, 176, 385, 36);
		contentPane.add(mNameField);
		
		cityField = new JTextField();
		cityField.setToolTipText("Input valid email that follow the standard format");
		cityField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cityField.setColumns(10);
		cityField.setBounds(172, 349, 385, 36);
		contentPane.add(cityField);
		
		countryField = new JTextField();
		countryField.setToolTipText("Input valid email that follow the standard format");
		countryField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		countryField.setColumns(10);
		countryField.setBounds(172, 398, 385, 36);
		contentPane.add(countryField);
		
		usernameField = new JTextField();
		usernameField.setToolTipText("Input valid email that follow the standard format");
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		usernameField.setColumns(10);
		usernameField.setBounds(172, 477, 385, 36);
		contentPane.add(usernameField);
		
		lblHouseNo = new JLabel("House No:");
		lblHouseNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHouseNo.setBounds(32, 261, 117, 16);
		contentPane.add(lblHouseNo);
		
		lblStreet = new JLabel("Street:");
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStreet.setBounds(32, 310, 117, 16);
		contentPane.add(lblStreet);
		
		lblCity = new JLabel("City:");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCity.setBounds(32, 359, 117, 16);
		contentPane.add(lblCity);
		
		lblCountry = new JLabel("Country:");
		lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCountry.setBounds(32, 408, 117, 16);
		contentPane.add(lblCountry);
		
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(32, 487, 117, 16);
		contentPane.add(lblUsername);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(32, 536, 117, 16);
		contentPane.add(lblPassword);
		
		lblConfirm = new JLabel("Confirm Pass:");
		lblConfirm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConfirm.setBounds(32, 585, 117, 16);
		contentPane.add(lblConfirm);
		
		lblUserDetails = new JLabel("Login ");
		lblUserDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUserDetails.setBounds(314, 447, 117, 16);
		contentPane.add(lblUserDetails);
		
		lblMiddleName = new JLabel("Middle Name:");
		lblMiddleName.setHorizontalAlignment(SwingConstants.LEFT);
		lblMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMiddleName.setBounds(32, 185, 117, 16);
		contentPane.add(lblMiddleName);
		
		JButton btnCreatePatron = new JButton("Create Patron");
		btnCreatePatron.setForeground(Color.WHITE);
		btnCreatePatron.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCreatePatron.setBackground(new Color(60, 179, 113));
		btnCreatePatron.setBounds(270, 646, 172, 41);
		contentPane.add(btnCreatePatron);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(172, 526, 385, 36);
		contentPane.add(passwordField);
		
		confirmField = new JPasswordField();
		confirmField.setBounds(172, 575, 385, 36);
		contentPane.add(confirmField);

		// create random object - r for the membership id
		Random r = new Random();
		ArrayList<String> usernameList = new ArrayList<String>(); 

		
		// save button
		createLibrarian.addActionListener(new ActionListener() {

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
							|| houseField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Please input required information.", "Null",
								JOptionPane.ERROR_MESSAGE);
					}else if(!Arrays.equals(passwordField.getPassword(), confirmField.getPassword())){

						JOptionPane.showMessageDialog(null, "Password does not match.", "Null",
								JOptionPane.ERROR_MESSAGE);
					}else {
						String memberNum = "20" +String.format("%04d", codes.get(0)); // format memberNum to 4 digits only
									//											// the list
						Dashboard.model.addRow(new Object[] {
								// set the new row of the table to this values
								memberNum, "Librarian",fnameField.getText(), lnameField.getText(), mNameField.getText(),
								houseField.getText(), streetField.getText(), cityField.getText(), countryField.getText(),"true", "0", "0"});
						usernameList.add(usernameField.getText());
						// LAGAY LAHAT NG ITO SA DATABASE, PATI YUNG PASSWORD NA DI KASAMA SA TABLE passwordField.getText()
						
					}
				}

			}
		});
		
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
							|| houseField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Please input required information.", "Null",
								JOptionPane.ERROR_MESSAGE);
					}else if(!Arrays.equals(passwordField.getPassword(), confirmField.getPassword())){

						JOptionPane.showMessageDialog(null, "Password does not match.", "Null",
								JOptionPane.ERROR_MESSAGE);
					}else if(usernameList.contains(usernameField.getText())){

						JOptionPane.showMessageDialog(null, "Username already exists.", "Null",
								JOptionPane.ERROR_MESSAGE);
					}else {
						String memberNum = "15" +String.format("%04d", codes.get(0)); // format memberNum to 4 digits only
									//											// the list
						Dashboard.model.addRow(new Object[] {
								// set the new row of the table to this values
								memberNum, "Patron",fnameField.getText(), lnameField.getText(), mNameField.getText(),
								houseField.getText(), streetField.getText(), cityField.getText(), countryField.getText(),"true", "0", "0"});
						usernameList.add(usernameField.getText());
						// LAGAY LAHAT NG ITO SA DATABASE, PATI YUNG PASSWORD NA DI KASAMA SA TABLE passwordField.getText()
						
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
