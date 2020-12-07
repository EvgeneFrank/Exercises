package chapter1.variantB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Operations {
	/**
	 * Для пользовательского ввода в последнем задании.
	 */
	private  Scanner in;
	//1. Четные и нечетные числа.
	/**
	 * Вывод на консоль четных чисел.
	 * @param array последовательность чисел, где ищутся четные числа.
	 */
	public void printEvenNumbers(int [] array) {
		System.out.println("Четные числа:");
		for(int i=0;i<array.length;i++) { 
			if((array[i]&1)==0) { 
				System.out.print(array[i]+", ");
			}
		}
		System.out.println(".");
	}
	/**
	 * Вывод на консоль нечетных чисел.
	 * @param array последовательность чисел, где ищутся нечетные числа.
	 */
	public void printOddNumbers(int [] array) {
		System.out.println("Нечетные числа:");
		for(int i=0;i<array.length;i++) {
			if((array[i]&1)!=0) {
				System.out.print(array[i]+", ");
			}
		}
		System.out.println(".");
	}
	//------------------------------------------------------------------------------
	//2. Наибольшее и наименьшее число.
	/**
	 * Поиск минимального значения.
	 * @param array последовательность чисел, где ищется минимальное значение.
	 * @return минимальное значение.
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
	 * Вывод на консоль минимального значения.
	 * @param array последовательность чисел, где ищется минимальное значение.
	 */
	public void printMinNumber(int []array) {
		System.out.println("Минимальное значение: "+minNumber(array));
	}
	/**
	 * Поиск максимального значения. 
	 * @param array последовательность чисел, где ищется максимальное значение.
	 * @return максимальное значение.
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
	 * Вывод на консоль максимального знначения
	 * @param array последовательность чисел, где ищется максимальное значение.
	 */
	public void printMaxNumber(int []array) {
		System.out.println("Максимальное значение: "+maxNumber(array));
	}
	//------------------------------------------------------------------------------
	/**
	 * Проверка делимости числа без остатка. Для 3 и 4 заданий.
	 * @param number Делимое.
	 * @param divide Делитель.
	 * @return true-делится без остатка.
	 */
	private boolean trueDivide(int number,int divide) {
		boolean result=false;
			if(number%divide==0) {
				result=true;
			}
		return result;
	}
	//3. Числа, которые делятся на 3 или на 9.
	/**
	 * Вывод на консоль чисел, которые делятся на 3 или на 9.
	 * @param array последовательность искомых чисел.
	 */
	public void divideThreeOrNine(int []array) {
		System.out.print("Числа, делящиеся на 3 или 9: ");
		for (int i=0;i<array.length;i++) {
			if(trueDivide(array[i],3)^trueDivide(array[i],9)){
				System.out.print(array[i]+" ");
			}
		}
		System.out.println(".");
	}
	//------------------------------------------------------------------------------
	//4. Числа, которые делятся на 5 и на 7.
	/**
	 * Вывод на консоль чисел, которые делятся на 5 и 7.
	 * @param array последовательность искомых чисел.
	 */
	public void divideFiveAndSeven(int []array) {
		System.out.print("Числа, делящиеся на 5 и 7:");
		for(int i=0;i<array.length;i++) {
			if(trueDivide(array[i],5)&& trueDivide(array[i],7)) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();
	}
	//------------------------------------------------------------------------------
	//5. Элементы, расположенные методом пузырька по убыванию модулей.
	/**
	 * Сортировка чисел по модулю от большего к меньшему значениям методом пузырька.
	 * @param array сортируемый массив.
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
	//6. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
	/**
	 * Определение трехзначности числа.
	 * @param number число, которое надо определить как трехзначное.
	 * @return true-если число трехзначное.
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
	 * Количество трехзначных чисел, в десятичной записи которых нет одинаковых цифр.(Нужно отрефакторить хд)
	 * @param array проверяемая последовательность чисел.
	 * @return количество отсортированных чисел.
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
	 * Создание массива трехзначных чисел, в записи которых нет одинаковых цифр.
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
	 * Вывод на консоль трехзначного числа, в записи которого нет одинаковых цифр.
	 * @param array Проверяемый массив.
	 */
	public void threeUniqueNumbers(int []array){
		System.out.print("Все трехзначные числа, в десятичной записи которых нет одинаковых цифр: ");
		int []tmp=threeUniqueNumbersArray(array);
		for(int i=0;i<tmp.length;i++) {
			System.out.print(tmp[i]+" ");
		}
		System.out.println();
	}
	//------------------------------------------------------------------------------
	//7. Наибольший общий делитель и наименьшее общее кратное этих чисел.
	//В смысле, этих трехзначных чисел???
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
            System.out.println("Наибольший общий делитель трехзначных чисел,в десятичной записи которых нет одинаковых цифр: "+result);
        } else {
            for (int i=1;i<array.length;i++) {
                result=findNOD(result, array[i]);
            }
            System.out.println("Наибольший общий делитель трехзначных чисел,в десятичной записи которых нет одинаковых цифр: "+result);
        }
    }
	private int findNOK(int a,int b) {
        return a*(b / findNOD(a, b));
    }
	public void printNOKArray(int[] array) {
        int result=array[0];
        if (result==0) {
            System.out.println("Наименьшее общее кратное трехзначных чисел,в десятичной записи которых нет одинаковых цифр: " + result);
        } else {
            for (int i=1;i<array.length;i++) {
                if (array[i]==0) {
                    break;
                }
                result = findNOK(result, array[i]);
            }
        }
        System.out.println("Наименьшее общее кратное трехзначных чисел,в десятичной записи которых нет одинаковых цифр: " + result);
    }
	//------------------------------------------------------------------------------
	//8. Простые числа.
	/**
	 * Простое ли число?
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
	 * Вывод на консоль списка найденных простых чисел
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
		System.out.println("Простые числа: "+Arrays.toString(result));//Оно удобнее, чем через цикл хд
	}
	//------------------------------------------------------------------------------
	//9. Отсортированные числа в порядке возрастания и убывания.
	/**
	 * Сортировка от большего к меньшему.
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
	 * Сортировка от меньшего к большему.
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
	//10. Числа в порядке убывания частоты встречаемости чисел.
	/**
	 * 10. Числа в порядке убывания частоты встречаемости чисел.
	 *  Вывод на экран чисел в порядке убывания частоты встречаемости чисел. Недоработано, ибо лень хд!!!
	 * @param array 
	 */
	public void printFrequencyNumber(int []array){
		for(int i=0;i<array.length;i++){
			int n=0;
			for(int j=0;j<array.length;j++){
				if(array[i]==array[j]) n++;
			}
			System.out.println("Число "+array[i]+" раз "+n);
		}
	}
	//------------------------------------------------------------------------------
	//11. «Счастливые» числа.
	/**
	 * Вывод на консоль "счастливых" чисел.
	 * @param array 
	 */ 
	public void printHappyNumbers(int []array){
		String number;
		System.out.print("Счастливые числа: ");
		for (int i=0;i<array.length;i++){
			number=Integer.toString(array[i]);
			if (number.length()==4&&number.charAt(0)+number.charAt(1)==number.charAt(2)+number.charAt(3)) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();
	}
	//------------------------------------------------------------------------------
	//12. Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2)
	/**
	 * Нахождение и вывод на консоль чисел Фибоначчи, содержащихся в заданной последовательности.
	 * @param array 
	 */
	public void printFibonacciMas(int []array){
		System.out.print("Числа фибоначи: ");
		int n,n1;
		double nn,result;
		int k,k1;
		double kk,result1;
	for(int i=0;i<array.length;i++){
			n=(array[i]*array[i]*5)+4;// первая часть свойства
			nn=Math.sqrt(n);//1.2
			n1=(int)nn;
			result=n1%nn;
			k=(array[i]*array[i]*5)-4;//вторая часть свойства
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
	// 13. Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
	/**
	 * Вывод на консоль чисел-палидромов.
	 * @param array 
	 */
	public void printPalidromNumber(int []array){
		System.out.print("Числа-палидроны: ");
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
	//14. Элементы, которые равны полусумме соседних элементов.
	/**
	 * Вывод на консоль элементов, которые равны полусумме соседних элементов.
	 * @param array
	 */
	public void printPolysumm(int []array){
		System.out.print("Полусумма соседних элементов: ");
		double summ=0.0;
		for(int i=1;i<array.length;i++){
			summ=(array[i]+array[i-1])/2;
			System.out.print(summ+" ");
		}
		System.out.println();
	}
	//------------------------------------------------------------------------------
	//15. Период десятичной дроби p = m/n для первых двух целых положительных чисел n и m, расположенных подряд
	/**
	 * Вывод на консоль периода десятичной дроби p = m/n для первых двух целых положительных чисел n и m, расположенных подряд. 
	 * @param array Массив.
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
			System.out.print("Период десятичной дроби p=m/n для первых двух целых положительных чисел расположенных "+"подряд: 0.");
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
	//16. Построить треугольник Паскаля для первого положительного числа.
	/**
	 *  Вывод на консоль треугольника Паскаля для первого положительного числа. 
	 * @param array Массив.
	 */
	public void buildPascalTriangleNumber(int[]array) {
		List<Integer> positiveNumbers=new ArrayList<Integer>();
		//Добавляем положительные числа в список.
		for(int i=0;i<array.length;i++){
			if(array[i]>=0) {
				positiveNumbers.add(array[i]);
			}
		}
		int firstNumber=positiveNumbers.get(0);//первое положительное число.
		System.out.print("Сколько строк треугольника Паскаля для числа "+firstNumber+" отображать? ");
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
	 * Проверка работоспособности всей этой лабуды.
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
		System.out.println("Mассив в порядке убывания значения элементов: "+Arrays.toString(proverka));
		p.bubble(proverka);
		System.out.println("Массив в порядке увеличения значения элементов: "+Arrays.toString(proverka));
		p.printFrequencyNumber(proverka);
		p.printHappyNumbers(proverka);
		p.printFibonacciMas(proverka);
		p.printPalidromNumber(proverka);
		p.printPolysumm(proverka);
		p.printPerionDesytichoqDrobi(proverka);
		p.buildPascalTriangleNumber(proverka);
		
	}
}
