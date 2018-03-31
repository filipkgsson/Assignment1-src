package assignment1;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class RedListener implements ActionListener{
	
	private JLabel l;
	private CircleIcon circle;
	
	public RedListener(JLabel label, CircleIcon ci) {
		l = label;
		circle = ci;
	}
	
	public void actionPerformed(ActionEvent e) {
		circle.changeColor(Color.red);
		l.repaint();
		
	}
	
}
