package Assignment_03;

import java.util.*; 
import javax.swing.*;

public class Exp_04 {
	public static void main(String[] args) 
	{
		JFrame f = new JFrame();
		
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu help = new JMenu("Help");
		
		JMenuItem it1 = new JMenuItem("Open");
		JMenuItem it2 = new JMenuItem("Save as");
		file.add(it1); file.add(it2);
		
		mb.add(file);
		mb.add(help);
		
		f.setJMenuBar(mb);
		
		f.setVisible(true);
		f.setSize(300,300);
		f.setLayout(null);
	 
	}
	
}
