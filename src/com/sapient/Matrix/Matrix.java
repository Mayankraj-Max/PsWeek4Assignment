package com.sapient.Matrix;

import java.util.Scanner;

public class Matrix {

	int m;
	int n;
	int matrix[][];

//(i)

	public Matrix() {
		
		m = 3;
		n = 3;
		matrix = new int[m][n];
	}

//(ii)

	public Matrix(int a, int b) {

		m = a;
		n = b;
		matrix = new int[m][n];
	}

//(iii)

	public Matrix(int[][] temp) {
		
		m = temp.length;
		n = temp[0].length;
		matrix = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
				this.matrix[i][j] = temp[i][j];
			}
		}
	}

//(iv)

	Matrix(Matrix temp) {
		
		this.m = temp.m;
		this.n = temp.n;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				this.matrix[i][j] = temp.matrix[i][j];
			}
		}
	}

// (v)
	Scanner sc = new Scanner(System.in);
	
	public void readMatrix() {
        
		System.out.println("Enter the elements in the matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				this.matrix[i][j] = sc.nextInt();
			}
		}
	}

// (vi)

	public void displayMatrix() {
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(this.matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

// (vii)

	public Matrix addMatrix(Matrix temp) {

		Matrix sum = new Matrix(m, n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sum.matrix[i][j] = this.matrix[i][j] + temp.matrix[i][j];
			}
		}
		return sum;
	}

// (viii)

	public void isScalar() {
		
		Boolean isScalar = true;
		int x = this.matrix[0][0];
		
		for (int i = 0; i < m; i++) {

			if (this.matrix[i][i] != x) {
				isScalar = false;
			}
			for (int j = 0; j < n; j++) {
				if (i != j && this.matrix[i][j] != 0) {
					isScalar = false;
				}
			}
		}

		if (isScalar) {
			System.out.println("This is a scalar matrix");
		} else {
			System.out.println("This is not a scalar matrix");
		}
	}

// (ix)

	public Matrix multiplyMatrix(Matrix temp) {

		Matrix mul = new Matrix(m, temp.n);
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < temp.n; j++) {
				for (int k = 0; k < n; k++) {
					mul.matrix[i][j] += this.matrix[i][k] * temp.matrix[k][j];
				}
			}
		}
		return mul;
	}

}
