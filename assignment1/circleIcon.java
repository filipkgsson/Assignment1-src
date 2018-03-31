package assignment1;

import java.awt.*;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

public class CircleIcon implements Icon{
	
	private double r;
	private Color color;
	
	public CircleIcon(double radius) {
		r = radius;
		color = Color.red;
	}
	
	public void changeColor(Color c) {
		color = c;
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, r, r);
		g2.setColor(color);
		g2.fill(circle);
	}

	public int getIconWidth() {
		return (int)r;
	}

	public int getIconHeight() {
		return (int)r;
	}
	
}
