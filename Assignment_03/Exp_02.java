package Assignment_03;

import java.util.*;
import javax.swing.*;

public class Exp_02 {
	public static void main(String[] args) {
		JFrame master = new JFrame("Master Frame");
		master.setSize(300,300);
		master.setVisible(true);
		master.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close every frame
		
		JFrame temp = new JFrame("Temporary Frame");
		temp.setSize(400,400);
		temp.setVisible(true);
		temp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // close just current frame
	}

}
