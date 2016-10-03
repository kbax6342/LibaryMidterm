import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


public class Book {
	
	public static int total = 0;
	private static boolean proceed = true;
	static Scanner input = new Scanner(System.in);
	static String cont;
	public static String x = " ";
	public  String title;
	public String author;
	public static boolean chosenBook;
	
public Book(String t, String a){
		title = t ;
		author = a ;
	}

public String getTitle(){
		return title;
	}

public String getAuthor(){
		return author;
	}
public void remove(ArrayList<Book> books){
	
}



public static ArrayList<Book>  booksArrayList() {
		

		ArrayList<Book> books = new ArrayList<Book>();
	 
		books.add(new Book(" Guilty Pleasers", " Laurell K. Hamilton"));
		books.add(new Book(" Laughing Corpse" , "Laurell K. Hamilton"));
		books.add(new Book(" Circus of the Damned", "Laurell K. Hamilton"));
		books.add(new Book(" The Lunatic Cafe", "Laurell K. Hamilton"));
		books.add(new Book(" Bloody Bones", "Laurell K. Hamilton"));
		books.add(new Book(" The killing Dance", "Laurell K. Hamilton"));
		books.add(new Book(" Enders Game", "Orson Scott Clark"));
		books.add(new Book(" Harry Potter", "JK Rowlins"));
		books.add(new Book(" Minion", "L.A Banks"));
		books.add(new Book(" The Awakening", "L.A Banks"));
		books.add(new Book(" The Hunted", "L.A Banks"));
		books.add(new Book(" The Bitten", "L.A Banks"));
		books.add(new Book(" The Color Purple", "Alice Walker"));
		books.add(new Book(" What was he thinking?", "Leroy Johnson"));
		books.add(new Book(" A day in the life" , "Andre 3000"));
		
		return books;
			
	}

public static void printOutArrayList(){
	
	for(Book book : booksArrayList()){
		
		System.out.println(book.getTitle() + "\t" + book.getAuthor());
		
		}
}
public static void checkOutOfLibrary(String x){
	
for(Book book : booksArrayList()){
	chosenBook = booksArrayList().contains(x);
	
	if(chosenBook == true){
		int chosen = booksArrayList().indexOf(chosenBook);
		booksArrayList().remove(chosen);
		
	}
	
}

	
	System.out.println("Thank you for choosing "+ x);
	
	total++;
	
}

public static String searchForBook(){
while(proceed){	
	System.out.println("Would you like to select a book by the title or the author? (please enter title/author)");
	String bookChoice = input.nextLine();
	
	if(bookChoice.equalsIgnoreCase("title")){
		System.out.println("Please enter a title: ");
		 x = input.nextLine();
		 checkOutOfLibrary(x);
	}else if(bookChoice.equalsIgnoreCase("author")){
		System.out.println("Please enter a author: ");
		 x = input.nextLine();
		 checkOutOfLibrary(x);
	}else{
		//Do nothing
	}
	
	System.out.println("Would you like to check out another book (enter yes/no)");
	cont = input.nextLine();
	
	if(cont.equalsIgnoreCase("yes")){
		System.out.println("Here is an update list of our books: \n"); 
		printOutArrayList();
		proceed = true;
	}else{
		System.out.println("Thank you for using our app!!");
		System.out.println("You check out " + total + " books!!");
		
		Calendar cal = Calendar.getInstance();
		//System.out.println("current date: " + cal.getTime());
		cal.add(Calendar.DATE, 14);
		
		System.out.println("Your books are due back on this date: " + cal.getTime());
		
		proceed = false;
		//System.out.println("Please return the books at this due date: " + );
		System.exit(0);
	}
}
	
	return x;
}




}	
	

