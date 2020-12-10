package chapter2.variantA;

import java.util.HashSet;

/**
 * 
 * @author �������
 *
 */
public class SymbolArray {
	//------------------------------------------------------------------
	/**
	 * ����� �� ������� ������ ��������� �� ���������� �������� �����.
	 * @param array ����������� ������������������ �����.
	 */
	public void minLengthNumber(String[] array) {
		int min=array[0].length();
		String str=array[0];
		for(int i=0;i<array.length;i++) {
			if(min>array[i].length()) {
				min=array[i].length();
				str=new String(array[i]);
			}
		}
		System.out.println("����� ������ ��������� ����� "+str+" � ������� ����� "+min+" ��������.");
	}
	/**
	 * ����� �� ������� ������ �������� �� ���������� �������� �����.
	 * @param array ����������� ������������������ �����.
	 */
	public void maxLengthNumber(String[]array) {
		int max=array[0].length();
		String str=array[0];
		for(int i=0;i<array.length;i++) {
			if(max<array[i].length()) {
				max=array[i].length();
				str=new String(array[i]);
			}
		}
		System.out.println("����� ������ �������� ����� "+str+"  ������� ����� "+max+" ��������.");
	}
	//------------------------------------------------------------------
	/**
	 * ���������� ����� �� ���������� ��������.
	 * @param array ����������� ������������������ �����.
	 */
	public void sortLengthNumbers(String[]array) {
		for(int i=array.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(array[j].length()>array[j+1].length()) {
					String tmp=array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}
			}
		}
	}
	/**
	 * ����� �� ������� ���������� ����� �� ���������� �������� � �����.
	 * @param array ����������� ������������������ �����.
	 */
	public void printSortLengthNumbers(String[]array) {
		sortLengthNumbers(array);
		System.out.println("��������������� ������: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
	//------------------------------------------------------------------
	/**
	 * ����������� �������� ���������� �������� ��������� ������������������ �����.
	 * @param array ����������� ������������������ �����.
	 * @return ������� ���������� ��������.
	 */
	private double meanLength(String []array) {
		double result=0;
		for(int i=0;i<array.length;i++) {
			result+=array[i].length();
		}
		result=result/array.length;
		return result;
	}
	/**
	 * ����� �� ������� �����, ���������� �������� ������� ��������� ������� ���������� ��������.
	 * @param array ����������� ������������������ �����.
	 */
	public void printMoreAverage(String[]array) {
		double mean=meanLength(array);
		System.out.println("�����, ������� �������� �������� ������, ��� ������� ���������� ��������: ");
		for(int i=0;i<array.length;i++) {
			if(mean<array[i].length()) {
				System.out.println("�����: "+array[i]+", �����: "+array[i].length()+" ��������.");
			}
		}
		System.out.println();
	}
	/**
	 * ����� �� ������� �����, ���������� �������� ������� ���� �������� ���������� ��������.
	 * @param array ����������� ������������������ �����.
	 */
	public void printLessAverage(String[] array) {
		double mean=meanLength(array);
		System.out.println("�����, ������� �������� �������� ������, ��� ������� ���������� ��������: ");
		for(int i=0;i<array.length;i++) {
			if(mean>array[i].length()) {
				System.out.println("�����: "+array[i]+", �����: "+array[i].length()+" ��������.");
			}
		}
		System.out.println();
	}
	//------------------------------------------------------------------
	/**
	 * ���������� ���������� ������ �������� � �����.
	 * @param word ����������� �����.
	 * @return ���������� ������ �������� � �����.
	 */
	private int countDifferentSymbols(String word) {
		char []tmp=word.toCharArray();
		int result=0;
		for(int i=1;i<tmp.length;i++) {
			if(tmp[0]!=tmp[i]) {
				result++;
			}
		}
		return result;
	}
	/**
	 * ����� �� ������� ������� �����, � ������� ����� ��������� �������� ����������.
	 * @param array ����������� ������������������.
	 */
	public void PrintMinDifferentSymbol(String []array) {
		System.out.print("������ �����, � ������� ����� �������� �������� ����������: ");
		String result=array[0];
		for (int i=0;i<array.length;i++) {
			if(countDifferentSymbols(result)>countDifferentSymbols(array[i])) {
				result=new String(array[i]);
			}
		}
		System.out.println(result);
	}
	//------------------------------------------------------------------
	/**
	 * ���������� ����� � ������ ����������� ������ � �������� �����.
	 * @param str
	 * @return
	 */
	private boolean isEvenOdd(String str) {
		int even=0, odd=0;
		for(int i=0;i<str.length();i++) {
			if(Character.getNumericValue(str.charAt(i))%2==0) {
				even++;
			}else odd++;
		}
		if(even==odd) return true;
		else return false;
	}
	/**
	 * ���������� �����, ������� �������� ������ ������ �����.
	 * @param array
	 * @return
	 */
	private int lengthResultArray(String []array) {
		int result=0;
		for(int i=0;i<array.length;i++) {
			if(Integer.parseInt(array[i])%2==0) {
				result++;
			}
		}
		return result;
	}
	public void evenOdd(String[]array) {
		String [] result=new String[lengthResultArray(array)];
		int j=0;
		for(int i=0;i<array.length;i++) {
			if (Integer.parseInt(array[i])%2==0) {
				result[j]=array[i];
				j++;
			}
		}
		int count=0;
		System.out.print("����� � ������ ������ ������ � �������� �����: ");
		for (String str:result) {
			if(isEvenOdd(str)) {
				System.out.print(str+" ");
				count++;
			}
		}
		System.out.println("\n���������� ������ ����� � ������ ����������� ������ � �������� �����: "+count);
	}
	//------------------------------------------------------------------
	/**
	 * ��������� ���� �����
	 * @param a
	 * @param b
	 * @return  true - ������ ������ ������. false -������ ������ ������.
	 */
	private boolean isTwoCharSymbolIncrement(char a,char b) {
		return (int)b-(int)a==1;
	}
	/**
	 * ��������� ����� � �����.
	 * @param word
	 * @return true- ����� ���� �� �����������.
	 */
	private boolean isWordSymbolIncrement(String word) {
		char[] wordChars=word.toCharArray();
		if(wordChars.length<2) {
			return false;
		}
		boolean result=false;
		for(int i=0;i<wordChars.length-1;i++) {
			if(isTwoCharSymbolIncrement(wordChars[i],wordChars[i+1])) {
				result=true;
			}else {
				return false;
			}
		}
		return result;
	}
	/**
	 * ����� �� ������� �����, ����� � ������� ���� � ������� �����������.
	 * @param array
	 */
	public void increaseSymbol(String[]array) {
		System.out.print("������ �����, ����� � ������� ���� � ������� ����������� �� ��������: ");
		for(String number:array) {
			if( isWordSymbolIncrement(number)) {
				System.out.print(number);
				break;
			}
		}
		System.out.println();
	}
	//------------------------------------------------------------------
	/**
	 * ���������� �����, ������� �������� � ���� ������ ��������� �����.
	 * @param str
	 * @return
	 */
	private boolean isSearchDifferentChar(String str) {
		HashSet<Character> uniqueChars=new HashSet<Character>();
		for(Character ch:str.toCharArray()) {
			if(!uniqueChars.add(Character.toLowerCase(ch))) {
				return false;
			}
		}
		return true;
	}
	/**
	 * ����� �� ������� ������� �����, ���������� ������ �� ������ ����.
	 * @param array
	 */
	public void searchDifferentSymbolNumbers(String[]array) {
		for (String number:array) {
			if(number.length()>1&&isSearchDifferentChar(number)) {
				System.out.println("������ �����, ��������� ������ �� ������ ����: "+number);
				break;
			}
		}
	}
	//------------------------------------------------------------------
	/**
	 * ����� �� ������� �����-����������.
	 * @param array
	 */
	public void palidromNumbers(String[]array) {
		System.out.println("�����-���������: ");
		StringBuilder str;
		for(int i=0;i<array.length;i++) {
			str=new StringBuilder(array[i].subSequence(0, array[i].length()));
			if(str.toString().equals(str.reverse().toString())) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		SymbolArray test=new SymbolArray();
		String []testNumbers= {"18","9","1983","0","18091983","12345","11211"};
		//<1>
				test.minLengthNumber(testNumbers);
				test.maxLengthNumber(testNumbers);
				//<2>
				test.printSortLengthNumbers(testNumbers);
				//<3>
				test.printMoreAverage(testNumbers);
				test.printLessAverage(testNumbers);
				//<4>
				test.PrintMinDifferentSymbol(testNumbers);
				//<5>
				test.evenOdd(testNumbers);
				//<6>
				test.increaseSymbol(testNumbers);
			    //<7>
				test.searchDifferentSymbolNumbers(testNumbers);
				//<8>
				test.palidromNumbers(testNumbers);
	}
}
