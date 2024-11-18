/**
 * 
 */
package Application;

/**
 * 
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {System.out.println("My newest Java Program!");
		// TODO Auto-generated method stub
		//this is one way to comment
		/*
		 * Different types of variables
		 * 
		 * Primitive - number, character, true or false
		 * 8 types 
		 * int - an integer
		 * double - decimal places 32.89235
		 * float - precision decimal data type
		 * long - like an int, numbers can be higher
		 * short - like an in, less number range
		 * byte - 8 bits of data
		 * char - a single character - a B A &
		 * boolean - true or false
		 * 
		 * 
		 * Objects
		 * 
		 * string - is textual data, a string of characters
		 */
	
		//variable declaration - type, identifier, assignment operator, value, semicolon
		int numberOfFriends; 
		int samsAge = 67; 
		double accountBalance = 34.67;
		char middleInitial = 'C';
		boolean isHotOutside = true;
		//String firstName = "Sam";
		System.out.println(samsAge);
		System.out.println(accountBalance);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		//System.out.println(firstName);
		System.out.println("firstName");//this creates a string!
		//System.out.println(); < short cut to get this is type sysout then hold ctr + space
		//camel case naming convention lower case then upper between words
		
		
		//operator performs actions on operands
		// + - * /
		int age = 34 *2;
		System.out.println(age);
		boolean isAge30 = age ==30;
		System.out.println(isAge30);
		System.out.println(age == 68);
		age = age + 1;
		System.out.println(age);
		
		String firstName = "Tommy";
		String lastName = "Smith";
		String fullName = firstName + " " + lastName;//concatenation 
		System.out.println(fullName);
	}

}
