package Assignment_03;

import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;

public class Exp_08 implements ActionListener
{
	JMenuBar mb;
	JLabel lb;
	JFrame f;
	JMenuItem it1 , it2 , it3 , it4 , it5 , it6;
	JMenu mn1 , mn2;
	
	Exp_08()
	{
		f = new JFrame() ;
		f.setTitle("Click Menu") ;
		f.setVisible(true) ;
		f.setLayout(null) ;
		f.setSize(300,300) ;

		lb = new JLabel() ;
		System.out.println("Click any item names");
		lb.setBounds(50,50,300,100) ;

		f.add(lb) ;

		mb = new JMenuBar();
		
		mn1 = new JMenu("Indian States");
		mn2 = new JMenu("Indian Cities");

		it1 = new JMenuItem("Himachal Pradesh");
		it2 = new JMenuItem("Rajasthan");
		it3 = new JMenuItem("West Bengal");
		it4 = new JMenuItem("Andhra Pradesh");
		it5 = new JMenuItem("Tamil Nadu");
		it6 = new JMenuItem("Karnataka");
		
		it1.addActionListener(this);
		it2.addActionListener(this);
		it3.addActionListener(this);
		it4.addActionListener(this);
		it5.addActionListener(this);
		it6.addActionListener(this);
		
		mn1.add(it1); mn1.add(it2);
		mn1.add(it3); mn1.add(it4);
		mn1.add(it5); mn1.add(it6);

        mb.add(mn1);
        mb.add(mn2);
        f.setJMenuBar(mb);

	} 
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == it1)
		{
			System.out.println("Himachal Pradesh is Clicked");
			lb.setText("Himachal");
		
		}
		else if(e.getSource() == it2) 
		{
			System.out.println("Rajasthan is Clicked");
			lb.setText("Rajasthan");
		}
		else if(e.getSource() == it3) System.out.println("West Bengal is Clicked");
		else if(e.getSource() == it4) System.out.println("Andhra Pradesh is Clicked");
		else if(e.getSource() == it5) System.out.println("Tamil Nadu is Clicked");
		else if(e.getSource() == it6) System.out.println("Karnataka is Clicked");
	}
	public static void main(String[] args) {
		new Exp_08();
	}
}

