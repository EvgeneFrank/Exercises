package chapter2.variantB.interval;

import java.util.Scanner;
/**
 * Операции над интервалом.
 * @author Евгений
 *
 */
public class Operations {
	/**
	 * Пользовательский создание интервала.
	 * @return
	 */
	public static Interval newUserInterval() {
		double n,m;
		boolean left,right;
		System.out.print("Введите левую границу интервала ([,(): ");
		String tmpLeft=extracted().nextLine();
		if(tmpLeft.equals("(")) {
			left=true;
		}else {
			left=false;
		}
		System.out.print("Введите начало промежутка: ");
		n=extracted().nextDouble();
		System.out.print("Введите конец промежутка: ");
		m=extracted().nextDouble();
		System.out.print("Введите правую границу интервала (],) ): ");
		String tmpRight=extracted().nextLine();
		if(tmpRight.equals(")")) {
			right=true;
		}else {
			right=false;
		}
		return new Interval(left,n,m,right);
	}
	private static Scanner extracted() {
		return new Scanner(System.in);
	}
	/**
	 * Ввод пользовательского значения и сравнение его принадлежности интервалу. В принципе можно разделить на два метода.
	 * @param inter 
	 */
	public static void checkingValue(Interval inter) {
		double k;
		System.out.println("Введите значение, для проверки его принадлежности к интервалу: ");
		k=extracted().nextDouble();
		if(inter.isLeft()==true&&inter.isRight()==true) {
			if(k>inter.getN()&&k<inter.getM()) {
				System.out.println("Значение "+k+" принадлежит интервалу "+inter.toString());
			}else System.out.println("Значение "+k+" не принадлежит интервалу "+inter.toString());
		}
		if(inter.isLeft()==false&&inter.isRight()==true) {
			if(k>=inter.getN()&&k<inter.getM()) {
				System.out.println("Значение "+k+" принадлежит интервалу "+inter.toString());
			}else System.out.println("Значение "+k+" не принадлежит интервалу "+inter.toString());
		}
		if(inter.isLeft()==false&&inter.isRight()==false) {
			if(k>=inter.getN()&&k<=inter.getM()) {
				System.out.println("Значение "+k+" принадлежит интервалу "+inter.toString());
			}else System.out.println("Значение "+k+" не принадлежит интервалу "+inter.toString());
		}
		if(inter.isLeft()==true&&inter.isRight()==false) {
			if(k>inter.getN()&&k<=inter.getM()) {
				System.out.println("Значение "+k+" принадлежит интервалу "+inter.toString());
			}else System.out.println("Значение "+k+" не принадлежит интервалу "+inter.toString());
		}
	}
}
