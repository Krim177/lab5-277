package lab5;

/**

A cash register totals up sales and computes change due.

*/

public class CashRegister{


	private double purchase;
	private double payment;

	//Constructs a cash register with no money in it.
	public CashRegister(){
		purchase = 0;
		payment = 0;

	}

	/**Records the purchase price of an item.
	   @param amount the price of the purchased item
	*/
	
	public void recordPurchase(double amount){
	
	   purchase = purchase + amount;
	
	}
	
	//Processes the payment received from the customer.	
	public void receivePayment(int quantity, Coin coinType){
		payment = payment + (quantity * coinType.getCoinValue());
	
	}
	
	/**Computes the change due and resets the machine for the next customer.
	   @return the change due to the customer
	*/
	
	public double giveChange(){
	   double change = payment - purchase;
	   purchase = 0;
	   payment = 0;
	   return change;
	
	}

}