package BankManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SignUpOne extends JFrame {
    public static void main(String[] args) {
        new SignUpOne();
    }

    SignUpOne(){  // here for every action we have a same step and that is to create constructor.
        setLayout(null);
        Random ran = new Random();
        long random = Math.abs(ran.nextLong() % 9000L + 1000L);
        // math.abs converts every number to positive and 9000l + 1000L
        // formula helps in getting 4 digits number.

        JLabel formno = new JLabel("APPLICATION FORM NUMBER: " + random);
        formno.setFont(new Font("Raleway",Font.BOLD,30));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(100,190,200,30);
        add(fname);

        JTextField fnameTextField = new JTextField();
        fnameTextField.setBounds(300,190,400,30);
        fnameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(100,240,300,30);
        add(dob);


        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender);

        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(100,340,200,30);
        add(email);

        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(300,340,400,30);
        emailTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
        marital.setBounds(100,390,200,30);
        add(marital);

        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100,440,200,30);
        add(address);

        JTextField addressTextField = new JTextField();
        addressTextField.setBounds(300, 440,400,30);
        addressTextField.setFont(new Font("Arial", Font.BOLD, 22));
        add(addressTextField);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(100,490,200,30);
        add(city);

        JTextField cityTextField = new JTextField();
        cityTextField.setBounds(300, 490,400,30);
        cityTextField.setFont(new Font("Arial", Font.BOLD, 22));
        add(cityTextField);

        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(100,540,200,30);
        add(state);

        JTextField stateTextField = new JTextField();
        stateTextField.setBounds(300,540,400,30);
        stateTextField.setFont(new Font("Arial", Font.BOLD, 22));
        add(stateTextField);

        JLabel pincode = new JLabel("PIN Code: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        JTextField pincodeTextField = new JTextField();
        pincodeTextField.setBounds(300,590,400,30);
        pincodeTextField.setFont(new Font("Arial", Font.BOLD, 22));
        add(pincodeTextField);

        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(850,700);
        setLocation(350,10);
        setVisible(true);
        setTitle("Personal Information");

    }
}
