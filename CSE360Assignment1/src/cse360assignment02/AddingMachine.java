package cse360assignment02;

public class AddingMachine {
	  private int total;
	  private String theString;
	  
	  /*
	   * Default Constructor --> total = 0
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    theString = "0";
	  }
	  
	  /* getTotal --> gets the private value
	   * @return total --> 0
	   */
	  
	  public int getTotal () {
	    return this.total;
	  }
	  
	  /* 
	   * add --> increments total by parameter
	   *  @param int value --> what the total is incremented by
	   *  @return void
	   */
	  
	  public void add (int value) {
		  this.total = total + value;
		  theString += " + " + value;
	  }
	  
	  
	  /* 
	   * subtract --> decrements total by parameter
	   *  @param int value --> what the total is decremented by
	   *  @return void
	   */
	  public void subtract (int value) {
		  this.total = total - value;
		  theString += " - " + value;
	  }
	  
	  
	  /*
	   * toString --> writes out the total of the object
	   * @return String that has the total value
	   */
	 public String toString () {
	    return theString;
	  }
	  
	  
	 /*
	  * clears total
	  * @return void
	  */
	public void clear() {
		this.total = 0;
		this.theString = "0";
	  }
	
	public static void main(String args[])
	{
		AddingMachine testMachine = new AddingMachine();
		
		testMachine.add(4);
		testMachine.subtract(2);
		testMachine.add(8);
		System.out.print(testMachine.toString());
		System.out.println(" = " + testMachine.getTotal());
		System.out.println("\nNOW CLEAR TESTMACHINE");
		testMachine.clear();
		System.out.println(testMachine.toString());

		
	}

}