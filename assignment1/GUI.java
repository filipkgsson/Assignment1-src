package assignment1;

import java.awt.*;

import javax.swing.*;

public class GUI {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JButton red = new JButton("Red");
		JButton green = new JButton("Green");
		JButton blue = new JButton("Blue");
		
		circleIcon ci = new circleIcon(10.0);
		JLabel label = new JLabel(ci);
		
		frame.setLayout(new FlowLayout());
		frame.add(label);
		frame.add(red);
		frame.add(green);
		frame.add(blue);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		label.repaint();

		
		
	}
	
}
