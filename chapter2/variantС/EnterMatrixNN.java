package chapter2.variant�;

import java.util.Random;
import java.util.Scanner;

public class EnterMatrixNN {
	/**
	 * ���������������� ���� ������� �������.
	 * @return
	 */
	@SuppressWarnings("resource")
	public static int enterSize() {
		System.out.println("������� ������ ���������� �������: ");
		return new Scanner(System.in).nextInt();
	}
	/**
	 * ����������� ������� ���������� �������.
	 * @param size ������ ���������� �������.
	 * @return
	 */
	public static int[][] newMatrix(int size){
		int result[][]=new int[size][size];
		for (int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				result[i][j]=new Random().nextInt()/1000000;// �������, ����� �� ���������� ����� ������� �����.
			}
		}
		return result;
	}
	/**
	 * ����� ������� �� �������.
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
	 * ����� ������� ������� �� �������.
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
