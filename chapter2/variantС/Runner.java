package chapter2.variant�;

public class Runner {
	public static void main(String []args) {
		//-0-
		int size=EnterMatrixNN.enterSize();
		int [][]test=EnterMatrixNN.newMatrix(size);
		EnterMatrixNN.printMatrix(test);
		//-1-
		MatrixOperation.sortStringBubble(test);
		System.out.println("�������, ����� ���������� �� �������:");
		EnterMatrixNN.printMatrix(test);
		MatrixOperation.sortColumnBubble(test);
		System.out.println("�������, ����� ���������� �� ��������:");
		EnterMatrixNN.printMatrix(test);
		//-2-
		MatrixOperation.moveUp(test);
		EnterMatrixNN.printMatrix(test);
		MatrixOperation.moveDown(test);
		EnterMatrixNN.printMatrix(test);
		MatrixOperation.moveLeft(test);
		EnterMatrixNN.printMatrix(test);
		MatrixOperation.moveRight(test);
		EnterMatrixNN.printMatrix(test);
		//-3-
		MatrixOperation.range(test);
		//-4-
		MatrixOperation.sumPositive(test);
		//-5-
		MatrixOperation.transpose(test);
		System.out.println("������� ����� ����������������:");
		EnterMatrixNN.printMatrix(test);
		//-6-
		MatrixOperation.printNorma(test);
		//-7-
		MatrixOperation.rotate(test);
		System.out.println("������� ����� ��������: ");
		EnterMatrixNN.printMatrix(test);
		//-8-
		MatrixOperation.printDeterminant(test);
		//-9-
		MatrixOperation.minusAverage(test);
		System.out.println("�������, ���������� ����� ��������� �������� ��������������� �� ������� ��������: ");
		EnterMatrixNN.printMatrix(test);
		//-10-
		int [][]test10=MatrixOperation.deleteMaxElement(test);
		System.out.println("H���� �������, ����� �������� ������ � �������, ���������� ������������ �������: ");
		EnterMatrixNN.printMatrix(test10);
		//-11- ����� ������� ���������� ��� �������� �������� �����, ��� ��� ��� ��������� ���������� ��������� ����� � �������� � ������� ����� �������.
		int[][] test11=
				{{5,0,5},
				{0,0,0},
				{1,0,1}};
		EnterMatrixNN.printMatrix(test11);
		MatrixOperation.condense(test11);
		System.out.println("----------");
		//-12 ����� ���� �� ������ �������.
		MatrixOperation.printMinimumMove(test);
		//-13- ��. ��������� � 11 �������. ������� ��������.
		int[][] test13=
				{{5,0,5},
				{0,0,0},
				{1,0,1}};
		EnterMatrixNN.printMatrix(test13);
		MatrixOperation.zeroToRight(test13);
		System.out.println("----------");
		EnterMatrixNN.printMatrix(test13);
		//-14-��. ��������� � 13 �������. � ��� ������, ��� ����� �����?��
		double[][] test14=
					   {{5.4,0,5.6},
					   {0,0,0},
					   {1.8,0,1.1}};
		EnterMatrixNN.printMatrix(test14);
		int [][]test141=MatrixOperation.roundMatrix(test14);
		EnterMatrixNN.printMatrix(test141);
		//-15- ������������ � ��������� �������. ���� ������.
		EnterMatrixNN.printMatrix(test);
		MatrixOperation.printSaddlePoints(test);
		//-16-
		MatrixOperation.increaseSumRows(test);
		System.out.println("C��������� �� ������ �����: ");
		EnterMatrixNN.printMatrix(test);
		//-17-
		MatrixOperation.printLocalMinimum(test);
		//-18-
		MatrixOperation.minLocalMaximum(test);
		//-19-
		MatrixOperation.sortSumColumn(test);
		}
	}

//����� ���� ���� ������������� 20 ������� ������ ���� �� ���� �.�
