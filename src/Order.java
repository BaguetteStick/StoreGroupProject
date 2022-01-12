import java.util.ArrayList;
/**
 * Class that handles all of the orders of the store
 * Add more to header later
 *
 * Graham Gee
 * Version 1
 */
public class Order
{
    String orderID;
    ArrayList<Item> order;
    
    //Default constructor that will begin the ordering process
    public Order() {
    
        for(int i = 0; i < 9; i++) {
        
            int num = (int)Math.ceil(Math.random() * 9);
            this.orderID = this.orderID + num;
        
        }
        
        System.out.println("A new order has been created\nYour order ID is: " + this.orderID);
        
    }
    
    public void addItem() {
    
        
    
    }
    
    public void removeItem() {
    
        
    
    }
    
    //Test main
    public static void main(String[] args) {
    
        
    
    }
    
    //toString that will display all the current items in the order
    public String toString() {
    
        String message = "";
        
        return message;
    
    }
}
