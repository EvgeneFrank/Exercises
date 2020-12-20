package chapter2.variantB.nNMatrix;

import java.util.Scanner;

public class NNMatrix {
	/**
	 * ��� ����������������� ����� ������� �������.
	 */
	private static Scanner scanner;
	/**
	 * ��� ���������� �����.
	 * ����� ������� ������� �������: System.out.println(IntStream.rangeClosed(1,n*n).mapToObj(i->i%n==0?i+"\t\n":i+"\t").collect(Collectors.joining()));
	 * @param n
	 * @return
	 */
	private static int[][] workChString(int n) {
		int [][] result=new int[n][n];
		int nn=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				result[i][j]=nn++;
			}
		}
		return result;
	}
	/**
	 * ��� ���������� ��������.
	 * @param n
	 * @return
	 */
	private static int[][]workChColumn(int n){
		int [][]result=new int[n][n];
		int nn=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				result[j][i]=nn++;
			}
		}
		return result;
	}
	/**
	 * �������� �����������������.
	 * � ����������� ����� � ����� ������� �� ������� ������� � ��������� �����. � ����� ����������� �������� ��� ���������� ������.
	 * @param args
	 */
	public static void main(String[]args) {
		System.out.println("������� ������ ���������� �������: ");
		scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[][] testS=workChString(n);
		int[][] testC=workChColumn(n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(testS[i][j]+"     ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------------------------");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(testC[i][j]+"     ");
			}
			System.out.println();
		}
	}
}
