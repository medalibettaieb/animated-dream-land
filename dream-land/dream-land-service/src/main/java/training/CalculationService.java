package training;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalculationService
 */
@Stateless
public class CalculationService implements CalculationServiceRemote, CalculationServiceLocal {

	/**
	 * Default constructor.
	 */
	public CalculationService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

}
