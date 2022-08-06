
import java.util.*;
import java.text.*;

/* This is class representing basic information about a person. It stores their name
 * and their date of birth. Name is just an ordinarly string but date of birth is a
 * Java Date object.
 */
class Person {
	private String personName;
	private Date dateOfBirth;
	//private BankAccount bankAccount;
	
	//This object will be needed to convert dates between different formats.
	private DateFormat dateFormat;
	
	/*This is the constructor that is called whenever we create a person object.
	 *It sets their name and date of birth; it also creates an object that allows us
	 *to enter dates in a particular format.
	 */
	public Person(String name, String dob){
		//This creates a date formatting object that will accept dates as strings
		//of the form year-month-day
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		//We call the two local methods setName and setDob to set the name and
		//date of birth. These methods are defined below
		setName(name);
		setDob(dob);
	}
	
	//Method to return the person's name
	public String getName(){
		return personName;
	}
	
	//Method to set the person's name.
	public void setName(String name){
		personName = name;
	}
	
	//Method to output their date of birth as a string
	public String getDob(){
	    //The toString method of the Date class turns the internal format of a Date
	    //which is essentially the number of mSec since 1970 into a string.
		return dateOfBirth.toString();
	}
	
	//Method to set the date of birth
	public void setDob(String dob){
	   /* This is a bit tricky and uses some Java we have not done in the lectures.
	    * Because this could go wrong if we enter a date in the wrong format - it must
	    * be in the format year-month-day with four digits for year, one or two for month and
	    * one or two for day - then we could end up with an error or *exception*. Java
	    * requires us to handle exceptions. We do this by putting the code that might cause
	    * the exeption in a 'try' clause.
	    */
		try {
			dateOfBirth = (Date)dateFormat.parse(dob);
		}
		/* Now we have the code to *catch* and handle the exception. This code gets run *only*
		 * if something goes wrong. In this case the 'something' is that the format of the
		 * date is wrong and the date formatter cannot interpret or *parse* it. So the error
		 * is a *ParseException*. Note we don't just make these names up - they are defined i
		 * the Java library (and you can write your own if you want). In this case we are just
		 * going to print an error message and a *stack trace* - that is, a list of all the
		 * methods that were being called when the error occured. To see what happens, run the
		 * program and enter a date in the wrong format.
		 */
		catch (ParseException p) {
			System.out.println("Date in the wrong format");
			p.printStackTrace();
		}
		
	}
	
	//Method to calculate the age from the current date and date of birth.
	public int getAge(){
		//We need to know what the current Date is.
		// An 'empty' Date object defaults to the current time
		Date now = new Date();
		
		//The format of a date is a *long integer* - that is an integer that can hold larger
		//than normal numbers. It's called 'long'. So we calculate the number of mSec between
		//now (now.getTime()) and the date of birth (dateOfBirth.getTime()).
		long diff = now.getTime() - dateOfBirth.getTime();
		
		//Next we define a constant representing the number of milliseconds in a year. It's
		//final because we don't need to change it; it's a long because it has to be the same
		//type as diff above; and the 'L' is to force the compiler to make it the right type.
		//If you don't put the 'L' on at least one of the numbers, the compiler will assume
		//the type is 'int' ant it will complain when you try to assign it to a long.
		final long M_SEC = 365*24*60*60*1000L;
		
		//Return age in years.
		return (int)(diff / M_SEC);
	}
}