package assignment1;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class GreenListener implements ActionListener{
	
	private JLabel l;
	private CircleIcon circle;
	
	public GreenListener(JLabel label, CircleIcon ci) {
		l = label;
		circle = ci;
	}
	
	public void actionPerformed(ActionEvent e) {
		circle.changeColor(Color.green);
		l.repaint();
	}

}