package training;

import javax.ejb.Local;

@Local
public interface CalculationServiceLocal {
	int add(int a, int b);
}
