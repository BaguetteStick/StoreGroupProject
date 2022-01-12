
public class Item
{
    //instance variables
    String name;
    float price;
    int quantity;
    
    //default constructor
    public Item(){
        this.name = "n/a";
        this.price = 0.0f;
        this.quantity = 0;
    }
    
    //constructor
    public Item(String n, float p, int q){
        this.name = n;
        this.price = p;
        this.quantity = q;
    }
    
    //toString for output
    public String toString(){
        //String to hold everything
        String s = "";
        s += String.format("%s cost$%.2f, and there is still %s in stock.", this.name, this.price, this.quantity);
        return s;
    }
    
    //restock method to add more of an item
    public void restock(int q){
        this.quantity += q;
    }
    
    //method to check if an item is instock
    public boolean inStock(){
        //if there is 1 or more in stock, return true
        if (this.quantity > 0){
            return true;
        }
        return false;
    }
    
    //method to remove items from stock
    public void remove(int q){
        this.quantity -= q;
    }
    
    //method to change price of an item
    public void changePrice(float f){
        this.price = f;
    }
    
    //method to apply discount to item
    public void discount(float percentage){
        this.price = this.price*(100-percentage)/100;
    }
}
