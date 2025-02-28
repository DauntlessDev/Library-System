/* Home - this is where the login window is.
 * Contraints : Username ignores case, while password do not.
 * 				Empty field are not allowed and handled */
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame  {
	// set the serialVersion UID to default
	private static final long serialVersionUID = 1L; 
	//default values for the password and username of login
	String adminusername = "Admin";
	String adminpassword = "pass";
	// declare variables needed for the GUI
	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;    
	
	//constructor
	public Home() {
		setForeground(Color.BLUE);
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/images/acmlogo.jpg"))); //display image from the images folder
		setTitle("Library System");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 771, 527);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null); //set location to center
		setResizable(false); // dont allow resize
		
		// set the panels needed for the modern design
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 299, 492);
		mainPanel.setBackground(new Color(34, 139, 34));
		contentPane.add(mainPanel);
		
		
		// set design and font for the labels
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		usernameLabel.setBounds(356, 127, 93, 16);
		contentPane.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		passwordLabel.setBounds(356, 228, 70, 16);
		contentPane.add(passwordLabel);
		

		// label for guideline
		JLabel loginLabel = new JLabel("Login to Continue");
		loginLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		loginLabel.setForeground(Color.BLACK);
		loginLabel.setBounds(441, 19, 209, 109);
		contentPane.add(loginLabel);
		
		//for the logo at the top right
		JLabel iconLabel = new JLabel("");
		//iconLabel.setIcon(new ImageIcon(Home.class.getResource("/images/acmbrand.jpg")));
		mainPanel.add(iconLabel);
	
		
		// user input box and its settings
		usernameField = new JTextField();
		usernameField.setBackground(new Color(255, 250, 250));
		usernameField.setBounds(356, 156, 349, 43);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		// password input box and its settings
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 250, 250));
		passwordField.setToolTipText("");
		passwordField.setBounds(356, 257, 349, 43);
		contentPane.add(passwordField);
		passwordField.setColumns(10);

		// login button and its settings
		JButton librarianButton = new JButton("Login as Librarian");
		librarianButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		librarianButton.setForeground(Color.WHITE);
		librarianButton.setBackground(new Color(60, 179, 113));
		librarianButton.setBounds(356, 349, 200, 36);
		contentPane.add(librarianButton);
		
		// cancel button and its settings
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setForeground(Color.WHITE);
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		cancelButton.setBackground(Color.GRAY);
		cancelButton.setBounds(603, 349, 102, 36);
		contentPane.add(cancelButton);
		
		JButton patronButton = new JButton("Login as Patron");
		patronButton.setForeground(Color.WHITE);
		patronButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		patronButton.setBackground(new Color(60, 179, 113));
		patronButton.setBounds(356, 401, 200, 36);
		contentPane.add(patronButton);
	
		
		
		// uses Anonymous way of implementation for the event handler of all buttons
		
		//cancel button  - for the exit of the user
        cancelButton.addActionListener(new ActionListener(){
        	 public void actionPerformed(ActionEvent e){
        	            int response = JOptionPane.showConfirmDialog(
        	                rootPane,
        	                "Are you sure you want to exit the program?",
        	                "Confirm exit",
        	                JOptionPane.OK_CANCEL_OPTION, 
        	                JOptionPane.QUESTION_MESSAGE);
        	            
        	            if (response==0){
        	                System.exit(0); // if ok then exit
        	            }  

        }});
        /*login button - get the string and char values
         	of username and password that is inputted and 
         	check if both matches the default username and password 
         	if yes proceed if not then display error message depending 
         	on the condition */
        librarianButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
			   if(e.getSource()==librarianButton) {
					String userName = usernameField.getText(); 
					char[] password = passwordField.getPassword();
			        if (userName.trim().equalsIgnoreCase(adminusername) && String.valueOf(password).contentEquals(adminpassword)) {
			        		JOptionPane.showMessageDialog(null, "Account Verified, Login Success", "Success", JOptionPane.INFORMATION_MESSAGE);
			        		Dashboard db = new Dashboard();  		
			        		db.setVisible(true);
			        		dispose();
			        }else if (userName.trim().equals("") || String.valueOf(password).contentEquals("")) {
			        	
			        	JOptionPane.showMessageDialog(null, "Please input required information.", "Null", JOptionPane.ERROR_MESSAGE);
			        }else {
			        	JOptionPane.showMessageDialog(null, "Invalid Username/Password, please try again.", "Invalid", JOptionPane.ERROR_MESSAGE);
			        }
				    	
			   }
        	}
        });
        
        patronButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
			   if(e.getSource()==librarianButton) {
					String userName = usernameField.getText(); 
					char[] password = passwordField.getPassword();
			        if (userName.trim().equalsIgnoreCase(adminusername) && String.valueOf(password).contentEquals(adminpassword)) {
			        		JOptionPane.showMessageDialog(null, "Account Verified, Login Success", "Success", JOptionPane.INFORMATION_MESSAGE);
			        		//CREATE MO DITO YUNG DASHBOARD FOR USER UI 
			        }else if (userName.trim().equals("") || String.valueOf(password).contentEquals("")) {
			        	
			        	JOptionPane.showMessageDialog(null, "Please input required information.", "Null", JOptionPane.ERROR_MESSAGE);
			        }else {
			        	JOptionPane.showMessageDialog(null, "Invalid Username/Password, please try again.", "Invalid", JOptionPane.ERROR_MESSAGE);
			        }
				    	
			   }
        	}
        });
	}
	
}
