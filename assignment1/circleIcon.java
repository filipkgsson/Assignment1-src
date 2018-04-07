package assignment1;

import java.awt.*;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

public class CircleIcon implements Icon{
	
	private double r;
	private Color color;
	
	/**
	 * Creates a new CircleIcon
	 * @param radius the radius of the circle
	 * @precondition radius > 0
	 */
	public CircleIcon(double radius) {
		r = radius;
		color = Color.red;
	}
	
	/**
	 * Changes the color of the circle
	 * @param c the color that is used
	 */
	public void changeColor(Color c) {
		color = c;
	}

	/**
	 * Paints the circle
	 */
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, r, r);
		g2.setColor(color);
		g2.fill(circle);
	}

	/**
	 * Get the width of the circle
	 * @return The width of the circle
	 */
	public int getIconWidth() {
		return (int)r;
	}

	/**
	 * Get the height of the circle
	 * @return The height of the circle
	 */
	public int getIconHeight() {
		return (int)r;
	}
	
}
