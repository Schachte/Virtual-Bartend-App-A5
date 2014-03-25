
public abstract class Drink {
	
	protected int volume;
	protected double unitPrice;
	protected double totalPrice;
	protected String drinkID;
	
	public Drink(String ID, double PPU) //ID = the unique drinkID where PPU = price per unit
	{
		drinkID = ID; //Reassigning the DrinkID to the value of ID parameter
		unitPrice = PPU; //Reassigning the unit price to value of the PPU parameter
	}
	
	public String getDrinkID() //Returns the value of the drink ID that was passed through the parameter
	{
		
		return drinkID;
	}
	
	public abstract void computeTotalPrice();
	
	public String toString()
	{
		return String.format("");
	}
	

}
