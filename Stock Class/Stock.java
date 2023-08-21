public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock(String symbol, String name) {
		this.name = name;
		this.symbol = symbol;
		
	}
	
	
	public double getPercentChange(double previousClosingPrice, double currentPrice) {
		if(previousClosingPrice < currentPrice) {
			double result = (currentPrice - previousClosingPrice) * 100 / previousClosingPrice;
			return result;
		} else {
			double res = (previousClosingPrice - currentPrice) * 100 / previousClosingPrice;
			return res;
		}
	}
	
}