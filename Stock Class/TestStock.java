/*********************************************************************************
* (The Stock class) Following the example of the Circle class in Section 9.2,    *
* design a class named Stock that contains:                                      *
*                                                                                *
* ■ A string data field named symbol for the stock’s symbol.                     *
* ■ A string data field named name for the stock’s name.                         *
* ■ A double data field named previousClosingPrice that stores the stock         *
*   price for the previous day.                                                  *
* ■ A double data field named currentPrice that stores the stock price for the   *
*   current time.                                                                *
* ■ A constructor that creates a stock with the specified symbol and name.       *
* ■ A method named getChangePercent() that returns the percentage changed from   *
*   previousClosingPrice to currentPrice.                                        *
*                                                                                *
* Draw the UML diagram for the class and then implement the class. Write a test  *
* program that creates a Stock object with the stock symbol ORCL, the name       *
* Oracle Corporation, and the previous closing price of 34.5. Set a new current  *
* price to 34.35 and display the price-change percentage.                        *
*********************************************************************************/

public class TestStock {
    public static void main(String[] args) {
		Stock s1 = new Stock("ORCL","Oracle Corporation");
		s1.previousClosingPrice = 37.5;
		s1.currentPrice = 34.35;
		
		System.out.println("Stock Symbol: "+s1.symbol);
		System.out.println("Stock Name: "+s1.name);
		System.out.printf("Price Change percentage: %.2f", s1.getPercentChange(s1.previousClosingPrice, s1.currentPrice));
	}
}
