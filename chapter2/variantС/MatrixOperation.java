package chapter2.variant�;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * �������� ��� ��������.
 * � ������ ����� ����� ������� �������? 0_� ��....���� �� ����, ��������� �� ��� ������?)))) ��������� ��� � ��������� ���� ���� ��� 20 �����, ������� � ��������...
 * @author Evgene
 */
public class MatrixOperation {
	private static Scanner scanner;
	/**
	 * 1. ����������� ������ (�������) ������� � ������� ����������� �������� ��������� k-�� ������� (������).
	 * ���������� �� �������.
	 * @param array �������.
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
	 * 1. ����������� ������ (�������) ������� � ������� ����������� �������� ��������� k-�� ������� (������).
	 * ���������� �� ��������.
	 * @param array �������.
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
	 * 2. ��������� ����������� ����� �������� ������� �� k ������� ������ (�����, �����, ����).
	 * ����� ������� ����� �� �������� ���������� �����.
	 * @param array �������.
	 */
	public static void moveUp(int [][]array){
		System.out.println("������� ����� �����: ");
	    scanner=new Scanner(System.in);
		int step=scanner.nextInt();
	    if (step>array.length||step<1){
	    	System.out.println("����� ����������!!!");
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
	 *2. ��������� ����������� ����� �������� ������� �� k ������� ������ (�����, �����, ����).
	 * ����� ������� ���� �� �������� ���������� �����.
	 * @param array �������.
	 */
    public static void moveDown(int [][]array){
    	scanner=new Scanner(System.in);
    	System.out.println("������� ����� ����: ");
    	int step=scanner.nextInt();
    	if (step>array.length||step<1){
    		System.out.println("����� ����������!!!");
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
     *2. ��������� ����������� ����� �������� ������� �� k ������� ������ (�����, �����, ����).
     * ����� ������� ������.
     * @param array �������.
     */
	public static void moveRight(int [][]array){
		scanner=new Scanner(System.in);
		System.out.println("������� ����� ������: ");
		int step=scanner.nextInt();
		if (step>array.length||step<1){
			System.out.println("����� ����������");
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
	 * 2. ��������� ����������� ����� �������� ������� �� k ������� ������ (�����, �����, ����).
	 * ����� ������� �����.
	 * @param a �������.
	 */
	public static void moveLeft(int [][]array){
		scanner=new Scanner(System.in);
	    System.out.println("������� ����� �����: ");
	    int step=scanner.nextInt();
	    if (step>array.length||step<1){
	    	System.out.println("����� ����������");
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
	 * 3. ����� � ������� ���������� ����� ������������ (���������) ��������� �������, ������ ������.
	 * ����� �� ����� ������������ ������������������ ������������ �����.
	 * @param array �������.
	 */
	public static void range(int [][]array){
		int[] f=new int[array.length*array.length];//���������� � ���������� ������
		int c = 0;int r=0;int max=0;int h=0;int m=0;int min=0;int h1=0;
		for(int[]x:array){
			for(int z:x){
				f[c++]=z;
			}
		}
		for (int g=0; g<f.length-1; g++) {
			if(f[g]<f[g+1]){ //���� ����������� ������� ������
				r+=1;
				if(r>max){
					max=r;h=g+1;
				}//���������� ���������� ����������� � ������ ���������� ������������� ��������
			}else{
				r=0;
			}//����������� ����������
			if(f[g]>f[g+1]){
				m+=1;
				if(m>min){
					min=m;
					h1=g+1;
				}//���������� ���������� ����������� � ������ ���������� ���������� ��������
			} else{
				m=0;
			} // �������� ����������
		}
		System.out.println("������������ ������������������ ������������ �����:");
		int[]l=new int[max+1];
		System.arraycopy(f,(h-max),l,0,(max+1));//�������� ������������������ ������������ ��������� � ����� ������
		System.out.println(Arrays.toString(l)+" "+(max+1));
		System.out.println("������������ ������������������ ��������� �����:");
		int[]t=new int[min+1];
		System.arraycopy(f,(h1-min),t,0,(min+1));//�������� ������������������ ��������� ��������� � ����� ������
		System.out.println(Arrays.toString(t)+" "+(min+1));
	}
	/**
	 * 4. ����� ����� ��������� �������, ������������� ����� ������ � ������ �������������� ���������� ������ ������.
	 * ����� �� ����� ����� ���� ������ ������������� ����� � �������.
	 * @param array �������.
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
			int p=i+1;//��� ������, � ��� 0 ������ ����-�� ����� ������� ��
			System.out.println("����� ������ ���� ������������� ��������� "+p+" ������ ����� "+summ);
		}
	}
	/**
	 * 5. ��������������� ���������� �������.
	 * @param array �������.
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
	 * 6. ��������� ����� �������.
	 * ����� ����� � �������� �� �����������. ������������ �����=�����.
	 * @param array ���������� �������.
	 * @return �����.
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
	 * 6. ��������� ����� �������.
	 * ����� �� ����� ����� �������.
	 * @param array ���������� �������.
	 */
	public static void printNorma(int[][]array) {
		System.out.println("����� �������: "+norma(array));
	}
	/**
	 * 7. ��������� ������� �� 90 (180, 270) �������� ������ ������� �������.
	 * @param array ���������� �������.
	 */
	public static void rotate(int [][]array){
		for (int k=0; k<array.length/2; k++){ // ���� -> �����
			for (int j=k; j<array.length-1-k; j++){ // ���� -> �����
	            // ������ ������� 4 ����
				int tmp=array[k][j];
	            array[k][j]=array[j][array.length-1-k];
	            array[j][array.length-1-k]=array[array.length-1-k][array.length-1-j];
	            array[array.length-1-k][array.length-1-j]=array[array.length-1-j][k];
	            array[array.length-1-j][k]=tmp;
	        }
		}
	}
	/**
	 * 8. ��������� ������������ �������.
	 * ������������ �������
	 * @param subMinor �����
	 * @param elemParentMinor �������� ����������� ������.
	 * @return ������������.
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
	 * 8. ��������� ������������ �������.
	 * ���������� ������� int � ���� double.
	 * @param array ���������� �������.
	 * @return ������� ���� double.
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
	* 8. ��������� ������������ �������.
	* ����� �� ����� ������������.
	* @param array ���������� �������.
	*/
	public static void printDeterminant(int [][]array){
		System.out.println("������������ ������� �����: "+getReduction(intToDoubleMatrix(array), 1));
	}
	/**
	 * 9. ��������� �������, ������� �� ��������� ������ ������ ������� �� ������� ��������������.
	 * @param array ���������� �������.
	 * @return ����� �������,���������� ���������� �� ��������� ������ ������ ������� �� �������� ���������������.
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
	 * 10. ����� ������������ ������� (�) � ������� � ������� �� ������� ��� ������ � �������, ��� ����������.
	 * @param array ���������� �������.
	 * @return ������� � ��������� ������ � ������� ���������� ������������ �������.
	 */
	public static int[][] deleteMaxElement(int [][]array){
		int [][]b=new int[array.length-1][array.length-1];//����� ������� � ���������� ������� � ��������, ���������� ���� �������
		int max=array[0][0]; //������������ �������
		int maxi = 0,maxj = 0; //������ � ������� ���� ��������
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
	 * 11. ��������� �������, ������ �� ��� ������ � �������, ����������� ������.
	 * ����� �� ����� ���������� ������� ����� �������� ����� � ��������, ������������ ������.
	 * @param array ���������� �������.
	 */
	public static void condense(int [][]array) {
		int n=array.length, m=array.length;
        boolean p=false;
		// ������� ������ ������
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
        // ������� ������ �������
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
        System.out.println("������� ����� ����������:");
        for (int i=0; i<m; i++, System.out.println()) {
            for (int j=0; j<m; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
	/**
	 * 12. � ������� ����� ����������� ������� � ����������� ��� �� ����� ��������� �������� ����� ������������ ����� � ��������.
	 * ����������� ������������ �������� ������� �� �������� �������, ����� ����������� ����� � ��������.
	 * @param array ���������� �������.
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
        System.out.print("������� ������ ��������� ��������: ");
        row=scanner.nextInt();
        System.out.print("������� ������� ��������� ��������: ");
        col=scanner.nextInt();
        // ������ ������� ������
        for (int i=0; i<array.length; i++) {
            tmp=array[pi][i];
            array[pi][i]=array[row][i];
            array[row][i]=tmp;
        }
        // ������ ������� �������
        for (int i=0; i<array.length; i++) {
            tmp=array[i][pj];
            array[i][pj]=array[i][col];
            array[i][col]=tmp;
        }
    }
	/**
	 * 12. � ������� ����� ����������� ������� � ����������� ��� �� ����� ��������� �������� ����� ������������ ����� � ��������.
	 * ����� �� ����� ������� � ������������ ��������� �� �������� �������.
	 * @param array ���������� �������.
	 */
	public static void printMinimumMove(int [][]array) {
		System.out.println("������� � ������������ ����������� ���������: ");
		minimumMove(array);
		EnterMatrixNN.printMatrix(array);
	}
	/**
	 * 13. ������������� ������ ������� ����� �������, ����� ��������, ������ ����, ������������� ����� ���� ���������.
	 * @param array ���������� �������.
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
	 * 14. ��������� ��� �������� ������� �� ������ �����.
	 * @param array ������� � �������� �������.
	 * @return ������� � ������ �������.
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
	 * 15. ����� ���������� ���� �������� ����� �������. (������� � ����� �������� ����� �i, j , ���� �i, j �������� ����������� 
	 * ��������� � i-� ������ � ������������ � j-� �������).
	 * @param array ���������� �������.
	 * @return ���������� �������� �����.
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
	 * 15. ����� ���������� ���� �������� ����� �������. (������� � ����� �������� ����� �i, j , ���� �i, j �������� ����������� 
	 * ��������� � i-� ������ � ������������ � j-� �������).
	 * ����� �� ����� ���������� �������� �����.
	 * @param array ���������� �������.
	 */
	public static void printSaddlePoints(int[][]array) {
		System.out.println("���������� �������� �����: "+saddlePoints(array));
	}
	/**
	 * 16. ����������� �������, ����������� � ��� ������ ���, ����� ����� ��������� � ������� ���������� ������� ����������.
	 * @param array ������ ���������� �������.
	 * @return ����� ������.
	 */
	private static int sumRow(int[]array) {
        int sum=0;
        for (int i=0; i<array.length; i++) {
            sum +=array[i];
        }
        return sum;
    }
	/**
	 * 16. ����������� �������, ����������� � ��� ������ ���, ����� ����� ��������� � ������� ���������� ������� ����������.
	 * ���������� ����� �� ����������� ����� ����� � ������������.
	 * @param array ���������� �������.
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
	 * 17. ����� ����� ��������� ���������. (�������� �������� ������� ������� ��������, ������� � ��� ����� ������� ��� ����. 
	 * ������� ������� ���������� ��������� ���������, ���� �� ������ ������ ���� ����� �������.)
	 * ��������� �� ��������� ������ ����.(�� ������� ����� ���������).
	 * @param array ���������� �������.
	 * @param row ������.
	 * @param column ������.
	 * @return �������� �� ��������� ���������.
	 */
	private static boolean localMin (int[][] array, int row, int column){
		int countRowFrom=row-1;
        int countRowFor=row+1;
        int countColumnFrom=column-1;
        int countColumnFor=column+1;
        // ������� ����� ���� �������.
        if ((row==0) && (column==0)){
            countRowFrom=0;
            countRowFor=row+1;
            countColumnFrom=0;
            countColumnFor=column+1;
        }
        //������� ������ ������� (����� �������).
        else if ((row==0) && (column>0) && (column<array.length-1)){
            countRowFrom=0;
            countRowFor=row+1;
            countColumnFrom=column-1;
            countColumnFor=column+1;
        }
        //������� ������ ���� �������.
        else if ((row==0) && (column==array.length-1)){
            countRowFrom=0;
            countRowFor=row+1;
            countColumnFrom=column-1;
            countColumnFor = column;
        }
        //������ ������� (����� �������).
        else if ((column==0) && (row>0) && (row<array.length-1)){
            countRowFrom=row-1;
            countRowFor=row+1;
            countColumnFrom=0;
            countColumnFor=column+1;
        }
        //��������� ������ ������� (����� �������).
        else if ((column==array.length-1) && (row>0) && (row<array.length-1)){
            countRowFrom=row-1;
            countRowFor=row+1;
            countColumnFrom=column-1;
            countColumnFor=column;
        }
        //������ ����� ���� �������.
        else if ((column==0) && (row==array.length-1)){
            countRowFrom=row-1;
            countRowFor=row;
            countColumnFrom=0;
            countColumnFor=column+1;
        }
        //������ ����� ������� (����� �������).
        else if ((column>0) && (column<array.length-1) && (row==array.length-1)){
            countRowFrom=row-1;
            countRowFor=row;
            countColumnFrom=column-1;
            countColumnFor=column+1;
        }
        //������ ������ ����.
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
	 * 17. ����� ����� ��������� ���������. (�������� �������� ������� ������� ��������, ������� � ��� ����� ������� ��� ����. 
	 * ������� ������� ���������� ��������� ���������, ���� �� ������ ������ ���� ����� �������.)
	 * @param array ���������� �������.
	 * @return ���������� ��������� ���������.
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
	 * 17. ����� ����� ��������� ���������. (�������� �������� ������� ������� ��������, ������� � ��� ����� ������� ��� ����. 
	 * ������� ������� ���������� ��������� ���������, ���� �� ������ ������ ���� ����� �������.)
	 * ����� �� ����� ����� ��������� ���������.
	 * @param array ���������� �������.
	 */
	public static void printLocalMinimum(int[][]array) {
		System.out.println("���������� ��������� ��������� � ������� �����: "+localMinimums(array));
	}
	/**
	 * 18. ����� ���������� ����� ��������� ����������. (������� ������� ���������� ��������� ���������, ���� �� ������ ������ 
	 * ���� ����� �������.)
	 * @param array ���������� �������.
	 * @param row ������.
	 * @param column �������.
	 * @return ��������� ��������.
	 */
	private static boolean localMax (int [][]array, int row, int column){
        int countRowFrom=row-1;
        int countRowFor=row+1;
        int countColumnFrom=column-1;
        int countColumnFor=column+1;
        // ������� ����� ���� �������
        if ((row==0) && (column==0)){
            countRowFrom=0;
            countRowFor=row+1;
            countColumnFrom=0;
            countColumnFor=column+1;
        }
        //������� ������ ������� (����� �������)
        else if ((row==0) && (column>0) && (column<array.length-1)){
            countRowFrom=0;
            countRowFor=row+1;
            countColumnFrom=column-1;
            countColumnFor=column+1;
        }
        //������� ������ ���� �������
        else if ((row==0) && (column==array.length-1)){
            countRowFrom=0;
            countRowFor=row+1;
            countColumnFrom=column-1;
            countColumnFor=column;
        }
        //������ ������� (����� �������)
        else if ((column==0) && (row>0) && (row<array.length-1)){
            countRowFrom=row-1;
            countRowFor=row+1;
            countColumnFrom=0;
            countColumnFor=column+1;
        }
        //��������� ������ ������� (����� �������)
        else if ((column==array.length-1) && (row>0) && (row<array.length-1)){
            countRowFrom=row-1;
            countRowFor=row+1;
            countColumnFrom=column-1;
            countColumnFor=column;
        }
        //������ ����� ���� �������
        else if ((column==0) && (row==array.length-1)){
            countRowFrom=row-1;
            countRowFor=row;
            countColumnFrom=0;
            countColumnFor=column+1;
        }
        //������ ����� ������� (����� �������)
        else if ((column>0) && (column<array.length-1) && (row==array.length-1)){
            countRowFrom=row-1;
            countRowFor=row;
            countColumnFrom=column-1;
            countColumnFor=column+1;
        }
        //������ ������ ����
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
	 * 18. ����� ���������� ����� ��������� ����������. (������� ������� ���������� ��������� ���������, ���� �� ������ ������ 
	 * ���� ����� �������.)
	 * ����� �� ����� ������������ ���������� ��������� �������.
	 * @param array ���������� �������.
	 */
	public static void minLocalMaximum(int [][]array) {
		int maxLocal=999; //����������� ��������, ������� ����� ���� � �������.���� ��� �� ����������.
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
	        if (maxCount==0)  System.out.println ("��������� �� �������.");
	        else System.out.println ("����������� ��������� �������� ������� ����� "+maxLocal);
	    }
	}
	/**
	 * 19. ����������� �������� �������, ����������� � ��� ������� ���, ����� �������� �� ������������� �������. 
	 * (��������������� ������� ������������� ������� ���������� ����� ������� ��� ���������.)
	 * @param array ���������� �������.
	 * @return ���������� ������� Integer. ��� �������� ���������� ������-�� ������ ������(((
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
	 * 19. ����������� �������� �������, ����������� � ��� ������� ���, ����� �������� �� ������������� �������. 
	 * (��������������� ������� ������������� ������� ���������� ����� ������� ��� ���������.)
	 * ����� �� ����� ��������������� �������� ������� �������. �������� �����-������ ����� ������� � ������� 
	 * HashMap (��������� � ��������� ��).
	 * @param array ���������� �������.
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
        System.out.println ("O�������������� ������:");
        for (int i=0; i<result.length; i++) {
            for (int j=0; j<result.length; j++) {
                System.out.print (result[j][i] + " ");
            }
            System.out.println ();
        }
    }
	/**
	 * 20. ����� ������������ ��������� ���������� ������������ ������� ��������
����, ����� �� ������������ ������� ��������� � ����� ������� ����, ���-
������ �� �������� � � ������� (2, 2), ��������� �� �������� � � ����-
��� (3, 3) � �. �., �������� ����� ������� ��� ������� ���������.

� ��� ��� �������, ������ �� ���� 20 ������� ������....��� :)
	 */
}
