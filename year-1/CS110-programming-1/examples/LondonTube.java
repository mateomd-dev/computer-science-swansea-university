/*
 * A version of the London Tube line colour program using a switch statement.
 * Like the first version using if statements, here the value of lineColour
 * is set initially to "Error" so that if none of the branches of the switch
 * are true, it remains set to "Error".
 * Exercise 1 - try changine the value of lineName to, say, Lemon
 * Exercise 2 - try removing the initial assignment of a value to lineColour but leave
 * in the declaration of the varialbe - then try to compile the code
 */

public class LondonTube {

    public static void main(String[] args) {
        String lineName = "Circle";
        String lineColour = "Error";
        
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
        }
        
        System.out.println("The colour of " + lineName + " is "
                + lineColour);

    }

}
