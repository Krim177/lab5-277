package lab5;

public class Coin {
	
	  //[ 2 points] YOUR CODE to declare the private data members for the class Coin
	private double value; 
	private String name; 
	
	
	   /**
	      Constructs a coin.
	      @param aValue the monetary value of the coin
	      @param aName the name of the coin

	   */
	    //[ 2 points] YOUR CODE
	public Coin (double aValue, String aName) {
		this.value = aValue;
		this.name = aName; 
	}
	
	  /**
	     Gets the coin value.
	     @return the value
	   */

	//[ 2 points]YOUR CODE
	
	public double getCoinValue() {
		return value; 
	}
	 

	   /**
	      Gets the coin name.
	      @return the name
	   */
	//[ 2 points]YOUR CODE
	
	public String getCoinName() {
		return name; 
	}

}
