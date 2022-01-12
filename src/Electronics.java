
public class Electronics extends Item
{
    //instance variable
    String warranty;
    String type;
    float length;
    float width;
    float height;
    float weight;
    
    //default constructor
    public Electronics(){
        super();
        this.warranty = "n/a";
        this.type = "n/a";
        this.length = 0.0f;
        this.width = 0.0f;
        this.height = 0.0f;
        this.weight = 0.0f;
    }
    
    //constructor
    public Electronics(String wa, String t, float l, float w, float h, float we, String n, float p, int q){
        super(n, p, q);
        this.warranty = wa;
        this.type = t;
        this.length = l;
        this.width = w;
        this.height = h;
        this.weight = we;
    }
    
    //advanced toString for electronics
    public String toString(){
        //string o hold everything
        String s = "";
        //call superclass toString for basic information
        s += super.toString();
        //add information for electronics
        s += String.format("\nIt is a %s, and has warranty of %s. It has dimensions %sx%sx%s cm, and weighs %s lbs.", 
        this.type, this.length, this.width, this.height, this.weight);
        //return string
        return s;
    }
}
