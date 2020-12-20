package chapter2.variantÑ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Операции над матрицой.
 * В начале книги такие сложные задания? 0_о Хм....даже не знаю, правильно ли все сделал?)))) Последний раз с матрицами имел дело лет 20 назад, поэтому я серьезно...
 * @author Evgene
 */
public class MatrixOperation {
	private static Scanner scanner;
	/**
	 * 1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
	 * Сортировка по строкам.
	 * @param array Матрица.
	 */
	public static void sortStringBubble(int [][]array){
		for(int i=0;i<array.length;i++){
			for(int j=array.length-1;j>0;j--){
				for(int n=0;n<j;n++){
					if(array[n][i]>array[n+1][i]){
						int tmp=array[n][i];
		                array[n][i]=array[n+1][i];
		                array[n+1][i]=tmp;
		            }
		        }
		    }
		}
	}
	/**
	 * 1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
	 * Сортировка по столбцам.
	 * @param array Матрица.
	 */
	public static void sortColumnBubble(int [][]array){
		for(int i=0;i<array.length;i++){
			for(int j=array.length-1;j>0;j--) {
		        for(int n=0;n<j;n++){
		            if(array[i][n]>array[i][n+1]){
		                int tmp=array[i][n];
		                array[i][n]=array[i][n+1];
		                array[i][n+1]=tmp;
		            }
		        }
		    }
		}
	}
	/**
	 * 2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
	 * Сдвиг матрицы вверх на заданное количество строк.
	 * @param array Матрица.
	 */
	public static void moveUp(int [][]array){
		System.out.println("Введите сдвиг вверх: ");
	    scanner=new Scanner(System.in);
		int step=scanner.nextInt();
	    if (step>array.length||step<1){
	    	System.out.println("Сдвиг невозможен!!!");
		    return;
		}
	    int buff, i, j;
	 	for (int r=0; r<step; r++){
	 		for (i=0; i<array.length; i++){
	 			buff=array[i][0];
		        for (j=0; j<array.length-1; j++){
		        	array[i][j]=array[i][j+1];
		        }
		        array[i][j]=buff;
		    }
	 	}
	}
	/**
	 *2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
	 * Сдвиг матрицы вниз на заданное количество строк.
	 * @param array Матрица.
	 */
    public static void moveDown(int [][]array){
    	scanner=new Scanner(System.in);
    	System.out.println("Введите сдвиг вниз: ");
    	int step=scanner.nextInt();
    	if (step>array.length||step<1){
    		System.out.println("Сдвиг невозможен!!!");
    		return;
    	}
    	int buff,i,j;
    	for (int r=0; r<step; r++){
    		for (i=0; i<array.length; i++){
    			buff=array[i][array.length-1];
    			for (j = array.length-1; j>0; j--){
    				array[i][j]=array[i][j-1];
    			}
    			array[i][j]=buff;
    		}
    	}
    }
    /**
     *2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
     * Сдвиг матрицы вправо.
     * @param array Матрица.
     */
	public static void moveRight(int [][]array){
		scanner=new Scanner(System.in);
		System.out.println("Введите сдвиг вправо: ");
		int step=scanner.nextInt();
		if (step>array.length||step<1){
			System.out.println("Сдвиг невозможен");
			return;
		}
		int buff, i, j;
		for (int r=0; r<step; r++){          
			for (i=0; i<array.length; i++){
				buff=array[array.length-1][i];
				for (j=array.length-1; j>0; j--){
					array[j][i]=array[j-1][i];
				}
				array[j][i]=buff;
			}
		}
	}
	/**
	 * 2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
	 * Сдвиг матрицы влево.
	 * @param a матрица.
	 */
	public static void moveLeft(int [][]array){
		scanner=new Scanner(System.in);
	    System.out.println("Введите сдвиг влево: ");
	    int step=scanner.nextInt();
	    if (step>array.length||step<1){
	    	System.out.println("Сдвиг невозможен");
	    	return;
	    }
	    int buff, i, j;
	    for (int r=0; r<step; r++){
	    	for (i=0; i<array.length; i++){
	    		buff=array[0][i];
	    		for (j=0; j<array.length-1; j++){
	    			array[j][i]=array[j+1][i];
	    		}
	    		array[j][i]=buff;
	    	}
	    }
    }
	/**
	 * 3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
	 * Вывод на экран максимальной последовательности возрастающих чисел.
	 * @param array Матрица.
	 */
	public static void range(int [][]array){
		int[] f=new int[array.length*array.length];//преобразум в одномерный массив
		int c = 0;int r=0;int max=0;int h=0;int m=0;int min=0;int h1=0;
		for(int[]x:array){
			for(int z:x){
				f[c++]=z;
			}
		}
		for (int g=0; g<f.length-1; g++) {
			if(f[g]<f[g+1]){ //если последующий элемент больше
				r+=1;
				if(r>max){
					max=r;h=g+1;
				}//запоминаем количество возрастаний и индекс последнего возрастающего элемента
			}else{
				r=0;
			}//возрастание прервалось
			if(f[g]>f[g+1]){
				m+=1;
				if(m>min){
					min=m;
					h1=g+1;
				}//запоминаем количество возрастаний и индекс последнего убывающего элемента
			} else{
				m=0;
			} // убывание прервалось
		}
		System.out.println("Максимальная последовательность возрастающих чисел:");
		int[]l=new int[max+1];
		System.arraycopy(f,(h-max),l,0,(max+1));//копируем последовательность возрастающих элементов в новый массив
		System.out.println(Arrays.toString(l)+" "+(max+1));
		System.out.println("Максимальная последовательность убывающих чисел:");
		int[]t=new int[min+1];
		System.arraycopy(f,(h1-min),t,0,(min+1));//копируем последовательность убывающих элементов в новый массив
		System.out.println(Arrays.toString(t)+" "+(min+1));
	}
	/**
	 * 4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.
	 * Вывод на экран суммы двух первых положительных числа в матрице.
	 * @param array Матрица.
	 */
	public static void sumPositive(int [][]array){
		for(int i=0; i<array.length; i++) {
			int summ=0,start=0,n,end=0;
			for(int j=0; j<array.length; j++) {
				if(array[j][i]>0) {
					start=j;
					break;
				}
			}
			for(n=start+1; n<array.length; n++){
				if(array[n][i]>0){
					end=n;
					break;
				}
			}
			for(n=start;n<=end;n++){
				summ=summ+array[n][i];
			}
			int p=i+1;//для печати, а тож 0 строка кого-то может смутить хд
			System.out.println("Сумма первых двух положительных элементов "+p+" строки равна "+summ);
		}
	}
	/**
	 * 5. Транспонировать квадратную матрицу.
	 * @param array Матрица.
	 */
	public static void transpose(int [][]array){
		for (int i=0; i<array.length; i++){
			for (int j=i+1; j<array.length; j++){
				int p=array[i][j];
	            array[i][j]=array[j][i];
	            array[j][i]=p;
	        }
		}
	}
	/**
	 * 6. Вычислить норму матрицы.
	 * Сумма строк в столбцах по отдельности. Максимальная сумма=норма.
	 * @param array Квадратная матрица.
	 * @return Норма.
	 */
	public static double norma(int [][]array){
		double result=0.0;
		for (int i=0; i<array.length; i++) {
			double s=0.0;
			for (int j=0; j<array.length; j++) {
				s+= Math.abs(array[j][i]);
			}
			if (s>result) result=s;
		}
		return result;
	}
	/**
	 * 6. Вычислить норму матрицы.
	 * Вывод на экран нормы матрицы.
	 * @param array Квадратная матрица.
	 */
	public static void printNorma(int[][]array) {
		System.out.println("Норма матрицы: "+norma(array));
	}
	/**
	 * 7. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
	 * @param array Квадратная матрица.
	 */
	public static void rotate(int [][]array){
		for (int k=0; k<array.length/2; k++){ // край -> центр
			for (int j=k; j<array.length-1-k; j++){ // лево -> право
	            // меняем местами 4 угла
				int tmp=array[k][j];
	            array[k][j]=array[j][array.length-1-k];
	            array[j][array.length-1-k]=array[array.length-1-k][array.length-1-j];
	            array[array.length-1-k][array.length-1-j]=array[array.length-1-j][k];
	            array[array.length-1-j][k]=tmp;
	        }
		}
	}
	/**
	 * 8. Вычислить определитель матрицы.
	 * Определитель матрицы
	 * @param subMinor минор
	 * @param elemParentMinor элементы вычеркнутой строки.
	 * @return Определитель.
	 */
	 private static double getReduction(double [][] subMinor, double elemParentMinor) {
		 double summ=0;
		 if (subMinor.length>1){
			 double [][] tmpMinor=new double[subMinor.length-1][subMinor[0].length-1];
			 for (int c=0; c<subMinor[0].length; c++) {
				 for (int i=1; i<subMinor.length; i++) {
					 for (int j=0; j<subMinor[0].length; j++) {
						 if (j<c) tmpMinor[i-1][j]=subMinor[i][j];
						 else if (j>c) tmpMinor[i-1][j-1]=subMinor[i][j];
	                 }
	             }
	             double paramForSub=Math.pow(-1,c+2)*subMinor[0][c]*elemParentMinor;
	             getReduction(tmpMinor,paramForSub);
	         }
	     }else summ+=elemParentMinor*subMinor[0][0];
		 return summ;
	}
	 /**
	 * 8. Вычислить определитель матрицы.
	 * Приведение матрицы int к типу double.
	 * @param array Квадратная матрица.
	 * @return Матрица типа double.
	 */
	 private static double[][] intToDoubleMatrix(int[][]array) {
		 double[][]result=new double[array.length][array.length];
		 for(int i=0;i<array.length;i++) {
			 for(int j=0;j<array.length;j++) {
				 result[i][j]=array[i][j];
			 }
		 }
		 return result;
	 }
	/**
	* 8. Вычислить определитель матрицы.
	* Вывод на экран определителя.
	* @param array Квадратная матрица.
	*/
	public static void printDeterminant(int [][]array){
		System.out.println("Определитель матрицы равен: "+getReduction(intToDoubleMatrix(array), 1));
	}
	/**
	 * 9. Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
	 * @param array Квадратная матрица.
	 * @return Новая матрица,полученная вычитанием из элементов каждой строки матрицы ее среднего арифметического.
	 */
	public static double[][] minusAverage(int [][]array){
		double [][]b=new double[array.length][array.length];
		int n=0;
		int k=array.length*array.length;
		double av;
		for (int i=0; i<array.length; i++){
			for(int j=0;j<array.length;j++){
				n+=array[i][j];
			}
		}
		av=n/k;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++) {
				b[i][j]=array[i][j]-av;
			}
		}
		return b;
	}
	/**
	 * 10. Найти максимальный элемент (ы) в матрице и удалить из матрицы все строки и столбцы, его содержащие.
	 * @param array Квадратная матрица.
	 * @return Матрица с удалением строки и столбца содержащей максимальный элемент.
	 */
	public static int[][] deleteMaxElement(int [][]array){
		int [][]b=new int[array.length-1][array.length-1];//новая матрица с удаленными строкой и столбцом, содержещее макс элемент
		int max=array[0][0]; //максимальный элемент
		int maxi = 0,maxj = 0; //строка и столбец макс элемента
		for(int j=0;j<array.length;j++){
			for(int i=0;i<array.length;i++){
				if(max<array[j][i]){
					max=array[j][i];
					maxi=i;
					maxj=j;
				}
			}
		}
		for(int i=0,i1=0;i<array.length;i++){
			if(i!=maxi){
				for(int j=0,j1=0;j<array.length;j++){
					if(j!=maxj){
						b[j1][i1]=array[j][i];
						j1=j1+1;
					}
				}
				i1=i1+1;
			}
		}
		return b;   
	}
	/**
	 * 11. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.
	 * Вывод на экран уплотнение матрицы путем удаления строк и столбцов, заполненными нулями.
	 * @param array Квадратная матрица.
	 */
	public static void condense(int [][]array) {
		int n=array.length, m=array.length;
        boolean p=false;
		// Удаляем лишние строки
        for (int i=0; i<n; i++) {
            p = true;
            for (int j=0; j<m; j++)
                if (array[i][j]!=0) {
                    p = false;
                    break;
                }
            if (p) {
                for (int k=i; k<(n-1); k++)
                    for (int j=0; j<m; j++)
                        array[k][j]=array[k+1][j];
                --i;
                --n;
            }
        }
        // Удаляем лишние столбцы
        for (int j=0; j<m; j++) {
            p=true;
            for (int i=0; i<n; i++)
                if (array[i][j]!=0) {
                	p=false;
                    break;
                }
            if (p) {
                for (int k=j; k<(m-1); k++)
                    for (int i=0; i<m; i++)
                        array[i][k]=array[i][k+1];
                --j;
                --m;
            }
        }
        System.out.println("Матрица после уплотнения:");
        for (int i=0; i<m; i++, System.out.println()) {
            for (int j=0; j<m; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
	/**
	 * 12. В матрице найти минимальный элемент и переместить его на место заданного элемента путем перестановки строк и столбцов.
	 * Перемещение минимального элемента матрицы на заданную позицию, путем перемещения строк и столбцов.
	 * @param array Квадратная матрица.
	 */
	public static void minimumMove(int [][]array) {
		int min=0,pi=0,pj=0;
		for (int i=0; i<array.length; i++){
			for (int j=0; j<array.length; j++){
                if (array[i][j]<min){
                    min=array[i][j];
                    pi=i;
                    pj=j;
                    }
                }
			}
        System.out.println("min: "+min+", "+pi+","+pj);
        int row, col, tmp;
        System.out.print("Введите строку заданного элемента: ");
        row=scanner.nextInt();
        System.out.print("Введите столбец заданного элемента: ");
        col=scanner.nextInt();
        // меняем местами строки
        for (int i=0; i<array.length; i++) {
            tmp=array[pi][i];
            array[pi][i]=array[row][i];
            array[row][i]=tmp;
        }
        // меняем местами столбцы
        for (int i=0; i<array.length; i++) {
            tmp=array[i][pj];
            array[i][pj]=array[i][col];
            array[i][col]=tmp;
        }
    }
	/**
	 * 12. В матрице найти минимальный элемент и переместить его на место заданного элемента путем перестановки строк и столбцов.
	 * Вывод на экран матрицы с перемещенным элементом на заданную позицию.
	 * @param array Квадратная матрица.
	 */
	public static void printMinimumMove(int [][]array) {
		System.out.println("Матрица с перемещенным минимальным элементом: ");
		minimumMove(array);
		EnterMatrixNN.printMatrix(array);
	}
	/**
	 * 13. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.
	 * @param array Квадратная матрица.
	 */
	public static void zeroToRight(int[][]array) {
        for (int i=0; i<array.length; i++) {
            int n=0;
            int[] b=new int[array.length];
            for (int j=0; j<array.length; j++) {
                if (array[i][j]!=0) {
                    b[n++]=array[i][j];
                }
            }
            array[i]=Arrays.copyOf(b, b.length);
        }
    }
	/**
	 * 14. Округлить все элементы матрицы до целого числа.
	 * @param array Матрица с нецелыми числами.
	 * @return Матрица с целыми числами.
	 */
	public static int[][] roundMatrix(double[][]array) {
        int[][] result=new int[array.length][array.length];
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                result[i][j]=(int) Math.round(array[i][j]);
            }
        }
        return result;
    }
	/**
	 * 15. Найти количество всех седловых точек матрицы. (Матрица А имеет седловую точку Аi, j , если Аi, j является минимальным 
	 * элементом в i-й строке и максимальным в j-м столбце).
	 * @param array Квадратная матрица.
	 * @return Количество седловых точек.
	 */
	public static int saddlePoints(int [][]array) {
		int min,max,count = 0;
		for (int i=0; i<array.length; i++){
            min=array[i][0];
            for (int j=1; j<array.length; j++) {
                if (min>array[i][j]){
                	min=array[i][j];
                }
            }
            for (int j=0; j<array.length; j++){
                if (array[i][j]==min){
                	max=array[0][j];
                    for (int i2=1; i2<array.length; i2++) { 
                        if (max<array[i2][j]){
                            max=array[i2][j];
                        }
                    }
                    if (array[i][j]==max){
                    	count++;
                    }
                }
            }
        }
		return count;
	}
	/**
	 * 15. Найти количество всех седловых точек матрицы. (Матрица А имеет седловую точку Аi, j , если Аi, j является минимальным 
	 * элементом в i-й строке и максимальным в j-м столбце).
	 * Вывод на экран количества седловых точек.
	 * @param array Квадратная матрица.
	 */
	public static void printSaddlePoints(int[][]array) {
		System.out.println("Количество седловых точек: "+saddlePoints(array));
	}
	/**
	 * 16. Перестроить матрицу, переставляя в ней строки так, чтобы сумма элементов в строках полученной матрицы возрастала.
	 * @param array Строка квадратной матрицы.
	 * @return Сумма строки.
	 */
	private static int sumRow(int[]array) {
        int sum=0;
        for (int i=0; i<array.length; i++) {
            sum +=array[i];
        }
        return sum;
    }
	/**
	 * 16. Перестроить матрицу, переставляя в ней строки так, чтобы сумма элементов в строках полученной матрицы возрастала.
	 * Сортировка строк от минимальной суммы строк к максимальной.
	 * @param array Квадратная матрица.
	 */
	public static void increaseSumRows(int [][]array) {
		int[] buffer;
		int minSumRow, sumRow;
		for (int j=array.length-1; j>0; j--) {
			for (int i=0; i<j; i++) {
				minSumRow=sumRow(array[i]);
		        sumRow=sumRow(array[i+1]);
		        if (minSumRow>sumRow) {
		        	buffer=array[i];
		            array[i]=array[i+1];
		            array[i+1]=buffer;
		        }
		    }
		}
	}
	/**
	 * 17. Найти число локальных минимумов. (Соседями элемента матрицы назовем элементы, имеющие с ним общую сторону или угол. 
	 * Элемент матрицы называется локальным минимумом, если он строго меньше всех своих соседей.)
	 * Разбивать на отдельные методы лень.(Уж длинный метод получился).
	 * @param array Квадратная матрица.
	 * @param row Строка.
	 * @param column Стобец.
	 * @return Является ли локальным минимумом.
	 */
	private static boolean localMin (int[][] array, int row, int column){
		int countRowFrom=row-1;
        int countRowFor=row+1;
        int countColumnFrom=column-1;
        int countColumnFor=column+1;
        // Верхний левый угол матрицы.
        if ((row==0) && (column==0)){
            countRowFrom=0;
            countRowFor=row+1;
            countColumnFrom=0;
            countColumnFor=column+1;
        }
        //Верхняя строка матрицы (кроме угловых).
        else if ((row==0) && (column>0) && (column<array.length-1)){
            countRowFrom=0;
            countRowFor=row+1;
            countColumnFrom=column-1;
            countColumnFor=column+1;
        }
        //Верхний правый угол матрицы.
        else if ((row==0) && (column==array.length-1)){
            countRowFrom=0;
            countRowFor=row+1;
            countColumnFrom=column-1;
            countColumnFor = column;
        }
        //Первый столбец (кроме угловых).
        else if ((column==0) && (row>0) && (row<array.length-1)){
            countRowFrom=row-1;
            countRowFor=row+1;
            countColumnFrom=0;
            countColumnFor=column+1;
        }
        //Последний слобец матрицы (кроме угловых).
        else if ((column==array.length-1) && (row>0) && (row<array.length-1)){
            countRowFrom=row-1;
            countRowFor=row+1;
            countColumnFrom=column-1;
            countColumnFor=column;
        }
        //Нижний левый угол матрицы.
        else if ((column==0) && (row==array.length-1)){
            countRowFrom=row-1;
            countRowFor=row;
            countColumnFrom=0;
            countColumnFor=column+1;
        }
        //Нижняя линия матрицы (кроме угловых).
        else if ((column>0) && (column<array.length-1) && (row==array.length-1)){
            countRowFrom=row-1;
            countRowFor=row;
            countColumnFrom=column-1;
            countColumnFor=column+1;
        }
        //Нижний правый угол.
        else if ((row==array.length-1) && (column==array.length-1)){
            countRowFrom=row-1;
            countRowFor=row;
            countColumnFrom=column-1;
            countColumnFor=column;
        }
        for (int i=countRowFrom; i<=countRowFor; i++) {
            for (int j=countColumnFrom; j<=countColumnFor; j++) {
                if ((i==row) && (j==column)){
                }else if (array[i][j]<=array[row][column]) {
                	return false;
                }
            }
        }
        return true;
    }
	/**
	 * 17. Найти число локальных минимумов. (Соседями элемента матрицы назовем элементы, имеющие с ним общую сторону или угол. 
	 * Элемент матрицы называется локальным минимумом, если он строго меньше всех своих соседей.)
	 * @param array Квадратная матрица.
	 * @return Количество локальных минимумов.
	 */
	public static int localMinimums(int [][]array) {
		int count=0;
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array.length; j++) {
				if (localMin (array,i,j)) {
					count++;
				}
			}
		}
        return count;
   }
	/**
	 * 17. Найти число локальных минимумов. (Соседями элемента матрицы назовем элементы, имеющие с ним общую сторону или угол. 
	 * Элемент матрицы называется локальным минимумом, если он строго меньше всех своих соседей.)
	 * Вывод на экран числа локальных минимумов.
	 * @param array Квадратная матрица.
	 */
	public static void printLocalMinimum(int[][]array) {
		System.out.println("Количество локальных минимумов в матрице равно: "+localMinimums(array));
	}
	/**
	 * 18. Найти наименьший среди локальных максимумов. (Элемент матрицы называется локальным минимумом, если он строго меньше 
	 * всех своих соседей.)
	 * @param array Квадратная матрица.
	 * @param row Строка.
	 * @param column Столбец.
	 * @return Локальный максимум.
	 */
	private static boolean localMax (int [][]array, int row, int column){
        int countRowFrom=row-1;
        int countRowFor=row+1;
        int countColumnFrom=column-1;
        int countColumnFor=column+1;
        // верхний левый угол матрицы
        if ((row==0) && (column==0)){
            countRowFrom=0;
            countRowFor=row+1;
            countColumnFrom=0;
            countColumnFor=column+1;
        }
        //верхняя строка матрицы (кроме угловых)
        else if ((row==0) && (column>0) && (column<array.length-1)){
            countRowFrom=0;
            countRowFor=row+1;
            countColumnFrom=column-1;
            countColumnFor=column+1;
        }
        //верхний правый угол матрицы
        else if ((row==0) && (column==array.length-1)){
            countRowFrom=0;
            countRowFor=row+1;
            countColumnFrom=column-1;
            countColumnFor=column;
        }
        //первый столбец (кроме угловых)
        else if ((column==0) && (row>0) && (row<array.length-1)){
            countRowFrom=row-1;
            countRowFor=row+1;
            countColumnFrom=0;
            countColumnFor=column+1;
        }
        //последний слобец матрицы (кроме угловых)
        else if ((column==array.length-1) && (row>0) && (row<array.length-1)){
            countRowFrom=row-1;
            countRowFor=row+1;
            countColumnFrom=column-1;
            countColumnFor=column;
        }
        //нижний левый угол матрицы
        else if ((column==0) && (row==array.length-1)){
            countRowFrom=row-1;
            countRowFor=row;
            countColumnFrom=0;
            countColumnFor=column+1;
        }
        //нижняя линия матрицы (кроме угловых)
        else if ((column>0) && (column<array.length-1) && (row==array.length-1)){
            countRowFrom=row-1;
            countRowFor=row;
            countColumnFrom=column-1;
            countColumnFor=column+1;
        }
        //нижний правый угол
        else if ((row==array.length-1) && (column==array.length-1)){
            countRowFrom=row-1;
            countRowFor=row;
            countColumnFrom=column-1;
            countColumnFor=column;
        }
        for (int i=countRowFrom; i<=countRowFor; i++) {
            for (int j=countColumnFrom; j<=countColumnFor; j++) {
                if ((i==row) && (j==column)){
                }else if (array[i][j]>=array[row][column]) {
                    return false;
                }
            }
        }
        return true;
    }
	/**
	 * 18. Найти наименьший среди локальных максимумов. (Элемент матрицы называется локальным минимумом, если он строго меньше 
	 * всех своих соседей.)
	 * Вывод на экран минимального локального максимума матрицы.
	 * @param array Квадратная матрица.
	 */
	public static void minLocalMaximum(int [][]array) {
		int maxLocal=999; //аксимальное значение, которое может быть в массиве.Надо как то переделать.
		int maxCount =0;
		if (array.length==1){
			System.out.println (array[0][0]);
	    }else {   
	    	for (int i=0; i<array.length; i++) {
	    		for (int j=0; j<array.length; j++) {
	    			if (localMax (array,i,j)&&array[i][j]<maxLocal) {
	                    maxCount++;
	                    if (array[i][j]<maxLocal)  maxLocal=array[i][j];
	                }
	            }
	    	}
	        if (maxCount==0)  System.out.println ("Максимумы не найдены.");
	        else System.out.println ("Минимальный локальный максимум матрицы равен "+maxLocal);
	    }
	}
	/**
	 * 19. Перестроить заданную матрицу, переставляя в ней столбцы так, чтобы значения их характеристик убывали. 
	 * (Характеристикой столбца прямоугольной матрицы называется сумма модулей его элементов.)
	 * @param array Квадратная матрица.
	 * @return Квадратная матрица Integer. Без перевода компилятор почему-то выдает ошибку(((
	 */
	private static Integer[][] intToInteger(int [][]array) {
		Integer[][]result=new Integer[array.length][array.length];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				result[i][j]=array[i][j];
	        }
		}
		return result;
	}
	/**
	 * 19. Перестроить заданную матрицу, переставляя в ней столбцы так, чтобы значения их характеристик убывали. 
	 * (Характеристикой столбца прямоугольной матрицы называется сумма модулей его элементов.)
	 * Вывод на экран отсортированной согласно заданию матрицы. Возможно когда-нибудь такое сделать с помощью 
	 * HashMap (подглядел в интернете хд).
	 * @param array Квадратная матрица.
	 */
	public static void sortSumColumn(int[][]array) {
		Integer[][]result;
		result=intToInteger(array);
		List<Integer[]> matrixList=Arrays.asList (result);     
        Collections.sort (matrixList, new Comparator<Integer[]> () {
            public int compare (Integer[] o1, Integer[] o2) {
                int sum1=0;
                int sum2=0;
                for (int numb:o1) {
                    sum1+=Math.abs (numb);
                }
                for (int numb:o2) {
                    sum2+=Math.abs (numb);
                }
                return sum2-sum1;
            }
        });
        System.out.println ("Oтсортированный массив:");
        for (int i=0; i<result.length; i++) {
            for (int j=0; j<result.length; j++) {
                System.out.print (result[j][i] + " ");
            }
            System.out.println ();
        }
    }
	/**
	 * 20. Путем перестановки элементов квадратной вещественной матрицы добиться
того, чтобы ее максимальный элемент находился в левом верхнем углу, сле-
дующий по величине — в позиции (2, 2), следующий по величине — в пози-
ции (3, 3) и т. д., заполнив таким образом всю главную диагональ.

А сие уже достало, потому не буду 20 задание делать....вот :)
	 */
}
