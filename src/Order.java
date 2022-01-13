import java.util.ArrayList;
import java.util.Scanner;
/**
 * Class that handles a persons order
 * Constructors runs and creates an arraylist for the persons order
 * Person can add and remove items from their order, along with display what is currently available using the toString
 *
 * Graham Gee
 * Version 5
 */
public class Order
{
    //Instance variables and arraylist for items in the order
    String orderID;
    float total;
    //Arraylist for the order
    ArrayList<Item> order;
    //The copy is a checker for the output, incase there is multiple of one item
    ArrayList<Item> copy;
    
    //Default constructor that will begin the ordering process
    public Order() {
    
        //Put this here so the word null does not appear in the orderID
        this.orderID = "";
        
        //Creates an order ID, just a bunch of random number
        for(int i = 0; i < 9; i++) {
        
            int num = (int)Math.ceil(Math.random() * 9);
            this.orderID += num;
       
        }
        
        //Create the arraylist for the order
        this.order = new ArrayList<Item>();
        this.copy = new ArrayList<Item>();
        
        //Prompts user with the creation of the new order + order id
        System.out.println("A new order has been created\nYour order ID is: " + this.orderID + "\n");
        
    }
    
    //Adds an item to the arraylist
    public void addItem(Item item) {
    
        //Adds item to the list
        this.order.add(item);
        
        //Add to the total
        this.total += item.price;
        
        //Prompt the user
        System.out.println("You added " + item.name + " to your order.\n the total is now $" + this.total);
    
    }
    
    //Removes an item from the arraylist
    public void removeItem() {
    
        //Prompt the user
        System.out.println("\nWhich item would you like to remove?");
        
        //Get the input from the user
        int itemNum = 0;
        Scanner input = new Scanner(System.in);
        boolean catcher = false;
        
        //Catcher for if they don't put in a number
        do{
            try{
            
                //Prompt the user for the item to remove
                itemNum = input.nextInt();
            
            } catch(Exception e) {
            
                //Prompt the user
                System.out.println("\nPlease input the number of the item you wish to remove.");
            
            }
        }while(catcher == false);
        
        //Re-use catcher for next loop
        catcher = false;
        
        //Try catch for if they input an index that is not in the arraylist
        do{
            try {
                
                //Take the item out of the array
                this.order.remove(itemNum - 1);
                
                //Subtract price from the total
                this.total -= order.get(itemNum - 1).price;
                
                //If it doesn't crash this will change and exit the loop successfully
                catcher = true;
                
            } catch(Exception e) {
            
                //Prompt the user
                System.out.println("This item is not in the arraylist");
                catcher = false;
                
            }
        } while(catcher == false);
    }
    
    //Method to group multiple of same item for toString
    public String stringAdd(Item item, int index) {
    
        //String to hold the message that will be given to the toString
        String message = "";
        //Variable for holding the total price of all of each item
        float cost = 0f;
        //Int for amount of the item
        int amount = 0;
        
        //Check the arraylist to see if it's already been added, if it has then return
        for(int i = index; i < this.order.size(); i++) {
        
            if(item.equals(copy.get(i))) {
            
                return "";
            
            }
        }
        
        //Add the item to the copy list if the item has yet to have been added
        this.copy.add(item);
            
        //Loop through array to find each instance of the item
        for(int i = index; i < this.order.size(); i++) {
        
            //If the item is the same, add it to the amount
            if(group(item, i) == true) {
            
                //Add to the total amount
                amount++;
                //Add it's cost
                cost = cost + item.price;
            }
        }
        
        //Put together the message
        message = "\nItem #" + (index+1) + " - " + item.name + " | Amount - " + amount + " | Cost - $" + cost;
            
        //Return the message
        return message;
    
    }
    
    //Checker to see if the item is the same as the index
    public boolean group(Item item, int index) {
    
        if(order.get(index).equals(item)) {
        
            return true;
        
        } else {
            
            return false;
            
        }
    }
    
    //toString that will display all the current items in the order
    public String toString() {
    
        //Clear the copy so that if toString is called twice, it doesn't mess up
        copy.clear();
        
        //Create a message string for the output
        String message = "Order #" + this.orderID;
        
        for(int i = 0; i < order.size(); i++) {
        
            message = message + stringAdd(order.get(i), i);
        
        }
        
        //Add the total
        message = message + "\n\nYour total is: $" + this.total;
        
        //Return the completed message
        return message;
    
    }
}
