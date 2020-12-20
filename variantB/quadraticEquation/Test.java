package chapter2.variantB.quadraticEquation;
/**
 * Проверка работоспособности.
 * @author Евгений
 *
 */
public class Test {
	public static void main(String [] args) {
		QuadraticEquation test= new QuadraticEquation(1,-8,7);
		test.decisionQuadraticEquation();
		QuadraticEquation test2= new QuadraticEquation(0,0,9);
		test2.decisionQuadraticEquation();
		QuadraticEquation test3=new QuadraticEquation(1,2,3);
		test3.decisionQuadraticEquation();
	}
}
