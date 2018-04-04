package assignment1;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class BlueListener implements ActionListener {

	private JLabel l;
	private CircleIcon circle;

	public BlueListener(JLabel label, CircleIcon ci) {
		l = label;
		circle = ci;
	}

	public void actionPerformed(ActionEvent e) {
		circle.changeColor(Color.blue);
		l.repaint();
	}

}
