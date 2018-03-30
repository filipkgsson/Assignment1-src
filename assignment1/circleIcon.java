package assignment1;

import java.awt.*;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

public class circleIcon implements Icon{
	
	private double r;
	
	public circleIcon(double radius) {
		r = radius;
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D.Double circle = new Ellipse2D.Double(0 - r, 0 + r, r, r);
		g2.setColor(Color.red);
		g2.fill(circle);
	}

	public int getIconWidth() {
		return (int)r;
	}

	public int getIconHeight() {
		return (int)r;
	}
	
}
