
/**
 * This program is to add,multiply and divide 2 numbers
 * and division of any two numbers 
 * @author manasa
 *
 */
public class Calculator {

	/**
	 * finds addition of two numbers
	 * @param a
	 * @param b 
	 * @return int addition of two numbers
	 */
	public int Add(int a , int b) {
		return a+b;
	}
	/**
	 * finds multiplication of two numbers
	 * @param x 
	 * @param y
	 * @return int multiplication of two numbers
	 */
	public int Multiply(int a , int b) {
		return a*b;
	}
	/**
	 * finds division of two numbers
	 * @param x
	 * @param y
	 * @return double a divides b
	 */
	public double Division(int a, int b) {
		if(b==0)
			throw new ArithmeticException("Nuumber cant be divided by 0");
		else
			return a/(double)b;
	}
}
