package chapter2.variantB.interval;
/**
 * �������� ����� ����� ����������.
 * @author �������
 *
 */
public class Runner {
	public static void main(String []args) {
		Interval test=Operations.newUserInterval();
		System.out.println(test.toString());
		Operations.checkingValue(test);
	}
}
