package Multiply;

import java.util.Arrays;

public class Matrix_multiply {

	// Codegate team. Visit Codegate.ir
	// �CodeGate 2016
	public static void main(String[] args) {
		double[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3 } };
		double[][] b = { { 5, 3, 3 }, { 1, 7, 6 }, { 8, 5, 4 } };

		double[][] multiple = multiply(a, b);
		System.out.println("multiple");
		for (int i = 0; i < multiple.length; i++) {
			System.out.println(Arrays.toString(multiple[i]));

		}

	}

	public static double[][] multiply(double[][] A, double[][] B) {
		int mA = A.length;
		int nA = A[0].length;
		int mB = B.length;
		int nB = B[0].length;
		if (nA != mB)
			throw new RuntimeException("Illegal matrix dimensions.");
		double[][] C = new double[mA][nB];
		for (int i = 0; i < mA; i++)
			for (int j = 0; j < nB; j++)
				for (int k = 0; k < nA; k++)
					C[i][j] += A[i][k] * B[k][j];
		return C;
	}

}
