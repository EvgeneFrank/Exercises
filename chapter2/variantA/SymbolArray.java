package chapter2.variantA;
import java.util.HashSet;

/**
 * 
 * @author Евгений
 *
 */
public class SymbolArray {
	//------------------------------------------------------------------
	/**
	 * Вывод на консоль самого короткого по количеству символов числа.
	 * @param array проверяемая последовательность чисел.
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
		System.out.println("Длина самого короткого числа "+str+" в массиве равна "+min+" символов.");
	}
	/**
	 * Вывод на консоль самого длинного по количеству символов числа.
	 * @param array проверяемая последовательность чисел.
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
		System.out.println("Длина самого длинного числа "+str+"  массиве равна "+max+" символов.");
	}
	//------------------------------------------------------------------
	/**
	 * Сортировка чисел по количеству символов.
	 * @param array проверяемая последовательность чисел.
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
	 * Вывод на консоль сортировки чисел по количеству символов в числе.
	 * @param array проверяемая последовательность чисел.
	 */
	public void printSortLengthNumbers(String[]array) {
		sortLengthNumbers(array);
		System.out.println("Отсортированный массив: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
	//------------------------------------------------------------------
	/**
	 * Определение среднего количества символов элементов последовательности чисел.
	 * @param array проверяемая последовательность чисел.
	 * @return среднее количество символов.
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
	 * Вывод на консоль чисел, количество символов которых превышает среднее количество символов.
	 * @param array проверяемая последовательность чисел.
	 */
	public void printMoreAverage(String[]array) {
		double mean=meanLength(array);
		System.out.println("Числа, которые содержат символов больше, чем среднее количество символов: ");
		for(int i=0;i<array.length;i++) {
			if(mean<array[i].length()) {
				System.out.println("Число: "+array[i]+", длина: "+array[i].length()+" символов.");
			}
		}
		System.out.println();
	}
	/**
	 * Вывод на консоль чисел, количество символов которых ниже среднего количества символов.
	 * @param array проверяемая последовательность чисел.
	 */
	public void printLessAverage(String[] array) {
		double mean=meanLength(array);
		System.out.println("Числа, которые содержат символов меньше, чем среднее количество символов: ");
		for(int i=0;i<array.length;i++) {
			if(mean>array[i].length()) {
				System.out.println("Число: "+array[i]+", длина: "+array[i].length()+" символов.");
			}
		}
		System.out.println();
	}
	//------------------------------------------------------------------
	/**
	 * Нахождение количества разных символов в слове.
	 * @param word проверяемое слово.
	 * @return количество разных символов в слове.
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
	 * Вывод на консоль первого числа, в котором число различных символов минимально.
	 * @param array проверяемая последовательность.
	 */
	public void PrintMinDifferentSymbol(String []array) {
		System.out.print("Первое число, в котором число разлиных символов минимально: ");
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
	 * Нахождение числа с равным количеством четных и нечетных чисел.
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
	 * Количество чисел, которые содержат только четные числа.
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
		System.out.print("Числа с равным числом четных и нечетных чисел: ");
		for (String str:result) {
			if(isEvenOdd(str)) {
				System.out.print(str+" ");
				count++;
			}
		}
		System.out.println("\nКоличество четных чисел с равным количеством четных и нечетных чисел: "+count);
	}
	//------------------------------------------------------------------
	/**
	 * Сравнение двух чисел
	 * @param a
	 * @param b
	 * @return  true - Второй символ больше. false -Второй символ меньше.
	 */
	private boolean isTwoCharSymbolIncrement(char a,char b) {
		return (int)b-(int)a==1;
	}
	/**
	 * Сравнение чисел в числе.
	 * @param word
	 * @return true- числа идут по возрастанию.
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
	 * Вывод на консоль числа, цифры в котором идут в строгом возрастании.
	 * @param array
	 */
	public void increaseSymbol(String[]array) {
		System.out.print("Первое число, цифры в котором идут в строгом возрастании их значений: ");
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
	 * Нахождение числа, которое содержит в себе только различные цифры.
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
	 * Вывод на консоль первого числа, состоящего только из разных цифр.
	 * @param array
	 */
	public void searchDifferentSymbolNumbers(String[]array) {
		for (String number:array) {
			if(number.length()>1&&isSearchDifferentChar(number)) {
				System.out.println("Первое число, состоящее только из разных цифр: "+number);
				break;
			}
		}
	}
	//------------------------------------------------------------------
	/**
	 * Вывод на консоль чисел-палидромов.
	 * @param array
	 */
	public void palidromNumbers(String[]array) {
		System.out.println("Числа-палидромы: ");
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
