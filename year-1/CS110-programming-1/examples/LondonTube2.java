/*
 * A 2nd version of the London Tube line colour program using a switch.
 * This version has a default clause - meaning that if none of the branches of
 * the if statement are true, then lineColour will be set to "Error" at the end
 * of the if in the final else clause. The default case is like a final 'else'
 * without an if - it catches values that doesn't match any other case.
 * Exercise: try taking out the break statement after "Northern"
 */

public class LondonTube2 {

    public static void main(String[] args) {
        String lineName = "Northern";
        String lineColour;
        
        switch (lineName) {
            case "Bakerloo":
                lineColour = "brown";
                break;
            case "Central":
                lineColour = "orange";
                break;
            case "Circle":
                lineColour = "yellow";
                break;
            case "District":
                lineColour = "green";
                break;
            case "Jubilee":
                lineColour = "grey";
                break;
            case "Metropolitan":
                lineColour = "purple";
                break;
            case "Northern":
                lineColour = "black";
                break;
            case "Picadilly":
                lineColour = "dark blue";
                break;
            case "Victoria":
                lineColour = "light blue";
                break;
			default:
				lineColour = "Error";
				break;
        }
        
        System.out.println("The colour of " + lineName + " is "
                + lineColour);

    }

}
