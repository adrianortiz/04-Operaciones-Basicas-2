/**
 * 
 * @author Adrian
 *
 */
public interface OperacionDao {
	
	/**
	 * Operación suma
	 * @param n1 número 1 tipo double
	 * @param n2 número 2 tipo double
	 * @return La suma de n1 y n2
	 */
	public double doSuma(double n1, double n2);
	
	/**
	 * Operación resta
	 * @param n1 número 1 tipo double
	 * @param n2 número 2 tipo double
	 * @return La Resta de n1 y n2
	 */
	public double doResta(double n1, double n2);
	
	/**
	 * Operación Multiplicación
	 * @param n1 número 1 tipo double
	 * @param n2 número 2 tipo double
	 * @return La Multiplicación de n1 y n2
	 */
	public double doMulti(double n1, double n2);
	
	/**
	 * Operación División
	 * @param n1 número 1 tipo double
	 * @param n2 número 2 tipo double
	 * @return La División de n1 y n2
	 */
	public double doDiv(double n1, double n2);
}
