package Assignment_03;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exp_07 {
	public static void main(String[] args) 
	{
		JFrame f = new JFrame() ;
		f.setSize(400,400) ;
		f.setLayout(null) ;
		f.setVisible(true) ;


		JButton rb = new JButton("Red") ;
		rb.setBounds(0,0,100,50) ;
		JButton gb = new JButton("Green") ;
		gb.setBounds(100,0,100,50) ;

		f.add(rb) ;
		f.add(gb) ;

		rb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				f.getContentPane().setBackground(Color.red) ;
			}
		}) ;

		gb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				f.getContentPane().setBackground(Color.green) ;
			}
		}) ;
		
	}
}
