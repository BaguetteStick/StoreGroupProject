
import java.util.*;
public class Customer
{
    //instance variables
    String name;
    String email;
    float budget;
    ArrayList<Order> orders;
    Address address;
    Order checkOut;
    
    //CONSTRUCTORS
    
    //default
    public Customer() {
        this.name = "UNKNOWN";
        this.email = "UNKNOWN";
        this.budget = 0f;
        this.orders = new ArrayList<Order>();
        this.address = new Address();
        this.checkOut = null;
    }
    //name, budget, checkout order
    public Customer(String n, float b, Order c) {
        this.name = n;
        this.email = "UNKNOWN";
        this.budget = b;
        this.orders = new ArrayList<Order>();
        this.address = new Address();
        this.checkOut = c;
    }
    //name, email, budget
    public Customer(String n, String e, float b) {
        this.name = n;
        this.email = e;
        this.budget = b;
        this.orders = new ArrayList<Order>();
        this.address = new Address();
        this.checkOut = null;
    }
    //name, email, budget, list of orders, address, checkout order
    public Customer(String n, String e, float b, ArrayList<Order> os, Address a, Order o) {
        this.name = n;
        this.email = e;
        this.budget = b;
        this.orders = os;
        this.address = a;
        this.checkOut = o;
    }
    
    //METHODS
    
    public String toString() {
        String s = String.format("$%.2f %s (%s)\nCurrently checking out:\n%s\n",
            this.budget,this.name,this.email,this.checkOut);
        if(orders.size()>0)
            s += "Other orders:\n";
        for(int i=0; i<orders.size(); i++) {
            s += "Order " +i+ "\n" +orders.get(i) +"\n";
        }
        return s;
    }
    //takes the index+1 of the order the customer wishes to checkout (1 would mean order at index 0)
    public void checkOut(int orderNum) {
        //if number given is out of bounds
        if(orderNum > orders.size || orderNum <=0) {
            System.out.println("An order of that number does not exist.");
            return;
        }
        //if you have an order selected for checkout already
        if(checkOut != null) {
            orders.add(checkOut); //adds previously selected order back into order list
            checkOut = orders.get(orderNum-1);
        }
        //setting checkOut order to appropriate order from order list and removing it from the list
        checkOut = orders.get(orderNum-1);
        orders.remove(orderNum-1);
    }
    //boolean canAfford method in progress
}
