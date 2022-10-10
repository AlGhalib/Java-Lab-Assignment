package Assignment_03;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

// Frame Class
public class Exp_01 {
	public static void main(String[] args) {
		Frame f = new Frame("My First GUI Frame");
		f.setSize(300,300);
		//f.setTitle("My First GUI Frame");
		f.setVisible(true);
		
//		f.addWindowListener(new WindowAdapter(){
//			public void windowClosed(WindowEvent e) { 
//				System.exit(0); 
//			}
//		});
	}
}


// JFrame Class
/*public class Exp_01 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,300);
		f.setTitle("My First GUI Frame");
		f.setVisible(true);
	}
}*/


 //Extends from JFrame
//class MyJFrame extends JFrame{
//	MyJFrame(){
//		setSize(300,300);
//		setTitle("My First GUI Frame");
//		//setVisible(true);
//	}
//}
//public class Exp_01 {
//	public static void main(String[] args) {
//		MyJFrame f = new MyJFrame();
//		f.setVisible(true);
//		f.setDefaultCloseOperation(MyJFrame.EXIT_ON_CLOSE);
//	}
//}

