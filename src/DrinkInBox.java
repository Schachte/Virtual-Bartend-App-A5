
public class DrinkInBox extends Drink {
	
	private int height;
	private int width;
	private int depth;
	private double totalPrice;

	
	public DrinkInBox(String ID, double PPU, int dHeight, int dWidth, int dDepth)
	{
		
		super (ID, PPU);
		height = dHeight;
		width = dWidth;
		depth = dDepth;
		unitPrice = PPU;
		totalPrice = 0;
		
	}
	
	public void computeTotalPrice()
	{
		int totalVol = height * width * depth;
		
		double totalPrice = totalVol * unitPrice;
	}
	
	public String toString()
	{
		
		return String.format("");
	}

}
