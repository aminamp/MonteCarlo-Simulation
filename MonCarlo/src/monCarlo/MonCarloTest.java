package monCarlo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonCarloTest {

	@Test
	void test() {
		int simulations = 10_000;					//number of simulation tests		
		int numberOfYears = 20;						//money we have at the end of numberOfYears later
		double inflationRate = 3.5;					//inflation rate, in this case supposed fixed
		
		
		//create a test case with 0 initial investment money => should return 0
		PortfolioType testPortfolio = new PortfolioType("test", 0, 7.8, 15.5);
		MonCarloUtil worker = new MonCarloUtil();
		worker.run( testPortfolio, simulations, numberOfYears, inflationRate );
		
	}

}
