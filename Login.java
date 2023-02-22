package BankManagementSystem;

import javax.swing.*;
// Swing is used for creating the app.
// This is a windows based application. So Swing is used.

import java.awt.*;

import java.awt.event.*;
// this will help in adding the image class

public class Login extends JFrame implements ActionListener {
// extends is a concept of inheritance.
// JFrames are the class for swing.
// To perform any action in the button we use ActionListener.

    JButton Login,SignUp, Clear;
    // here the button are supposed to globally defined because we can use this
    // key button in the ActionPerformed Class.
    // Since we have globally defined the Button, so we can remove the particular word from
    // the constructor.

    JTextField cardTextField;
    // same reason as it was for JButton.

    JPasswordField pinIntegerField;
    // JPasswordFiled will help in hiding the numbers which are filled in PIN Section.

    Login(){
        // To create a frame, Function is used.

        setTitle("ATM");
        // Will give the tile to the frame.

        setLayout(null);
        // set layout is by default, here we have doing the layout on custom.
        // That's why we have set the layout as null.

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/download.png"));

        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        // To pick image I have created a folder in src folder.
        // ClassLoader helps us to import the image from the system.

        ImageIcon i3 = new ImageIcon(i2);
        // you cannot put image in JLabel that's why we have created new object

        JLabel label = new JLabel(i1);

        label.setBounds(15,15, 100, 100);
        // this will shift the logo to the corner of the frame.

        add(label);
        // You cannot place icon in a frame. So we use JLabel
        // this function will add the icon to frame.

        JLabel text = new JLabel("Welcome to ATM");
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200,40,400,40);
        // this will give the location to the text and then only it will be visible
        // since we have set the layout to default.

        add(text);
        // this will help in adding the text.

        JLabel CardNo = new JLabel("Card No:  ");
        CardNo.setForeground(Color.BLACK);
        CardNo.setFont(new Font("Raleway", Font.BOLD, 28));
        CardNo.setBounds(120,150,400,30);
        add(CardNo);

        JLabel Pin = new JLabel("PIN: ");
        Pin.setForeground(Color.BLACK);
        Pin.setFont(new Font("Raleway", Font.BOLD, 28));
        Pin.setBounds(120,220,150,30);
        add(Pin);

        cardTextField = new JTextField();
        // this will help in adding the box in front of Card No.
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        pinIntegerField = new JPasswordField();
        // this will help in adding the box in front of PIN.
        pinIntegerField.setBounds(300,220,230,30);
        pinIntegerField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinIntegerField);

        JButton Login = new JButton("SIGN IN");
        // this will create button in frame named SIGN IN.
        Login.setBounds(300,300,100,30);
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
        Login.addActionListener(this);
        add(Login);

        JButton Clear = new JButton("CLEAR");
        // this will create button in frame named SIGN IN.
        Clear.setBounds(430,300,100,30);
        Clear.setBackground(Color.BLACK);
        Clear.setForeground(Color.WHITE);
        Clear.addActionListener(this);
        add(Clear);

        JButton SignUp = new JButton("SIGN UP");
        // this will create button in frame named SIGN UP.
        SignUp.setBounds(300,350,230,30);
        SignUp.setBackground(Color.BLACK);
        SignUp.setForeground(Color.WHITE);
        SignUp.addActionListener(this);
        add(SignUp);


        getContentPane().setBackground(Color.LIGHT_GRAY);
        // this will set the background to white.

        setSize(800,480);
        // this will define the size of the frame

        setVisible(true);
        // This helps us to see the frame.
        // Because by default it will not show.

        setLocation(350,200);
        // This will help us to start the opening of the frame from the
        // desired point of your choice.
    }

    public void actionPerformed(ActionEvent ae){
        // this section will contain the part
        // where all the actions of every button is stored.
        // here ae is an object of ActionEvent class which will help to
        // create the actions of each class.
        if(ae.getSource() == Clear){
            cardTextField.setText("");
            pinIntegerField.setText("");
        } else if(ae.getSource() == Login){

        } else if(ae.getSource() == SignUp){

        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
