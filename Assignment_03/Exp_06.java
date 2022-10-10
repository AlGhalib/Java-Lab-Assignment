package Assignment_03;

import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;

public class Exp_06 {
	public static void main(String[] args) 
	{
		JFrame f = new JFrame("My Frame");
		f.setSize(200,200);
		f.setLayout(null);
		f.setVisible(true);
		
		JButton b = new JButton("OK");
		b.setBounds(0,0,60,25);
		f.add(b);
		
		JTextField tf = new JTextField("Hello Java Click 0");
		tf.setBounds(80,0,150,25);
		f.add(tf);
		
		b.addActionListener(new ActionListener(){
			int cnt = 0;
			public void actionPerformed(ActionEvent e) {
				cnt++;
				tf.setText("Hello Java Click "+String.valueOf(cnt));
			}
		});
		
	}

}
