package chapter2.variantB.month;

import java.util.Scanner;
/**
 * ����� �������� ������.
 * @author �������
 *
 */
public class Month {
	private int number;
	/**
	 * �����������. ������ ����� ����� �����.
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
	 * ����� �� ������� �������� ������.
	 */
	public void searchMonth() {
		switch (getNumber())
		 {
		 case 1: System.out.println("������");
		 break;
		 case 2:System.out.println("�������");
		 break;
		 case 3: System.out.println("����");
		 break;
		 case 4: System.out.println("������");
		 break;
		 case 5: System.out.println("���");
		 break;
		 case 6: System.out.println("����");
		 break;
		 case 7: System.out.println("����");
		 break;
		 case 8: System.out.println("������");
		 break;
		 case 9: System.out.println("��������");
		 break;
		 case 10: System.out.println("�������");
		 break;
		 case 11: System.out.println("������");
		 break;
		 case 12: System.out.println("�������");
		 break;
		 default:System.out.println("��� �� ����� ������, � ���-�� ������!!!!");
		 break;
		 }
	}
	/**
	 * �������� ������ �������������.
	 * @return
	 */
	@SuppressWarnings("resource")
	public static Month enterMonth() {
		   int number; 
		   System.out.println("������� ����� ������: ");
		   number=new Scanner(System.in).nextInt();
		   return new Month(number);
		}
	/**
	 * �������� �����������������.
	 * @param args
	 */
	public static void main(String [] args) {
		Month test=enterMonth();
		test.searchMonth();
	}
}
