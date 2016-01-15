/**
 * 
 * @author Adrian
 *
 */
public class OperacionDaoImp implements OperacionDao {

	/**
	 * Constructor base
	 */
	public OperacionDaoImp(){}
	
	@Override
	public double doSuma(double n1, double n2) {
		return n1 + n2;
	}

	@Override
	public double doResta(double n1, double n2) {
		return n1 - n2;
	}

	@Override
	public double doMulti(double n1, double n2) {
		return n1 * n2;
	}

	@Override
	public double doDiv(double n1, double n2) {
		return n1 / n2;
	}

}
