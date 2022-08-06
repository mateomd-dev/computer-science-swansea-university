/*
 * A version of the London Tube line colour program using if statements.
 * This version does *not* have an else - instead, the value of lineColour
 * is set initially to "Error" so that if none of the conditions in the if
 * statement are true, it remains set to "Error".
 * Exercise 1 - try changine the value of lineName to, say, Lemon
 * Exercise 2 - try removing the initial assignment of a value to lineColour but leave
 * in the declaration of the varialbe - then try to compile the code
 */

public class NaiveLondonTube {

	public static void main(String[] args) {
		String lineName = "Central";
        String lineColour = "Error";
        
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
        } 
        
        System.out.println("The colour of " + lineName + " is "
                + lineColour);
	}
}
