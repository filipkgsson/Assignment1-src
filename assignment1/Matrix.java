package assignment1;

import java.util.*;

public class Matrix {
	
	private double[][] elements;

	/**
	 * Creates an empty matrix
	 * @param r the number of rows
	 * @param c the number of columns
	 * @preconditions r and c > 0
	 */
	public Matrix(int r, int c) {
		elements = new double[r][c];
	}

	/**
	 * Creates a new matrix
	 * @param a an existing matrix
	 */
	public Matrix(double[][] a) {
		elements = a.clone();
	}

	/**
	 * Sets the value at a specific position
	 * @param value the value to set
	 * @param i the row where the value is set
	 * @param j the column where the value is set
	 * @preconditions i and j > 0
	 */
	public void setValue(double value, int i, int j) {
		elements[i][j] = value;
	}

	/**
	 * Gets the value at a specific position
	 * @param i the row where the value is fetched
	 * @param j the column where the value is fetched
	 * @return The value of at the specified position
	 * @preconditions i and j > 0
	 */
	public double getValue(int i, int j) {
		return elements[i][j];
	}

	/**
	 * Adds two matrixes
	 * @param b the matrix to add
	 * @return A matrix witch represents the added matrixes
	 */
	public Matrix addition(Matrix b) {
		if (this.elements[0].length != b.elements[0].length || this.elements[1].length != b.elements[1].length)
			throw new IllegalArgumentException("Matrixes do not have the same length");
		Matrix c = new Matrix(this.elements[0].length, this.elements[1].length);
		for (int i = 0; i < this.elements[0].length; i++) {
			for (int j = 0; j < this.elements[1].length; j++) {
				c.elements[i][j] = this.elements[i][j] + b.elements[i][j];
			}
		}
		return c;
	}

	/**
	 * Multiplies two matrixes
	 * @param b the matrix to multiply with
	 * @return A matrix witch represents the multiplied matrixes
	 */
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

	/**
	 * Converts a matrix to a string
	 * @return The string that represents the matrix
	 */
	@Override
	public String toString() {
		String string = "";
		for (int i = 0; i < this.elements.length; i++)
			string += Arrays.toString(this.elements[i]);
		return string;
	}

}
