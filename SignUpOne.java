package BankManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
// this will help in creating the calendar part in the dob field area.

public class SignUpOne extends JFrame implements ActionListener {

    // All the objects are now being globally declared.
    long Random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
    JLabel formno, personalDetails, name, fname, dob,gender, email, marital, address, city, state, pincode;
    JRadioButton male, female, prefer, married, unmarried, other;
    JDateChooser dateChooser;
    JButton next;

    SignUpOne(){  // here for every action we have a same step and that is to create constructor.

        setLayout(null);
        Random ran = new Random();
        long random = Math.abs(ran.nextLong() % 9000L + 1000L);
        // math.abs converts every number to positive and 9000l + 1000L
        // formula helps in getting 4 digits number.

        formno = new JLabel("APPLICATION FORM NUMBER: " + random);
        formno.setFont(new Font("Raleway",Font.BOLD,30));
        formno.setBounds(140,20,600,40);
        add(formno);

        personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

        name = new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(nameTextField);

        fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(100,190,200,30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setBounds(300,190,400,30);
        fnameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(fnameTextField);

        dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(100,240,300,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        // to add color in RGB you have to create new color class and then put the value of the color.
        add(dateChooser);

        gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.LIGHT_GRAY);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(400,290,120,30);
        female.setBackground(Color.LIGHT_GRAY);
        add(female);
        prefer = new JRadioButton("Prefer not to say");
        prefer.setBounds(560,290,160,30);
        prefer.setBackground(Color.LIGHT_GRAY);
        add(prefer);
        // JRadioButton help to create the option to select in the field of Gender.

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(prefer);
        // there was an issue that all the button were getting selected, whereas only
        // one button is supposed to be selected, so we have use ButtonGroup class object.

        email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(100,340,200,30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setBounds(300,340,400,30);
        emailTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(emailTextField);

        marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
        marital.setBounds(100,390,200,30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.LIGHT_GRAY);
        add(married);
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.LIGHT_GRAY);
        add(unmarried);
        other = new JRadioButton("Others");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.LIGHT_GRAY);
        add(other);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);
        // here same process is done for the marital field.

        address = new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100,440,200,30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setBounds(300, 440,400,30);
        addressTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(addressTextField);

        city = new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(100,490,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setBounds(300, 490,400,30);
        cityTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cityTextField);

        state = new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(100,540,200,30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setBounds(300,540,400,30);
        stateTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(stateTextField);

        pincode = new JLabel("PIN Code: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setBounds(300,590,400,30);
        pincodeTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pincodeTextField);

        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Ralway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(850,850);
        setLocation(350,10);
        setVisible(true);
        setTitle("Personal Information");
    }
    public void actionPerformed(ActionEvent ae){
        String formno = "" + Random;// Here we have to convert the random value to string, so we have added "".
        String name =  nameTextField.getText(); // with the help of getText we can take out the value of
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if(female.isSelected()){
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        } else if(unmarried.isSelected()){
            marital = "Unmarried";
        } else if(other.isSelected()){
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String pincode = pincodeTextField.getText();
        String state = stateTextField.getText();

        try{
            if(name.equals("") || address.equals("") || city.equals("") || pincode.equals("") || state.equals("")){
                JOptionPane.showMessageDialog(null, "Please fill all the Details.");
                // this will help in giving a message if the all the areas is not filled.
            } else {
                Conn c = new Conn();
                String query = "";
                // here we are establishing the connection with the database and the Conn file with SignUp file.
                // basically the signup file is connected with the sql workbench and conn file is connected to signup file
            }
        } catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new SignUpOne();
    }
}
