
public class Food extends Item
{
    //instance variables
    String expiryDate;
    String type;
    
    //default constructor
    public Food(){
        super();
        this.expiryDate = "n/a";
        this.type = "n/a";
    }
    
    //cosntructor
    public Food(String e, String t, String n, float p, int q){
        super(n, p, q);
        this.expiryDate = e;
        this.type = t;
    }
    
    //advanced toString specific for food
    public String toString(){
        //string o hold everything
        String s = "";
        //call superclass toString for basic information
        s += super.toString();
        //add information for foods
        s += String.format("\nIt is a %s product, and expires on %s", this.type, this.expiryDate);
        //return string
        return s;
    }
}
