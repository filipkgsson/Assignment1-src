package assignment1;

import java.awt.*;

import javax.swing.*;

public class GUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		JButton red = new JButton("Red");
		JButton green = new JButton("Green");
		JButton blue = new JButton("Blue");

		CircleIcon ci = new CircleIcon(100.0);
		final JLabel label = new JLabel();
		label.setIcon(ci);
		label.setOpaque(true);

		red.addActionListener(e -> {
			ci.changeColor(Color.red);
			label.repaint();
		});
		green.addActionListener(e -> {
			ci.changeColor(Color.green);
			label.repaint();
		});
		blue.addActionListener(e -> {
			ci.changeColor(Color.blue);
			label.repaint();
		});

		frame.setLayout(new FlowLayout());
		frame.add(label);
		frame.add(red);
		frame.add(green);
		frame.add(blue);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
