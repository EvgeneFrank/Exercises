package chapter2.variantÑ;

import java.util.Random;
import java.util.Scanner;

public class EnterMatrixNN {
	/**
	 * Пользовательский ввод размера матрицы.
	 * @return
	 */
	@SuppressWarnings("resource")
	public static int enterSize() {
		System.out.println("Введите размер квадратной матрицы: ");
		return new Scanner(System.in).nextInt();
	}
	/**
	 * Заполненние матрицы случайными числами.
	 * @param size Размер квадратной матрицы.
	 * @return
	 */
	public static int[][] newMatrix(int size){
		int result[][]=new int[size][size];
		for (int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				result[i][j]=new Random().nextInt()/1000000;// Поделил, чтобы не получились очень большие числа.
			}
		}
		return result;
	}
	/**
	 * Вывод матрицы на консоль.
	 * @param array
	 */
	public static void printMatrix(int[][]array) {
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	/**
	 * торой вариант вывожда на консоль.
	 * @param array
	 */
	public static void printMatrix(double[][]array) {
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
