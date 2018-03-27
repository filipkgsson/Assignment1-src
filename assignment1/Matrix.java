package assignment1;

import java.util.*;

public class Matrix {
	private double[][] elements;

	public Matrix(int r, int c) {
		elements = new double[r][c];
	}

	public Matrix(double[][] a) {
		elements = a.clone();
	}

	public void setValue(double value, int i, int j) {
		elements[i][j] = value;
	}

	public double getValue(int i, int j) {
		return elements[i][j];
	}

	public Matrix addition(Matrix b) {
		if (this.elements[0].length != b.elements[0].length || this.elements[1].length != b.elements[1].length)
			throw new IllegalArgumentException("Matrixes do not have the same lenght");
		Matrix c = new Matrix(this.elements[0].length, this.elements[1].length);
		for (int i = 0; i < this.elements[0].length; i++) {
			for (int j = 0; j < this.elements[1].length; j++) {
				c.elements[i][j] = this.elements[i][j] + b.elements[i][j];
			}
		}
		return c;
	}

	public Matrix multiply(Matrix b) {
		if (this.elements[0].length != b.elements.length)
			throw new IllegalArgumentException("Illegal matrix dimensions.");
		Matrix c = new Matrix(this.elements[0].length, b.elements[1].length);
		for (int i = 0; i < this.elements.length; i++)
			for (int j = 0; j < this.elements[0].length; j++)
				for (int k = 0; k < this.elements[0].length; k++)
					c.elements[i][j] += this.elements[i][k] * b.elements[k][j];
		return c;
	}

	@Override
	public String toString() {
		String string = "";
		for (int i = 0; i < this.elements.length; i++)
			string += Arrays.toString(this.elements[i]);
		return string;
	}

}
