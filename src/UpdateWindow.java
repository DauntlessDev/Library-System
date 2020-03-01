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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class UpdateWindow extends JFrame {
	// declare variables need for the add window
	Integer counter = 1;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextField fnameField;
	 JTextField lnameField;
	JTextField houseField;
	JTextField streetField;
	JTextField mNameField;
	JTextField cityField;
	JSpinner borrowComboBox;
	JSpinner numComboBox;
	JTextField countryField;
	private JLabel lblHouseNo;
	private JLabel lblStreet;
	private JLabel lblCity;
	private JLabel lblCountry;
	private JLabel canborrowLbl;
	private JLabel lblPassword;
	private JLabel lblConfirm;
	private JLabel lblUserDetails;
	private JLabel lblMiddleName;
	JTextField fineField;

	// constructor
	public UpdateWindow() {
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
		JLabel addMemberLabel = new JLabel("UPDATE USER ");
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
		
		canborrowLbl = new JLabel("Can Borrow:");
		canborrowLbl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		canborrowLbl.setBounds(32, 487, 117, 16);
		contentPane.add(canborrowLbl);
		
		lblPassword = new JLabel("No. of Borrowed");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(32, 536, 128, 16);
		contentPane.add(lblPassword);
		
		lblConfirm = new JLabel("Fine");
		lblConfirm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConfirm.setBounds(32, 585, 117, 16);
		contentPane.add(lblConfirm);
		
		lblUserDetails = new JLabel("Library Info");
		lblUserDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUserDetails.setBounds(314, 447, 117, 16);
		contentPane.add(lblUserDetails);
		
		lblMiddleName = new JLabel("Middle Name:");
		lblMiddleName.setHorizontalAlignment(SwingConstants.LEFT);
		lblMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMiddleName.setBounds(32, 185, 117, 16);
		contentPane.add(lblMiddleName);
		
		JButton saveButton = new JButton("Update User");
		saveButton.setForeground(Color.WHITE);
		saveButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		saveButton.setBackground(new Color(60, 179, 113));
		saveButton.setBounds(270, 646, 172, 41);
		contentPane.add(saveButton);
		
		fineField = new JTextField();
		fineField.setToolTipText("Input valid email that follow the standard format");
		fineField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fineField.setColumns(10);
		fineField.setBounds(172, 575, 385, 36);
		contentPane.add(fineField);
		borrowComboBox = new JSpinner();
		numComboBox = new JSpinner();
		borrowComboBox.setModel(new SpinnerListModel(new String[] {"true", "false"}));
		borrowComboBox.setBounds(172, 478, 385, 36);
		contentPane.add(borrowComboBox);

		numComboBox.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		numComboBox.setBounds(172, 527, 385, 36);
		contentPane.add(numComboBox);

		// create random object - r for the membership id
		Random r = new Random();	

		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// i = the index of the selected row
				int i = Dashboard.table.getSelectedRow();
				int response = JOptionPane.showConfirmDialog(rootPane, "Add this to table?", "Confirm addition",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

				if (response == 0) {
					if (i >= 0) {
						try { // based on selected row check each values if there is an error
							if (fnameField.getText().trim().equals("") || lnameField.getText().equals("")
									|| houseField.getText().equals("")) {
								JOptionPane.showMessageDialog(null, "Please input required information.", "Null",
										JOptionPane.ERROR_MESSAGE);
							}else {
								String canBorrow = String.valueOf(borrowComboBox.getValue());
								String numOfBorrow = String.valueOf(numComboBox.getValue());
								Dashboard.model.setValueAt(fnameField.getText(), i, 2);
								Dashboard.model.setValueAt(lnameField.getText(), i, 3);
								Dashboard.model.setValueAt(mNameField.getText(), i, 4);
								Dashboard.model.setValueAt(houseField.getText(), i, 5);
								Dashboard.model.setValueAt(streetField.getText(), i, 6);
								Dashboard.model.setValueAt(cityField.getText(), i, 7);
								Dashboard.model.setValueAt(countryField.getText(), i, 8);
								Dashboard.model.setValueAt(canBorrow, i, 9);
								Dashboard.model.setValueAt(numOfBorrow, i,10);
								Dashboard.model.setValueAt(fineField.getText(), i, 11);

							}
						} catch (NullPointerException e2) {
						}
					} // if did not select a row, show message
					else {
						JOptionPane.showMessageDialog(null, "Please select a row to update.", "Error",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		
		// cancel button - same as other windows
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(rootPane, "Exit Update Window?", "Confirm exit",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

				if (response == 0) {
					dispose();
				}

			}
		});
		}
}