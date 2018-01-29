package training;

import javax.ejb.Remote;

@Remote
public interface CalculationServiceRemote {
	int add(int a, int b);
}
