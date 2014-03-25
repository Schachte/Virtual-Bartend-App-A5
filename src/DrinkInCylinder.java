
public class DrinkInCylinder extends Drink {
	
	private int radius;
	private int height;
	private int dVol;
	private String dId;
	private double dPPU;
	private double totalPrice;
	
	public DrinkInCylinder(String ID, double PPU, int r, int h)
	{
		super(ID, PPU);
		
		radius = r;
		height = h;
		dVol = 0;
		dId = ID;
		dPPU = PPU;
		totalPrice = 0;
	}
	
	public void computeTotalPrice()
	{
		dVol =  (int) Math.PI*(radius * radius * height);
		totalPrice = dVol * dPPU;
	}

	public String toString()
	{
		
		/*
		 * \nThe Drink in a Cylinder\n
			The Radius:\t\t5\n
			The Height:\t\t10\n
			The DrinkId:\t\tsona200\n 
			The Volume:\t\t785\n
			The Unit Price:\t\t0.0022\n 
			The Total Price:\t$1.73\n\n
		 */
		return String.format("\nThe Drink in a Cylinder\nTheRadius:\t\t" + radius + "\nThe Height:\t\t" + height + "\nThe DrinkId:\t\t" + dId + "\nThe Volume:\t\t" + dVol + "\nThe Unit Price:\t\t" + dPPU + "\nThe Total Price:\t" + totalPrice +"\n\n" );
	}
	
	
}
