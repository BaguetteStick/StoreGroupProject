
import java.util.ArrayList;
import java.util.*;
public class Store {
	//instance variables
	static Scanner sc = new Scanner(System.in);
	String address; 
	String name; 
	ArrayList<Item> itemList;
	Queue customerQueue = new Queue();
	
	public Store() {
		address = "";
		name = "";
	}
	
	public void addItem() {
		String input;
		String name; float price; int quantity; String type;
		System.out.println("What item type would you like to add? \n1. Food   2. Clothing   3. Electronics");
		input = sc.nextLine();
		
		if(input == "1") {
			String expiry;
			System.out.println("Please enter the name of the item.");
			name = sc.nextLine();
			System.out.println("Please enter the price of the item.");
			price = Float.parseFloat(sc.nextLine());
			System.out.println("Please enter the quantity of the item.");
			quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Please enter the type of item.");
			type = sc.nextLine();
			System.out.println("Please enter the expiry of the item.");
			expiry = sc.nextLine();
			itemList.add(new Food(expiry, type, name, price, quantity));
		} else if(input == "2") {
			byte size;
			String madeFor;
			System.out.println("Please enter the name of the item.");
			name = sc.nextLine();
			System.out.println("Please enter the price of the item.");
			price = Float.parseFloat(sc.nextLine());
			System.out.println("Please enter the quantity of the item.");
			quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Please enter the type of item.");
			type = sc.nextLine();
			System.out.println("Please enter the size of the item.");
			size = (byte)Integer.parseInt(sc.nextLine());
			System.out.println("Please enter the type of item.");
			madeFor = sc.nextLine();
			itemList.add(new Clothing(size, type, madeFor, name, price, quantity));
		} else if(input == "3") {
			String warrenty;
			float length;
		    float width;
		    float height;
		    float weight;
			System.out.println("Please enter the name of the item.");
			name = sc.nextLine();
			System.out.println("Please enter the price of the item.");
			price = Float.parseFloat(sc.nextLine());
			System.out.println("Please enter the quantity of the item.");
			quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Please enter the type of item.");
			type = sc.nextLine();
			System.out.println("Please enter the size of the item.");
			warrenty = sc.nextLine();
			System.out.println("Please enter the type of item.");
			length = Float.parseFloat(sc.nextLine());
			System.out.println("Please enter the type of item.");
			width = Float.parseFloat(sc.nextLine());
			System.out.println("Please enter the type of item.");
			height = Float.parseFloat(sc.nextLine());
			System.out.println("Please enter the type of item.");
			weight = Float.parseFloat(sc.nextLine());
			itemList.add(new Electronics(warrenty, type, length, width, height, weight, name, price, quantity));
		} else {
			System.out.println("Enter 1, 2 or 3.");
		}
	}

	public void viewAllCustomers() {
		Queue.printList(customerQueue.first);
	}
	
	public void addCustomer(Customer customer) {
		customerQueue.enqueue(customer);
	}
	
	public void removeCustomer() {
		customerQueue.dequeue();
	}
	
	public static void main(String[] args) {
        Customer c1 = new Customer();
        System.out.println(c1);
        //hello world
        Item i1 = new Item("Apple");
        Item i2 = new Item("Banana");
        Item i3 = new Item("Apple");
        Item i4 = new Item("Banana");
        Item i5 = new Item("Pear");
        
        Order o1 = new Order();
        o1.order.add(i1);
        o1.order.add(i2);
        o1.order.add(i3);
        o1.order.add(i4);
        o1.order.add(i5);
        
        c1.orders.add(o1);
        System.out.println();
        //System.out.println(o1.toStringVersion2());
        System.out.println(c1);
    }

	
}
