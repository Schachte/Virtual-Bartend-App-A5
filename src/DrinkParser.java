
public class DrinkParser {
	
	private static String drinkType;
	private static String ID;
	private static String unitPrice;
	private static String radius;
	private static String height;
	private static String depth;
	private static String width;
	

	public DrinkParser()
	{
		drinkType = null;
		ID = null;
		unitPrice = null;
		radius = null;
		height = null;
		depth = null;
		width = null;
	}
	
	
	public static Drink parseStringToDrink(String lineToParse)
	{
		/*
		 * 	For a cylinder drink,
			shape/drinkId/unitPrice/radius/height

			For a box drink,
			shape/drinkId/unitPrice/height/width/depth
		 *
		 */

		String parsableData = lineToParse; //Stores the parameter into a usable string
		
		String userData[] = parsableData.split("/"); //Splits all the user data into multiple parts using / delimiter
		
		drinkType = userData[0];
		
		if (drinkType.charAt(0) == 'c' || drinkType.charAt(0) == 'C') //Code to parse for the cylinder drink
		{
			ID = userData[1];
			unitPrice = userData[2];
			double newUnitPrice = Double.parseDouble(unitPrice);
			radius = userData[3];
			int newRadius = Integer.parseInt(radius);
			height = userData[4];
			int newHeight = Integer.parseInt(height);
			
			
			DrinkInCylinder CylinderDrink = new DrinkInCylinder(ID, newUnitPrice, newRadius, newHeight);
			
			
		}
		
		else if (drinkType.charAt(0) == 'b' || drinkType.charAt(0) == 'B') //Code to parse for the box drink
		{
			ID = userData[1];
			unitPrice = userData[2];
			int newUnitPrice = Integer.parseInt(unitPrice);
			height = userData[3];
			int newHeight = Integer.parseInt(height);
			width = userData[4];
			int newWidth = Integer.parseInt(width);
			depth = userData[5];
			int newDepth = Integer.parseInt(depth);
			
			DrinkInBox BoxDrink = new DrinkInBox(ID, newUnitPrice, newHeight, newWidth, newDepth);
			
		}
		

		
		return null;
		
		
		
	}

}
