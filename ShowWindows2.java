import javax.swing.*;
import java.awt.*;

public class ShowWindows2 {

    public static void main(String[] args) {
        // declare our variables
        // we are going to make them CONSTANTS

        final int WINDOW_WIDTH = 550;
        final int WINDOW_HEIGHT = 650;

        // Creating a window

        JFrame window = new JFrame("My Simple Window");

        JLabel myLabel, myLabel2; // Here we are setting the label
        JTextField textField, textField1; // Here we are setting the text field


        myLabel = new JLabel("My First Big Label!!");
        myLabel.setBounds(20, 60, 300, 100);
        myLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));


        // setting the string name, style, size
        window.add(myLabel);

        myLabel2 = new JLabel("My Second Big Label!!");
        myLabel2.setBounds(20, 170, 300, 100);
        myLabel2.setFont(new Font("Times New Roman", Font.BOLD, 15));


        // setting the string name, style, size
        window.add(myLabel2);


        textField = new JTextField();
        textField.setBounds(20, 130, 300, 30);
        window.add(textField);

        textField1 = new JTextField();
        textField1.setBounds(20, 240, 300, 30);
        window.add(textField1);

        // setting the title
        window.setTitle("My Simple Window");
        window.setLayout(null);


        // setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);


        // closing the window and exit the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // setting the background color
        window.getContentPane().setBackground(Color.red);


        // setting the location of the window in the middle
        window.setLocation(350, 50);


        // displaying the window is a boolean
        window.setVisible(true);


    }

}
