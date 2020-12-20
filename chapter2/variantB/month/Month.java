package chapter2.variantB.month;

import java.util.Scanner;
/**
 * Класс описание месяца.
 * @author Евгений
 *
 */
public class Month {
	private int number;
	/**
	 * Конструктор. Хранит любое целое число.
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
	 * Вывод на консоль названия месяца.
	 */
	public void searchMonth() {
		switch (getNumber())
		 {
		 case 1: System.out.println("январь");
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
		 case 9: System.out.println("сентябрь");
		 break;
		 case 10: System.out.println("октябрь");
		 break;
		 case 11: System.out.println("ноябрь");
		 break;
		 case 12: System.out.println("декабрь");
		 break;
		 default:System.out.println("Это не номер месяца, а что-то другое!!!!");
		 break;
		 }
	}
	/**
	 * Создание месяца пользователем.
	 * @return
	 */
	@SuppressWarnings("resource")
	public static Month enterMonth() {
		   int number; 
		   System.out.println("Введите номер месяца: ");
		   number=new Scanner(System.in).nextInt();
		   return new Month(number);
		}
	/**
	 * Проверка работоспособности.
	 * @param args
	 */
	public static void main(String [] args) {
		Month test=enterMonth();
		test.searchMonth();
	}
}
