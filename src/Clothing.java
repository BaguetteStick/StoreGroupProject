
public class Clothing extends Item
{
    byte size;
    String type;
    String madeFor;
    
    //default constructor
    public Clothing(){
        super();
        this.size = (byte)0;
        this.type = "n/a";
        this.madeFor = "n/a";
    }
    
    //constructor
    public Clothing(byte s, String t, String m, String n, float p, int q){
        super(n, p, q);
        this.size = s;
        this.type = t;
        this.madeFor = m;
    }
    
    //advanced toString for clothing
    public String toString(){
        //string o hold everything
        String s = "";
        //call superclass toString for basic information
        s += super.toString();
        //add information for electronics
        s += String.format("\nIt is a %s, and is size %s. It was made for %s", 
        this.type, this.size, this.madeFor);
        //return string
        return s;
    }
}
