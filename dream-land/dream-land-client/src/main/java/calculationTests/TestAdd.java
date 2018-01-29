package calculationTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import training.CalculationServiceRemote;

public class TestAdd {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		CalculationServiceRemote calculationServiceRemote = (CalculationServiceRemote) context
				.lookup("dream-land-ear/dream-land-service/CalculationService!training.CalculationServiceRemote");

		System.out.println(calculationServiceRemote.add(1, 5));
	}
}
