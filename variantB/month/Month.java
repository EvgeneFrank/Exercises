package chapter2.variantB.month;

import java.util.Scanner;
/**
 *  ласс описание мес€ца.
 * @author ≈вгений
 *
 */
public class Month {
	private int number;
	/**
	 *  онструктор. ’ранит любое целое число.
	 * @param number
	 */
	public Month(int number) {
		this.setNumber(number);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * ¬ывод на консоль названи€ мес€ца.
	 */
	public void searchMonth() {
		switch (getNumber())
		 {
		 case 1: System.out.println("€нварь");
		 break;
		 case 2:System.out.println("февраль");
		 break;
		 case 3: System.out.println("март");
		 break;
		 case 4: System.out.println("апрель");
		 break;
		 case 5: System.out.println("май");
		 break;
		 case 6: System.out.println("июнь");
		 break;
		 case 7: System.out.println("июль");
		 break;
		 case 8: System.out.println("август");
		 break;
		 case 9: System.out.println("сент€брь");
		 break;
		 case 10: System.out.println("окт€брь");
		 break;
		 case 11: System.out.println("но€брь");
		 break;
		 case 12: System.out.println("декабрь");
		 break;
		 default:System.out.println("Ёто не номер мес€ца, а что-то другое!!!!");
		 break;
		 }
	}
	/**
	 * —оздание мес€ца пользователем.
	 * @return
	 */
	@SuppressWarnings("resource")
	public static Month enterMonth() {
		   int number; 
		   System.out.println("¬ведите номер мес€ца: ");
		   number=new Scanner(System.in).nextInt();
		   return new Month(number);
		}
	/**
	 * ѕроверка работоспособности.
	 * @param args
	 */
	public static void main(String [] args) {
		Month test=enterMonth();
		test.searchMonth();
	}
}
