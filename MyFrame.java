import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("JFrame title goes here"); // sets title of frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true); // Already true by default, can be set to false to prevent resizing
        // setLocationRelativeTo(null); // center window on screen
        setSize(600, 500); // sets x-dimension, y-dimension of frame

        // From:
        // https://stackoverflow.com/questions/21502502/imageicon-not-displaying-in-java
        ImageIcon icon = new ImageIcon(MyFrame.class.getResource("/resources/strength_icon.png")); // Create Image Icon
        setIconImage(icon.getImage()); // Change Icon of Frame

        getContentPane().setBackground(Color.lightGray); // change color of background

        addJLabel(); // See method below

        setVisible(true); // makes frame visible
    }

    /**
     * JLabel = a GUI display area for a string of text, an image, or both
     */
    private void addJLabel() {

        JLabel label = new JLabel(); // Create a new JLabel
        label.setText("Bro, do you even code"); // Set text of JLabel

        ImageIcon image = new ImageIcon(MyFrame.class.getResource("/resources/walrus.jpg")); // Create ImageIcon
        label.setIcon(image);

        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM

        label.setForeground(new Color(0x00FF00)); // set color of text
        label.setFont(new Font("MV Boli", Font.BOLD, 25)); // set font of text

        label.setIconTextGap(0); // set gap of text to image, positive or negative INT
        label.setBackground(Color.BLACK); // set background color of label
        label.setOpaque(true); // display bacground color

        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
        label.setBorder(border);

        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon and text within label

        add(label);
        // Use either the layout manager and bounds to organize label, or the pack()
        // method.
        setLayout(null); // TODO: remove this on future lesson
        // set x, y position and dimension within frame
        label.setBounds(100, 100, 400, 250);
        // pack() will resize window to accomodate for all internal components
        // pack();

    }

}
