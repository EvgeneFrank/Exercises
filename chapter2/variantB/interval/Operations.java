package chapter2.variantB.interval;

import java.util.Scanner;
/**
 * �������� ��� ����������.
 * @author �������
 *
 */
public class Operations {
	/**
	 * ���������������� �������� ���������.
	 * @return
	 */
	public static Interval newUserInterval() {
		double n,m;
		boolean left,right;
		System.out.print("������� ����� ������� ��������� ([,(): ");
		String tmpLeft=extracted().nextLine();
		if(tmpLeft.equals("(")) {
			left=true;
		}else {
			left=false;
		}
		System.out.print("������� ������ ����������: ");
		n=extracted().nextDouble();
		System.out.print("������� ����� ����������: ");
		m=extracted().nextDouble();
		System.out.print("������� ������ ������� ��������� (],) ): ");
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
	 * ���� ����������������� �������� � ��������� ��� �������������� ���������. � �������� ����� ��������� �� ��� ������.
	 * @param inter 
	 */
	public static void checkingValue(Interval inter) {
		double k;
		System.out.println("������� ��������, ��� �������� ��� �������������� � ���������: ");
		k=extracted().nextDouble();
		if(inter.isLeft()==true&&inter.isRight()==true) {
			if(k>inter.getN()&&k<inter.getM()) {
				System.out.println("�������� "+k+" ����������� ��������� "+inter.toString());
			}else System.out.println("�������� "+k+" �� ����������� ��������� "+inter.toString());
		}
		if(inter.isLeft()==false&&inter.isRight()==true) {
			if(k>=inter.getN()&&k<inter.getM()) {
				System.out.println("�������� "+k+" ����������� ��������� "+inter.toString());
			}else System.out.println("�������� "+k+" �� ����������� ��������� "+inter.toString());
		}
		if(inter.isLeft()==false&&inter.isRight()==false) {
			if(k>=inter.getN()&&k<=inter.getM()) {
				System.out.println("�������� "+k+" ����������� ��������� "+inter.toString());
			}else System.out.println("�������� "+k+" �� ����������� ��������� "+inter.toString());
		}
		if(inter.isLeft()==true&&inter.isRight()==false) {
			if(k>inter.getN()&&k<=inter.getM()) {
				System.out.println("�������� "+k+" ����������� ��������� "+inter.toString());
			}else System.out.println("�������� "+k+" �� ����������� ��������� "+inter.toString());
		}
	}
}
