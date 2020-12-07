package chapter1.variantB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Operations {
	/**
	 * ��� ����������������� ����� � ��������� �������.
	 */
	private  Scanner in;
	//1. ������ � �������� �����.
	/**
	 * ����� �� ������� ������ �����.
	 * @param array ������������������ �����, ��� ������ ������ �����.
	 */
	public void printEvenNumbers(int [] array) {
		System.out.println("������ �����:");
		for(int i=0;i<array.length;i++) { 
			if((array[i]&1)==0) { 
				System.out.print(array[i]+", ");
			}
		}
		System.out.println(".");
	}
	/**
	 * ����� �� ������� �������� �����.
	 * @param array ������������������ �����, ��� ������ �������� �����.
	 */
	public void printOddNumbers(int [] array) {
		System.out.println("�������� �����:");
		for(int i=0;i<array.length;i++) {
			if((array[i]&1)!=0) {
				System.out.print(array[i]+", ");
			}
		}
		System.out.println(".");
	}
	//------------------------------------------------------------------------------
	//2. ���������� � ���������� �����.
	/**
	 * ����� ������������ ��������.
	 * @param array ������������������ �����, ��� ������ ����������� ��������.
	 * @return ����������� ��������.
	 */
	private int minNumber(int [] array) {
		int min=array[0];
		for (int i=0;i<array.length;i++) {
			if (min>array[i]) { 
				min=array[i];
			}
		}
		return min;
	}
	/**
	 * ����� �� ������� ������������ ��������.
	 * @param array ������������������ �����, ��� ������ ����������� ��������.
	 */
	public void printMinNumber(int []array) {
		System.out.println("����������� ��������: "+minNumber(array));
	}
	/**
	 * ����� ������������� ��������. 
	 * @param array ������������������ �����, ��� ������ ������������ ��������.
	 * @return ������������ ��������.
	 */
	private int maxNumber(int [] array) {
		int max=array[0];
		for (int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		return max;
	}
	/**
	 * ����� �� ������� ������������� ���������
	 * @param array ������������������ �����, ��� ������ ������������ ��������.
	 */
	public void printMaxNumber(int []array) {
		System.out.println("������������ ��������: "+maxNumber(array));
	}
	//------------------------------------------------------------------------------
	/**
	 * �������� ��������� ����� ��� �������. ��� 3 � 4 �������.
	 * @param number �������.
	 * @param divide ��������.
	 * @return true-������� ��� �������.
	 */
	private boolean trueDivide(int number,int divide) {
		boolean result=false;
			if(number%divide==0) {
				result=true;
			}
		return result;
	}
	//3. �����, ������� ������� �� 3 ��� �� 9.
	/**
	 * ����� �� ������� �����, ������� ������� �� 3 ��� �� 9.
	 * @param array ������������������ ������� �����.
	 */
	public void divideThreeOrNine(int []array) {
		System.out.print("�����, ��������� �� 3 ��� 9: ");
		for (int i=0;i<array.length;i++) {
			if(trueDivide(array[i],3)^trueDivide(array[i],9)){
				System.out.print(array[i]+" ");
			}
		}
		System.out.println(".");
	}
	//------------------------------------------------------------------------------
	//4. �����, ������� ������� �� 5 � �� 7.
	/**
	 * ����� �� ������� �����, ������� ������� �� 5 � 7.
	 * @param array ������������������ ������� �����.
	 */
	public void divideFiveAndSeven(int []array) {
		System.out.print("�����, ��������� �� 5 � 7:");
		for(int i=0;i<array.length;i++) {
			if(trueDivide(array[i],5)&& trueDivide(array[i],7)) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();
	}
	//------------------------------------------------------------------------------
	//5. ��������, ������������� ������� �������� �� �������� �������.
	/**
	 * ���������� ����� �� ������ �� �������� � �������� ��������� ������� ��������.
	 * @param array ����������� ������.
	 */
	public  void bubbleABS(int []array) {
		for(int i=array.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(Math.abs(array[j])<Math.abs(array[j+1])){
					int tmp=array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
		        }
		    }
		}
	}
	//------------------------------------------------------------------------------
	//6. ��� ����������� �����, � ���������� ������ ������� ��� ���������� ����.
	/**
	 * ����������� ������������� �����.
	 * @param number �����, ������� ���� ���������� ��� �����������.
	 * @return true-���� ����� �����������.
	 */
	private boolean checkElementThree(int number) {
		boolean result=false;
		String tmp=Integer.toString(Math.abs(number));
		if (tmp.length()==3) {
			result=true;
		}
		return result;
	}
	/**
	 * ���������� ����������� �����, � ���������� ������ ������� ��� ���������� ����.(����� ������������� ��)
	 * @param array ����������� ������������������ �����.
	 * @return ���������� ��������������� �����.
	 */
	private int threeUniqueNumbersIndex(int []array){
		String number;
		int index=0;
		for(int i=0;i<array.length;i++){
			if (checkElementThree(array[i])) {
				number=Integer.toString(Math.abs(array[i]));
				if(number.length()==3&&number.charAt(0)!=number.charAt(1)&&number.charAt(1)!=number.charAt(2)&&number.charAt(0)!=number.charAt(2)) {
					index++;
				}
			}
		}
		return index;
	}
	/**
	 * �������� ������� ����������� �����, � ������ ������� ��� ���������� ����.
	 * @param array
	 * @return
	 */
	private int[] threeUniqueNumbersArray(int []array){
		String number;
		int j=0;
		int []uniqueNumbers=new int[threeUniqueNumbersIndex(array)];
		while (j<uniqueNumbers.length) {
			for(int i=0;i<array.length;i++){
				if (checkElementThree(array[i])) {
					number=Integer.toString(Math.abs(array[i]));
					if(number.length()==3&&number.charAt(0)!=number.charAt(1)&&number.charAt(1)!=number.charAt(2)&&number.charAt(0)!=number.charAt(2)) {
						uniqueNumbers[j]=array[i];
						j++;
					}
				}
			}
		}
		return uniqueNumbers;
	}
	/**
	 * ����� �� ������� ������������ �����, � ������ �������� ��� ���������� ����.
	 * @param array ����������� ������.
	 */
	public void threeUniqueNumbers(int []array){
		System.out.print("��� ����������� �����, � ���������� ������ ������� ��� ���������� ����: ");
		int []tmp=threeUniqueNumbersArray(array);
		for(int i=0;i<tmp.length;i++) {
			System.out.print(tmp[i]+" ");
		}
		System.out.println();
	}
	//------------------------------------------------------------------------------
	//7. ���������� ����� �������� � ���������� ����� ������� ���� �����.
	//� ������, ���� ����������� �����???
	private int findNOD(int a, int b) {
        while (b!=0) {
            int tmp=b;
            b=a%b;
            a=tmp;
        }
        return a;
    }
	public void printNODArray(int[] array) {
        int result=array[0];
        if (result==0) {
            System.out.println("���������� ����� �������� ����������� �����,� ���������� ������ ������� ��� ���������� ����: "+result);
        } else {
            for (int i=1;i<array.length;i++) {
                result=findNOD(result, array[i]);
            }
            System.out.println("���������� ����� �������� ����������� �����,� ���������� ������ ������� ��� ���������� ����: "+result);
        }
    }
	private int findNOK(int a,int b) {
        return a*(b / findNOD(a, b));
    }
	public void printNOKArray(int[] array) {
        int result=array[0];
        if (result==0) {
            System.out.println("���������� ����� ������� ����������� �����,� ���������� ������ ������� ��� ���������� ����: " + result);
        } else {
            for (int i=1;i<array.length;i++) {
                if (array[i]==0) {
                    break;
                }
                result = findNOK(result, array[i]);
            }
        }
        System.out.println("���������� ����� ������� ����������� �����,� ���������� ������ ������� ��� ���������� ����: " + result);
    }
	//------------------------------------------------------------------------------
	//8. ������� �����.
	/**
	 * ������� �� �����?
	 * @param n
	 * @return
	 */
	private  boolean isPrimeNumber(int n) {
		boolean prime=true;
		for (long i=3;i<=Math.sqrt(n); i+=2) {
			if (n<=1) {
				return false;
			}
			if (n==2) {
				return true;
		    }
			if (n%i==0) {
				prime=false;
				break;
			}
		}
		return (n%2!=0&&prime&&n>2)||n==2;
	}
	/**
	 * ����� �� ������� ������ ��������� ������� �����
	 * @param array
	 */
	public void printPrimeNumbers(int []array){
		int tmp=0;
		for (int i=0;i<array.length;i++){
			if (isPrimeNumber(array[i])) {
				tmp++;
			}
		}
		int[] result=new int[tmp];
		for (int i=0;i<array.length;i++){
			if (isPrimeNumber(array[i])){
				for(int j=0;j<result.length;j++){
					result[j]=array[i];
				}
			}
		}
		System.out.println("������� �����: "+Arrays.toString(result));//��� �������, ��� ����� ���� ��
	}
	//------------------------------------------------------------------------------
	//9. ��������������� ����� � ������� ����������� � ��������.
	/**
	 * ���������� �� �������� � ��������.
	 * @param array
	 */
	public void reverseBubble(int []array) {
		for(int i=array.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(array[j]<array[j+1]){
					int tmp=array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
		        }
		    }
		}
	}
	/**
	 * ���������� �� �������� � ��������.
	 * @param array 
	 */
	public void bubble(int []array){
		for(int i=array.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(array[j]>array[j+1]){
					int tmp=array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
		        }
		    }
		}
	}
	//------------------------------------------------------------------------------
	//10. ����� � ������� �������� ������� ������������� �����.
	/**
	 * 10. ����� � ������� �������� ������� ������������� �����.
	 *  ����� �� ����� ����� � ������� �������� ������� ������������� �����. ������������, ��� ���� ��!!!
	 * @param array 
	 */
	public void printFrequencyNumber(int []array){
		for(int i=0;i<array.length;i++){
			int n=0;
			for(int j=0;j<array.length;j++){
				if(array[i]==array[j]) n++;
			}
			System.out.println("����� "+array[i]+" ��� "+n);
		}
	}
	//------------------------------------------------------------------------------
	//11. ����������� �����.
	/**
	 * ����� �� ������� "����������" �����.
	 * @param array 
	 */ 
	public void printHappyNumbers(int []array){
		String number;
		System.out.print("���������� �����: ");
		for (int i=0;i<array.length;i++){
			number=Integer.toString(array[i]);
			if (number.length()==4&&number.charAt(0)+number.charAt(1)==number.charAt(2)+number.charAt(3)) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();
	}
	//------------------------------------------------------------------------------
	//12. ����� ���������: f0 = f1 = 1, f (n) = f (n�1) + f (n�2)
	/**
	 * ���������� � ����� �� ������� ����� ���������, ������������ � �������� ������������������.
	 * @param array 
	 */
	public void printFibonacciMas(int []array){
		System.out.print("����� ��������: ");
		int n,n1;
		double nn,result;
		int k,k1;
		double kk,result1;
	for(int i=0;i<array.length;i++){
			n=(array[i]*array[i]*5)+4;// ������ ����� ��������
			nn=Math.sqrt(n);//1.2
			n1=(int)nn;
			result=n1%nn;
			k=(array[i]*array[i]*5)-4;//������ ����� ��������
			kk=Math.sqrt(k);//2.2
			k1=(int)kk;
			result1=k1%kk;
			if(result==0||result1==0) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();
	}
	//------------------------------------------------------------------------------
	// 13. �����-����������, �������� ������� � ������ � �������� ������� ���������.
	/**
	 * ����� �� ������� �����-����������.
	 * @param array 
	 */
	public void printPalidromNumber(int []array){
		System.out.print("�����-���������: ");
		String s;
		StringBuilder str;
		for(int i=0;i<array.length;i++){
			s=Integer.toString(array[i]);
			str=new StringBuilder( s.subSequence(0, s.length()));
		    if(s.toString().equals(str.reverse().toString())) {
		    	System.out.print(array[i]+" ");	
	        }
		}
		System.out.println();
	}
	//------------------------------------------------------------------------------
	//14. ��������, ������� ����� ��������� �������� ���������.
	/**
	 * ����� �� ������� ���������, ������� ����� ��������� �������� ���������.
	 * @param array
	 */
	public void printPolysumm(int []array){
		System.out.print("��������� �������� ���������: ");
		double summ=0.0;
		for(int i=1;i<array.length;i++){
			summ=(array[i]+array[i-1])/2;
			System.out.print(summ+" ");
		}
		System.out.println();
	}
	//------------------------------------------------------------------------------
	//15. ������ ���������� ����� p = m/n ��� ������ ���� ����� ������������� ����� n � m, ������������� ������
	/**
	 * ����� �� ������� ������� ���������� ����� p = m/n ��� ������ ���� ����� ������������� ����� n � m, ������������� ������. 
	 * @param array ������.
	 */
	public void printPerionDesytichoqDrobi(int []array){
		int p,q,r=1,l,t,i;
		for (int n=0;n<array.length-1;n++) {
			if(array.length<2) { 
				break;
			}else if(array[n]>=0&&array[n+1]>=0){
				      p=array[n];
					  q=array[n+1];
					  r=p;
					  for(i=0;i<q;i++) {
						  r=(r*10)%q;
					  }
					  if(q==0) q=1;
			t=r;
			l=0;
			do{
				r=(r*10)%q;
				l++;
			}while(r!=t);
			t=r=p;
			System.out.print("������ ���������� ����� p=m/n ��� ������ ���� ����� ������������� ����� ������������� "+"������: 0.");
			for(i=0;i<l;i++) { 
				r=(r*10)%q;
			}
			for(i=0;r!=t;i++){
				System.out.print((t*10)/q);
				r=(r*10)%q;
				t=(t*10)%q;
			}
			System.out.print('(');
			for (i=0;i<l;i++){
				System.out.print( (t*10)/q);
				t=(t*10)%q;
			}
			System.out.println(')'+"= "+p+"/"+q);
			break;
			}
		}
	}
	//------------------------------------------------------------------------------
	//16. ��������� ����������� ������� ��� ������� �������������� �����.
	/**
	 *  ����� �� ������� ������������ ������� ��� ������� �������������� �����. 
	 * @param array ������.
	 */
	public void buildPascalTriangleNumber(int[]array) {
		List<Integer> positiveNumbers=new ArrayList<Integer>();
		//��������� ������������� ����� � ������.
		for(int i=0;i<array.length;i++){
			if(array[i]>=0) {
				positiveNumbers.add(array[i]);
			}
		}
		int firstNumber=positiveNumbers.get(0);//������ ������������� �����.
		System.out.print("������� ����� ������������ ������� ��� ����� "+firstNumber+" ����������? ");
		in=new Scanner(System.in);
		int rows=in.nextInt();
		for (int y=0;y<rows;y++) {
			int c=firstNumber;
			for (int i=0;i<rows-y;i++) {
				System.out.print("   ");
			}
			for (int x=0;x<=y;x++) {
				System.out.print("   "+c+" ");
				c=c*(y-x) / (x+1);
			}
			System.out.println();
		}	
	}
	
	/**
	 * �������� ����������������� ���� ���� ������.
	 * @param args
	 */
	
	public static void main(String[]args) {
		int []proverka= {3,35,70,6,9,12,-31,81,95,777,87,99,150,-123,17,1221};
		for(int i=0;i<proverka.length;i++) System.out.print(proverka[i]+" ");//------------
		System.out.println();
		Operations p=new Operations();
		p.printEvenNumbers(proverka);
		p.printOddNumbers(proverka);
		p.printMinNumber(proverka);
		p.printMaxNumber(proverka);
		p.divideThreeOrNine(proverka);
		p.divideFiveAndSeven(proverka);
		p.bubbleABS(proverka);
		for(int i=0;i<proverka.length;i++) System.out.print(proverka[i]+" ");//------------
		System.out.println();
		p.threeUniqueNumbers(proverka);
		p.printNODArray(proverka);
		p.printNOKArray(proverka);
		p.printPrimeNumbers(proverka);
		p.reverseBubble(proverka);
		System.out.println("M����� � ������� �������� �������� ���������: "+Arrays.toString(proverka));
		p.bubble(proverka);
		System.out.println("������ � ������� ���������� �������� ���������: "+Arrays.toString(proverka));
		p.printFrequencyNumber(proverka);
		p.printHappyNumbers(proverka);
		p.printFibonacciMas(proverka);
		p.printPalidromNumber(proverka);
		p.printPolysumm(proverka);
		p.printPerionDesytichoqDrobi(proverka);
		p.buildPascalTriangleNumber(proverka);
		
	}
}
