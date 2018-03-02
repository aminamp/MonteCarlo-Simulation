package monCarlo;


/**
 * 
 * @author Amin
 *
 * PortfolioType will keep track of information about each type of strategy, i.e. Aggressive, Conservative, ... 
 * each object of this class will represent one strategy
 */

public class PortfolioType {
	
	private String strategy;						//name of Portfolio Type: Aggressive, Very Conservative, ...
	private double initialMoney;					//initial money that someone plan to invest
	private double returnMean;					//expected(average) rate of profit
	private double riskSD;						//rate of risk(standard deviation)
	
	private double outputMedian;					//calculated output Median 20th Year
	private double output10PrcBestCase;			//calculate output 10% Best Case 20th Year
	private double output10PrcWorseCase;			//calculate output 10% Worse Case 20th Year
	

	//Class constructor
	public PortfolioType(String strategy, double initialMoney, double returnMean, double riskSD) {
		this.strategy = strategy;
		this.initialMoney = initialMoney;
		this.returnMean = returnMean;
		this.riskSD = riskSD;
		
	}
	
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}
	
	public void setInitialMoney(double initialMoney) {
		this.initialMoney = initialMoney;
	}
	
	public void setReturnMean(double returnMean) {
		this.returnMean = returnMean;
	}
	
	public void setRiskSD(double riskSD) {
		this.riskSD = riskSD;
	}
	
	public double getInitialMoney() {
		return initialMoney;
	}
	
	public double getRiskSD() {
		return riskSD;
	}
	
	public String getStrategy() {
		return strategy;
	}
	
	public double getReturnMean() {
		return returnMean;
	}
	
	public double getOutputMedian() {
		return outputMedian;
	}
	
	public double getOutput10PrcBestCase() {
		return output10PrcBestCase;
	}
	
	public double getOutput10PrcWorseCase() {
		return output10PrcWorseCase;
	}
	
}
