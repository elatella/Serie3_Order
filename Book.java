/* ************************************************************************* *\
*                Programmierung 1 HS 2018 - Serie 3-2                         * 
\* ************************************************************************* */
import java.util.Date;
import java.util.Scanner;
import java.text.*;
import java.util.Calendar;
import java.lang.Math.*;

public class Book
{
	private int id;
	private String title;
	private String author;
	private Date dateOfPublication;
	private int price;

	public static final String DATE_FORMAT = "dd.MM.yyyy";
	//--- constructors ---
	
        // TODO: Insert your code here!

	public Book(int id, String title, String author, Date dateOfPublication, int price)
	{
		this.id = id;
		this.title = title;
		this.author = author;
		this.dateOfPublication = dateOfPublication;
		this.price=price;
	}

	/** Returns the age of the book in days since publication */
	public int age()
	{
		// TODO: Insert your code here!
		//we could use Date with new Date() to get time right now 

		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
                //Date publication = cal.getTime(this.dateOfPublication);
		long days = (today.getTime() - dateOfPublication.getTime())/86400000;	
		int ageDays = Math.toIntExact(days);

		return ageDays;
	}

	/** Returns a String representation of the book */
	public String toString()
	{
		// TODO: Insert your code here!
		// TODO: Insert your code here!
		
		String newDate = dateToString (this.dateOfPublication);

		return "Book ["+ this.id + this.title + this.author +newDate +this.price +"]"; 
	}

	/** Reads all book data from user input */
	public void input() 
	{
		Scanner scn = new Scanner( System.in );
		System.out.print( "Please enter id: " );
		this.id = scn.nextInt();

		System.out.println("Please enter title: ");
		this.title = scn.nextLine();

		System.out.println("Please enter author: ");
                this.author = scn.nextLine();

		System.out.println("Please enter date of Publication (dd.mm.yyyy): ");
                String stringDateOfPublication;
		stringDateOfPublication = scn.nextLine();
		this.dateOfPublication = stringToDate (stringDateOfPublication);

		System.out.print("Please enter price: ");
		this.price=scn.nextInt();

		// TODO: Insert your code here!

	}

	//--- Get-/Set-methods ---

	// TODO: Insert your code here!

        public void setId(int id)
        {this.id = id;}
        public int getId()
        {return id;}

        public void setTitle(String title)
        {this.title = title;}
        public String getTitle()
        {return title;}

        public void setAuthor(String author)
        {this.author = author;}
	public String getAuthor()
        {return author;}

        public void setDateOfPublication(Date dateOfPublication)
        {this.dateOfPublication = dateOfPublication;}
	public Date getDateOfPublication()
        {return dateOfPublication;}

        public void setPrice(int price)
        {this.price = price;
	if (this.price <= 0)
	this.price = 0;}
        public int getPrice()
        {return price;}	


	//--- helper methods -- DO NOT CHANGE ------------------------------------
	/** Converts the Date object d into a String object */
	public static String dateToString( Date d )
	{
		SimpleDateFormat fmt = new SimpleDateFormat( DATE_FORMAT );
		return fmt.format( d );
	}

	/** Converts the String object s into a Date object */
	public static Date stringToDate( String s ) 
	{
		Date r = null;
		try {
			SimpleDateFormat fmt = new SimpleDateFormat( DATE_FORMAT );
			r = fmt.parse( s );
		} catch ( ParseException e ){
			System.err.println( e );
			System.exit(1);
		}
		return r;
	}
}
