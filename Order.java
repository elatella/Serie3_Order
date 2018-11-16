 
/* ************************************************************************* *\
*                Programmierung 1 HS 2018 - Serie 3-2                         * 
\* ************************************************************************* */
 
import java.util.*;
import java.text.*;

public class Order
{
    // instance variables - replace the example below with your own
   
    public String customerName;
    public String customerAddress;
    public int totalPrice;

    public static int orderId = 0;
    /**
     * Constructor for objects of class Order
     */
    public Order(){
        orderId++;
        
        System.out.println ("Order id: " +orderId +", Customer: " +customerName +", " +customerAddress);
        System.out.println (books);
        System.out.println ("Total price: " + toString () );
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public ArrayList<Book> books = new ArrayList<Book>();

    //public int Book.getId()
    //    {return id;}
    
    
    public void addBook(Book b){
        Book b1, b2, b3, b4, b5; //switch 
        Book [] books = new Book [5];
        
        book.getId();
        
        
        switch(id){
        case 1:
        books.add(b1);
        break;
        
        case 2:
        books.add(b2);
        break;
        
        case 3:
        books.add(b3);
        break;
        
        case 4:
        books.add(b4);
        break;
        
        case 5:
        books.add (b5);
        break;
        
        default:
        break;
        
        }
    
        /* if (this.books.size() >= 5)
        {
            System.out.println("Too many books, read the ones you have first.");
            return;
        } 
        else
        {   
            this.books.append(b);
        }*/
    }
    
    public void setCustomerName (String s){
        this.customerName = s;
    }
    
    public void setCustomerAddress (String a){
        this.customerAddress = a;
    }
    
    public int getTotalPrice(){
        this.totalPrice = 0;
        book.getPrice();
        for (int i = 0; i < this.books.size(); i++)
        {
            
            this.totalPrice += this.books.get(i).price;
        }    
    }
    
    //adds currency to totalPrice
    public String toString (){
        NumberFormat cur =  NumberFormat.getCurrencyInstance();
        return (cur.format(totalPrice));   
    }
 
}
