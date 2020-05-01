package com.sapient.Matrix;

public class Matrix_Runner {
 
	public static void main(String[] args) {

		Matrix matrix1 = new Matrix(2, 2);
		matrix1.readMatrix();
		matrix1.displayMatrix();
        matrix1.isScalar();
        
        
		/*Matrix matrix2 = new Matrix();
		matrix2.readMatrix();
		matrix2.displayMatrix();
		matrix2.isScalar();
	    */    
		int matrix3[][] = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matrix3[i][j] = 9;
			}
		}

		Matrix matrix4 = new Matrix(matrix3);
		matrix4.displayMatrix();

		Matrix sum = matrix1.addMatrix(matrix4);
		sum.displayMatrix();

		Matrix mul = matrix1.multiplyMatrix(matrix4);
		mul.displayMatrix();

	}


}
