/*
* TelephoneInterface.java
* A demo of an interface that could be used for a telephone
* in the smartphone, using Java.
* last edited 04 10 23 by Zack A
*/

import java.awt.*;
import javax.swing.*;

public class TelephoneInterface
{
    public static void main(String[] args)
    {
        // create a frame to hold the components
        JFrame myJFrame = new JFrame();

        // create a BorderLayout and assign it to the JFrame
        myJFrame.setLayout(new BorderLayout());

        // Create a panel for number buttons
        // Grid with 5 columns and 3 rows
        JPanel buttonsPanel = new JPanel(new GridLayout(5, 3));

        // Declare an array of 10 JButtons for digits 0-9
        JButton[] numberButton = new JButton[10];

        // Create buttons for characters, and a Call button
        JButton starButton = new JButton("*");
        JButton hashtagButton = new JButton("#");
        JButton callButton = new JButton("Call");

        // define and add buttons for the first three rows
        for (int i = 1; i <= 9  ; i++)
        {
            numberButton[i] = new JButton(""+i);
            buttonsPanel.add(numberButton[i]);
        } // end for()

        // add the star button
        buttonsPanel.add(starButton);

        // add the zero button
        numberButton[0] = new JButton("0");
        buttonsPanel.add(numberButton[0]);

        // add the hashtag button
        buttonsPanel.add(hashtagButton);

        // add the blank placeholder label
        JLabel blankLabel1 = new JLabel("");
        buttonsPanel.add(blankLabel1);

        // add the call button
        buttonsPanel.add(callButton);

        // add the second blank placeholder label
        JLabel blankLabel2 = new JLabel("");
        buttonsPanel.add(blankLabel2);

        // add the main button panel to the JFrame
        myJFrame.add(buttonsPanel, BorderLayout.CENTER);

        // Create a center justified textField to display the number
        JTextField jtNumber = new JTextField("0");
        jtNumber.setHorizontalAlignment(JTextField.CENTER);

        // add the number text field to the JFrame
        myJFrame.add(jtNumber, BorderLayout.NORTH);

        // set the title, size, location and exit behavior for the frame
        myJFrame.setTitle("Telephone Interface Demo");
        myJFrame.setSize(300, 450);
        myJFrame.setLocation(200, 100);
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // make the frame visible
        myJFrame.setVisible(true);
    } // end main()
} // end class