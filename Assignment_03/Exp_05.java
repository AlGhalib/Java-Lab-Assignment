package Assignment_03;

import java.awt.*; 
import java.util.* ;
import javax.swing.* ;

public class Exp_05 {
	public static void main(String[] args) 
	{
		JFrame f = new JFrame("Radio/Combo Example");
		f.setVisible(true);
		f.setSize(400,400);
		f.setLayout(null);

		JPanel p1 = new JPanel();
		p1.setBounds(0,0,100,300);
		//p1.setBackground(Color.white);
		f.add(p1);

		JPanel p2 = new JPanel();
		p2.setBounds(300,0,100,300);
		//p2.setBackground(Color.white);
		f.add(p2);

		JLabel lb1 = new JLabel("Radio Button");
		JRadioButton rb1 = new JRadioButton("4 slices");
		JRadioButton rb2 = new JRadioButton("8 slices");
		p1.add(lb1); p1.add(rb1); p1.add(rb2);
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lb2 = new JLabel("Check Boxes");
		JCheckBox cb1 = new JCheckBox("Anchovies");
		JCheckBox cb2 = new JCheckBox("Garlic");
		p2.add(lb2); p2.add(cb1); p2.add(cb2);


		String[] str = {"Bird","Cat","Dog","Rabbit","Cow"};
		JComboBox cmb = new JComboBox(str);
		p2.add(cmb);
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));

//		ButtonGroup bg = new ButtonGroup();
//		bg.add(rb1); bg.add(rb2);

//		JPanel p = new JPanel(new BorderLayout());
//		p.add(rb1,BorderLayout.WEST);
//		p.add(rb2,BorderLayout.WEST);
//		p.add(cb1,BorderLayout.EAST);
//		p.add(cb2,BorderLayout.EAST);
//		p.add(cmb,BorderLayout.EAST);
		
	}

}
