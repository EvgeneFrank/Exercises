package chapter2.variantB.interval;
/**
 * ����� ��������.
 * @author �������
 *
 */
public class Interval {
	private boolean left;// true-( false-[
	private double n;
	private double m;
	private boolean right;//true-) false-]
	/**
	 * �����������.
	 * @param left ����� ������:true-( false-[
	 * @param n ������ ��������
	 * @param m ������ ��������
	 * @param right ������ ������:true-) false-]
	 */
	public Interval(boolean left, double n, double m, boolean right) {
		this.setLeft(left);
		this.setN(n);
		this.setM(m);
		this.setRight(right);
	}
	public boolean isLeft() {
		return left;
	}
	public void setLeft(boolean left) {
		this.left = left;
	}
	public double getN() {
		return n;
	}
	public void setN(double n) {
		this.n = n;
	}
	public double getM() {
		return m;
	}
	public void setM(double m) {
		this.m = m;
	}
	public boolean isRight() {
		return right;
	}
	public void setRight(boolean right) {
		this.right = right;
	}
	/**
	 * ��� ����������� ������ ������.
	 * @return
	 */
	private String toStringLeft() {
		if(left==true) return "(";
		else return "[";
		}
	/**
	 * ��� ����������� ����� ������.
	 * @return
	 */
	private String toStringRight() {
		if(right==true) return ")";
		else return "]";
	}
	@Override
	public String toString() {
		return toStringLeft()+n+", "+m+toStringRight();
	}
}
