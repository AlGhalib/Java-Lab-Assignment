package Assignment_03;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exp_09 {

	public static void main(String[] args) 
	{
		JFrame f = new JFrame("Fahrenheit to Celsius Converter");
        JLabel lb1 = new JLabel("Enter Fahrenheit temperature:");
        JLabel lb2 = new JLabel("Temperature in Celsius:");

        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();

        JButton b = new JButton("Convert");

        lb1.setBounds(20, 10, 250, 40);
        lb2.setBounds(30, 80, 180, 40);

        tf1.setBounds(280, 10, 80, 40);
        tf2.setBounds(220, 80, 80, 40);

        b.setBounds(150,150,100,40);

        f.add(lb1); f.add(lb2); f.add(tf1);
        f.add(tf2); f.add(b);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Float a = Float.parseFloat(tf1.getText());
                Float b = ((5*a)-160)/9;
                tf2.setText(String.valueOf(b));
            }
        });

	}

}
