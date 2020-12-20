package chapter2.variantС;

public class Runner {
	public static void main(String []args) {
		//-0-
		int size=EnterMatrixNN.enterSize();
		int [][]test=EnterMatrixNN.newMatrix(size);
		EnterMatrixNN.printMatrix(test);
		//-1-
		MatrixOperation.sortStringBubble(test);
		System.out.println("Матрица, после сортировки по строкам:");
		EnterMatrixNN.printMatrix(test);
		MatrixOperation.sortColumnBubble(test);
		System.out.println("Матрица, после сортировки по столбцам:");
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
		System.out.println("Матрица после транспонирования:");
		EnterMatrixNN.printMatrix(test);
		//-6-
		MatrixOperation.printNorma(test);
		//-7-
		MatrixOperation.rotate(test);
		System.out.println("Матрица после поворота: ");
		EnterMatrixNN.printMatrix(test);
		//-8-
		MatrixOperation.printDeterminant(test);
		//-9-
		MatrixOperation.minusAverage(test);
		System.out.println("Матрица, полученная после вычитания среднего арифметического из каждого элемента: ");
		EnterMatrixNN.printMatrix(test);
		//-10-
		int [][]test10=MatrixOperation.deleteMaxElement(test);
		System.out.println("Hовая матрица, после удаления строки и столбца, содержащих максимальный элемент: ");
		EnterMatrixNN.printMatrix(test10);
		//-11- Новая матрица необходима для проверки удаления нулей, так как при случайном заполнении появление нулей в столбцах и строках почти нулевая.
		int[][] test11=
				{{5,0,5},
				{0,0,0},
				{1,0,1}};
		EnterMatrixNN.printMatrix(test11);
		MatrixOperation.condense(test11);
		System.out.println("----------");
		//-12 Далее идем по первой матрице.
		MatrixOperation.printMinimumMove(test);
		//-13- См. пояснение к 11 заданию. Похожая ситуация.
		int[][] test13=
				{{5,0,5},
				{0,0,0},
				{1,0,1}};
		EnterMatrixNN.printMatrix(test13);
		MatrixOperation.zeroToRight(test13);
		System.out.println("----------");
		EnterMatrixNN.printMatrix(test13);
		//-14-См. пояснение к 13 заданию. А кто сказал, что будет легко?хд
		double[][] test14=
					   {{5.4,0,5.6},
					   {0,0,0},
					   {1.8,0,1.1}};
		EnterMatrixNN.printMatrix(test14);
		int [][]test141=MatrixOperation.roundMatrix(test14);
		EnterMatrixNN.printMatrix(test141);
		//-15- Возвращаемся к начальной матрице. Нули прошли.
		EnterMatrixNN.printMatrix(test);
		MatrixOperation.printSaddlePoints(test);
		//-16-
		MatrixOperation.increaseSumRows(test);
		System.out.println("Cортировка по суммам строк: ");
		EnterMatrixNN.printMatrix(test);
		//-17-
		MatrixOperation.printLocalMinimum(test);
		//-18-
		MatrixOperation.minLocalMaximum(test);
		//-19-
		MatrixOperation.sortSumColumn(test);
		}
	}

//После всех этих издевательств 20 задание делать пока не буду о.о
