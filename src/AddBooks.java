import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AddBooks extends JFrame {
	// declare variables need for the add window
	Integer counter = 1;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField isbnField;
	private JTextField titleField;
	private JTextField copyField;
	private JLabel lblHouseNo;
	private JLabel lblStreet;
	private JLabel lblCity;
	private JLabel lblMiddleName;
	private JSpinner spinner;
	private JComboBox authorComboBox;
	private JComboBox shelfComboBox;
	private JTextField yearField;

	// constructor
	public AddBooks() {
		//setAlwaysOnTop(true); // same as the previous windows settings
		setType(Type.POPUP); // but set to pop up type
		setTitle("Add row");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 471);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		setResizable(false);

		// create labels and set fonts and size
		JLabel firstnameLabel = new JLabel("ISBN Number");
		firstnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		firstnameLabel.setBounds(32, 88, 147, 16);
		contentPane.add(firstnameLabel);

		JLabel lastnameLabel = new JLabel("Title");
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
		JLabel addMemberLabel = new JLabel("ADD NEW BOOKS");
		addMemberLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
		addMemberLabel.setBounds(230, 0, 153, 53);
		addMemberLabel.setForeground(new Color(255, 255, 255));
		bluePanel.add(addMemberLabel);

		// create text fields and set the inputs' font and size
		isbnField = new JTextField();
		isbnField.setToolTipText("First name should start with capital letter");
		isbnField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		isbnField.setColumns(10);
		isbnField.setBounds(172, 79, 385, 36);
		contentPane.add(isbnField);

		titleField = new JTextField();
		titleField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		titleField.setColumns(10);
		titleField.setBounds(172, 128, 385, 36);
		contentPane.add(titleField);

		JButton btnCancel = new JButton("EXIT");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBackground(new Color(192, 192, 192));
		btnCancel.setBounds(451, 413, 97, 41);
		contentPane.add(btnCancel);
		
		copyField = new JTextField();
		copyField.setToolTipText("Input valid email that follow the standard format");
		copyField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		copyField.setColumns(10);
		copyField.setBounds(172, 349, 385, 36);
		contentPane.add(copyField);
		
		lblHouseNo = new JLabel("Authors ID:");
		lblHouseNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHouseNo.setBounds(32, 261, 117, 16);
		contentPane.add(lblHouseNo);
		
		lblStreet = new JLabel("Shelf ID:");
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStreet.setBounds(32, 310, 117, 16);
		contentPane.add(lblStreet);
		
		lblCity = new JLabel("Copy Number:");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCity.setBounds(32, 359, 117, 16);
		contentPane.add(lblCity);
		
		lblMiddleName = new JLabel("Publication Year:");
		lblMiddleName.setHorizontalAlignment(SwingConstants.LEFT);
		lblMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMiddleName.setBounds(32, 185, 117, 16);
		contentPane.add(lblMiddleName);
		
		JButton addBook = new JButton("ADD BOOK");
		addBook.setForeground(Color.WHITE);
		addBook.setFont(new Font("Tahoma", Font.BOLD, 14));
		addBook.setBackground(new Color(60, 179, 113));
		addBook.setBounds(267, 413, 172, 41);
		contentPane.add(addBook);
		
		authorComboBox = new JComboBox();
		authorComboBox.setModel(new DefaultComboBoxModel(new String[] {"10000", "10001", "10002", "10003"}));
		authorComboBox.setBounds(172, 252, 385, 36);
		contentPane.add(authorComboBox);
		
		shelfComboBox = new JComboBox();
		shelfComboBox.setModel(new DefaultComboBoxModel(new String[] {"30000", "30001", "30002", "30003"}));
		shelfComboBox.setBounds(172, 300, 385, 36);
		contentPane.add(shelfComboBox);
		
		yearField = new JTextField();
		yearField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		yearField.setColumns(10);
		yearField.setBounds(172, 177, 385, 36);
		contentPane.add(yearField);
		
	

		// create random object - r for the membership id
		Random r = new Random();
//		ArrayList<String> usernameList = new ArrayList<String>();
		
		addBook.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// shows confirmation message
				int response = JOptionPane.showConfirmDialog(rootPane, "Add this to table?", "Confirm addition",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

				if (response == 0) { // if ok then
					// create list to put all numbers generated to keep track if has duplicates
					// if has duplicate then try to generate another random number to set it to
					// membership id
//					List<Integer> codes = new ArrayList<>();
//					for (int i = 0; i < 10; i++) {
//						int x = r.nextInt(9999);
//						while (codes.contains(x))
//							x = r.nextInt(9999);
//						codes.add(x);
//					}
//					
					if (isbnField.getText().trim().equals("") || titleField.getText().equals("")
							) {
						JOptionPane.showMessageDialog(null, "Please input required information.", "Null",
								JOptionPane.ERROR_MESSAGE);
					}else {
//						String memberNum = "15" +String.format("%04d", codes.get(0)); // format memberNum to 4 digits only
//									//											// the list

						String author = String.valueOf(authorComboBox.getSelectedItem());
						String shelf = String.valueOf(shelfComboBox.getSelectedItem());
						BooksDashboard.model.addRow(new Object[] {
//								 set the new row of the table to this values
							isbnField.getText(), titleField.getText(), yearField.getText(),
								author, shelf, copyField.getText()});
						
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
