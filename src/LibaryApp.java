import java.util.Scanner;


public class LibaryApp {

	public static void main(String[] args) {
		String option = " ";
		String returnOption;
		String x = "";

		
	Scanner input = new Scanner(System.in);
		//Welcome user to the app 
		System.out.println("Welcome to the Library App");
		//Ask the user whether would like to return or check out a book
		System.out.println("Would you like to return book or check out a book? (return/check out)");
		option = input.nextLine();
		//check to see if user input equals return
		if(option.equalsIgnoreCase("return")){
			
			System.out.println("Thank you for returning you book!");
			
			System.out.println("Would you like to check out another book? (enter y/n)");
			//saving user input if they want to check out another book
			returnOption = input.nextLine();
			//checking to see if the user input equals y
			if(returnOption.equalsIgnoreCase("y")){
				Book.printOutArrayList();
				Book.searchForBook();
			}
			
			}else if(option.equalsIgnoreCase("check out")){
			//Method to print out list of books	
			Book.printOutArrayList();
			Book.searchForBook();
			}else{
				System.exit(0);
			}

	}

}


