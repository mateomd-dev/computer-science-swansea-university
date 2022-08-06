/*
 * A 2nd version of the London Tube line colour program using if statements.
 * This version *does* have an else - meaning that if none of the branches of
 * the if statement are true, then lineColour will be set to "Error" at the end
 * of the if in the final else clause
 */

public class NaiveLondonTube2 {

	public static void main(String[] args) {
		String lineName = "Central";
        String lineColour;
        
        if (lineName.equals("Bakerloo")) {
            lineColour = "brown";
        } else if (lineName.equals("Central")) {
            lineColour = "orange";
        } else if (lineName.equals("Circle")) {
            lineColour = "yellow";
    	} else if (lineName.equals("District")) {
            lineColour = "green";
       	} else if (lineName.equals("Jubilee")) {
            lineColour = "grey";
       	} else if (lineName.equals("Metropolitan")) {
            lineColour = "purple";
      	} else if (lineName.equals("Northern")) {
            lineColour = "black";
      	} else if (lineName.equals( "Picadilly")) {
            lineColour = "dark blue";
      	} else if (lineName.equals("Victoria")) {
            lineColour = "light blue";
        } else {
			lineColour = "Error";
		}
        
        System.out.println("The colour of " + lineName + " is "
                + lineColour);
	}
}
