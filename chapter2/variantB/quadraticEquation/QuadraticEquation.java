package chapter2.variantB.quadraticEquation;
/**
 * Класс описание квадратного уравнения a*x^2+b*x+c=0
 * @author Евгений
 *
 */
public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	/**
	 * Конструктор.
	 * @param a
	 * @param b
	 * @param c
	 */
	public QuadraticEquation(double a,double b, double c) {
		this.setA(a);
		this.setB(b);
		this.setC(c);
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return  a+"x^2+"+b+"x+"+c+"=0";
	}
	/**
	 * Дискриминант
	 * @return
	 */
	public double discriminant() {
		return getB()*getB()-4*getA()*getC();
	}
	/**
	 * Вывод на консоль решений.
	 * @param abc
	 */
	public void decisionQuadraticEquation() {
		double x1,x2;
		if(discriminant()>0) {
			x1=(-getB()+Math.sqrt(discriminant()))/(2*getA());
			x2=(-getB()-Math.sqrt(discriminant()))/(2*getA());
			System.out.println(toString()+"\nx1="+x1+"\nx2="+x2);
		}
		if(discriminant()==0) {
			x1=(-getB())/(2*getA());
			System.out.println(toString()+"\nx="+x1);
		}
		if(discriminant()<0) {
			System.out.println("Корней на  множестве действительных чисел нет.");
		}
	}
}
