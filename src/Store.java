
import java.util.ArrayList;
import java.util.*;
public class Store {
	//instance variables
	static Scanner sc = new Scanner(System.in);
	Address address; 
	String name; 
	ArrayList<Item> itemList;
	Queue customerQueue = new Queue();
	float revenue;
	
	public Store() {
		address = new Address();
		name = "";
		itemList = new ArrayList<Item>(99);
		revenue = 0;
	}
	
	public Store(Address address, String name) {
		this.address = address;
		this.name = name;
		itemList = new ArrayList<Item>(99);
		revenue = 0;
	}
	
	public void addItem() {
		int input;
		String name; float price; int quantity; String type;
		System.out.println("What item type would you like to add to the store? \n1. Food   2. Clothing   3. Electronics");
		input = Integer.parseInt(sc.nextLine());

		
		if(input == 1) {
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
		} else if(input == 2) {
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
			System.out.println("Please enter who this is made for.");
			madeFor = sc.nextLine();
			itemList.add(new Clothing(size, type, madeFor, name, price, quantity));
		} else if(input == 3) {
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
			System.out.println("Please enter the warrenty of the item.");
			warrenty = sc.nextLine();
			System.out.println("Please enter the length of item.");
			length = Float.parseFloat(sc.nextLine());
			System.out.println("Please enter the width of item.");
			width = Float.parseFloat(sc.nextLine());
			System.out.println("Please enter the height of item.");
			height = Float.parseFloat(sc.nextLine());
			System.out.println("Please enter the weight of item.");
			weight = Float.parseFloat(sc.nextLine());
			itemList.add(new Electronics(warrenty, type, length, width, height, weight, name, price, quantity));
		} else {
			System.out.println("Enter 1, 2 or 3.");
		}
	}

	public void makePurchase() {
		if(customerQueue.first.cargo.checkOut != null) {
			float orderCost = 0;
			for(int i=0; i<customerQueue.first.cargo.checkOut.order.size(); i++) {
				orderCost += customerQueue.first.cargo.checkOut.order.get(i).price;
			}
			this.revenue += orderCost;
		}
		customerQueue.first.cargo.checkOut = null;
		customerQueue.dequeue();
	}

	
	public void viewAllCustomers() {
		Queue.printList(customerQueue.first);
	}
	
	public void addCustomer(Customer customer) {
		if(customer.checkOut != null) {
			customerQueue.enqueue(customer);
		}
	}
	
	public void removeCustomer() {
		customerQueue.dequeue();
	}
	
	public void info() {
		System.out.println(this.address.toString() + " " + this.name + " \n");
		viewAllCustomers();
	}
	
	public static void main(String[] args) {
        Store testStore = new Store();
        Customer c1 = new Customer();
        //System.out.println(c1);
        

        Item i1 = new Item("Apple",4.45f,2);
        Item i2 = new Item("Banana",2.99f,4);
        Item i5 = new Item("Pear",3.33f,1);

        Order o1 = new Order();
        o1.addItem(i1);
        o1.addItem(i2);
        o1.addItem(i1);
        //o1.addItem(i4);
        o1.addItem(i5);

        // testStore.itemList.add(i2);
        // testStore.itemList.add(i1);

        c1.orders.add(o1);
        System.out.println();
        //System.out.println(o1.toStringVersion2());
        System.out.println(c1);
        
        //String st, String ci, String ps, String pz, String co
        Address a1 = new Address("103 Malvern Dr.","Nepean","ON","K2J 4T2","Canada");
        
        testStore.address = a1;

        testStore.info();
    }
	
}
