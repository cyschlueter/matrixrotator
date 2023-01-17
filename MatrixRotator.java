import java.util.Scanner;

public class MatrixRotator {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int matrix_rows = input.nextInt();
		int matrix_cols = input.nextInt();
		
		int[][] matrix = new int[matrix_rows][matrix_cols];
		
		for (int i=0; i < matrix_rows; i++) {
			for (int j=0; j < matrix_cols; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		
		int[][] rotated = rotate(matrix);
		PrintMatrix(matrix);
		System.out.println("");
		PrintMatrix(rotated);
	}
	
	public static int[][] rotate(int[][] iM) {
		int N = iM.length;
		int M = iM[0].length;
		int[][] cM = new int[M][N];
		
		for (int i=0; i < N; i++) {
			for (int j=0; j < M; j++) {
				cM[j][i] = iM[N - i - 1][j];
			}
		}
		
		return cM;
	}
	
	public static void PrintMatrix(int[][] mat) {
		for (int i=0; i < mat.length; i++) {
			for (int j=0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
