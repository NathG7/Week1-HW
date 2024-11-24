package Application;

public class Methods {
	public static void main(String[] args) {
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName ("Sam", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
		
		
	}
	public static String createFullName(String x, String y) {
		//use public static for all of your Methods
		//Then the method of how the return of data will be given is provided above example is String
		//Not all Methods have to return something, if it does not return something it is void
		// Next piece of Method signature is name of the method, used similar like a variable, give method a name that is a verb
		// Then parenthesis, can be blank or have parameters 
		return x + " " + y;
		
	}
}
