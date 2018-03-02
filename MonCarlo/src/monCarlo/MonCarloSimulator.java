package monCarlo;

public class MonCarloSimulator {

	public static void main(String[] args) {
		
		int simulations = 10_000;					//number of simulation tests		
		int numberOfYears = 20;						//money we have at the end of numberOfYears later
		double inflationRate = 3.5;					//inflation rate, in this case supposed fixed
		
		
		//Create object for each investment strategy
		PortfolioType aggressive = new PortfolioType("Aggressive", 100_000, 9.4324, 15.675);
		PortfolioType veryConservative = new PortfolioType("veryConservative", 100_000, 6.189, 6.3438);

		//Create an object of MonCarloUtil class to apply MonteCarlo simulation formula on these investment strategies
		MonCarloUtil worker = new MonCarloUtil();
		
		worker.run( aggressive, simulations, numberOfYears, inflationRate );
		System.out.println();
		worker.run( veryConservative, simulations, numberOfYears, inflationRate );
	}

}
