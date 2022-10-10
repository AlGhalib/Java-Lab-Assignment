package Assignment_03;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


//public class Exp_03 
//{
//	public static void DefaultLayout()
//	{
//		JFrame f = new JFrame();
//		f.setTitle("Default Layout");
//		
//		JLabel lb = new JLabel("Label");
//		lb.setBounds(0,0,100,50);
//		f.add(lb);
//		
//		JTextField txt = new JTextField("Text");
//		txt.setBounds(100,0,200,50);
//		f.add(txt);
//		
//		JButton btn = new JButton("Send");
//		btn.setBounds(300,0,100,50);
//		f.add(btn);
//		
//		f.setLayout(null);
//		f.setSize(400,200);
//		f.setVisible(true);
//	}
//	
//	public static void FlowLayout()
//	{
//		JFrame f = new JFrame();
//		f.setTitle("Flow Layout");
//		
//		JLabel lb = new JLabel("Label");
//		//lb.setBounds(0,0,100,50);
//		f.add(lb);
//		
//		JTextField txt = new JTextField("Text");
//		//txt.setBounds(100,0,200,50);
//		f.add(txt);
//		
//		JButton btn = new JButton("Send");
//		//btn.setBounds(300,0,100,50);
//		f.add(btn);
//		
//		f.setLayout(new FlowLayout(FlowLayout.LEFT));
//		f.setSize(300,300);
//		f.setVisible(true);
//	}
//	
//	public static void BorderLayout()
//	{
//		JFrame f = new JFrame();
//		f.setTitle("Border Layout");
//		f.setLayout(new BorderLayout(20,15));
//		
//		JLabel lb = new JLabel("Label");
//		//lb.setBounds(0,0,100,50);
//		f.add(lb,BorderLayout.WEST);
//		
//		JTextField txt = new JTextField("Text");
//		//txt.setBounds(100,0,200,50);
//		f.add(txt,BorderLayout.CENTER);
//		
//		JButton btn = new JButton("Send");
//		//btn.setBounds(300,0,100,50);
//		f.add(btn,BorderLayout.EAST);
//		
//		
//		f.setSize(300,300);
//		f.setVisible(true);
//	}
//	
//	public static void GridLayout()
//	{
//		JFrame f = new JFrame();
//		f.setTitle("Grid Layout");
//		
//		JLabel lb = new JLabel("Label");
//		//lb.setBounds(0,0,100,50);
//		f.add(lb);
//		
//		JTextField txt = new JTextField("Text");
//		//txt.setBounds(100,0,200,50);
//		f.add(txt);
//		
//		JButton btn = new JButton("Send");
//		//btn.setBounds(300,0,100,50);
//		f.add(btn);
//		
//		f.setLayout(new GridLayout());
//		f.setSize(600,300);
//		f.setVisible(true);
//	}
//	
//	public static void main(String[] args) 
//	{
//		DefaultLayout();
//		FlowLayout();
//		BorderLayout();
//		GridLayout();
//	}
//
//}

public class Exp_03 
{
	public static void DefaultLayout()
	{
		Frame f = new Frame();
		f.setTitle("Default Layout");
		
		Label lb = new Label("Label");
		lb.setBounds(0,0,100,50);
		f.add(lb);
		
		TextField txt = new TextField("Text");
		txt.setBounds(100,0,200,50);
		f.add(txt);
		
		Button btn = new Button("Send");
		btn.setBounds(300,0,100,50);
		f.add(btn);
		
		f.setLayout(null);
		f.setSize(400,200);
		f.setVisible(true);
		f.addWindowListener((WindowListener) new WindowAdapter(){
			public void windowClosed(WindowEvent e) { 
				System.exit(0); 
			}
		});
	}
	
	public static void FlowLayout()
	{
		Frame f = new Frame();
		f.setTitle("Flow Layout");
		
		Label lb = new Label("Label");
		//lb.setBounds(0,0,100,50);
		f.add(lb);
		
		TextField txt = new TextField("Text");
		//txt.setBounds(100,0,200,50);
		f.add(txt);
		
		Button btn = new Button("Send");
		//btn.setBounds(300,0,100,50);
		f.add(btn);
		
		f.setLayout(new FlowLayout(FlowLayout.RIGHT));
		f.setSize(300,300);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosed(WindowEvent e) { 
				System.exit(0); 
			}
		});
	}
	
	public static void BorderLayout()
	{
		Frame f = new Frame();
		f.setTitle("Border Layout");
		f.setLayout(new BorderLayout(20,15));
		
		Label lb = new Label("Label");
		//lb.setBounds(0,0,100,50);
		f.add(lb,BorderLayout.WEST);
		
		TextField txt = new TextField("Text");
		//txt.setBounds(100,0,200,50);
		f.add(txt,BorderLayout.CENTER);
		
		Button btn = new Button("Send");
		//btn.setBounds(300,0,100,50);
		f.add(btn,BorderLayout.EAST);
		
		
		f.setSize(300,300);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosed(WindowEvent e) { 
				System.exit(0); 
			}
		});
	}
	
	public static void GridLayout()
	{
		Frame f = new Frame();
		f.setTitle("Grid Layout");
		
		Label lb = new Label("Label");
		//lb.setBounds(0,0,100,50);
		f.add(lb);
		
		TextField txt = new TextField("Text");
		//txt.setBounds(100,0,200,50);
		f.add(txt);
		
		Button btn = new Button("Send");
		//btn.setBounds(300,0,100,50);
		f.add(btn);
		
		f.setLayout(new GridLayout());
		f.setSize(600,300);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosed(WindowEvent e) { 
				System.exit(0); 
			}
		});
	}
	
	public static void main(String[] args) 
	{
		DefaultLayout();
		FlowLayout();
		BorderLayout();
		GridLayout();
		
	}

}
