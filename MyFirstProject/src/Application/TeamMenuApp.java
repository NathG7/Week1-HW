package Application;

import java.util.Scanner;

public class TeamMenuApp {
	public static void main(String[] args) {
		//Add team member
		//view team member
		//view all team members
		//Delete team member by position
		//Delete all team member
		
		String[] team = new String[5];
		Scanner s = new Scanner(System.in);
		int decision = 0;
		
		while(decision != -1) {
			showMenu();
			decision = s.nextInt();
			
			
		}

	}
	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit");
		System.out.println("1) Show Team");
		System.out.println("2) Show Team Member");
		System.out.println("3) Add a Team Member");
		System.out.println("4) Delete Team Member");
		System.out.println("5) Delete All Team Members");
		
	}
}
