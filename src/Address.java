
public class Address
{
    //instance variables
    String street; //like 123 Something Ln.
    String city;
    String provinceState; //province or state
    String postalZip; //postal code or zip code
    String country;

    //constructors
    public Address() {
        this.street = "STREET";
        this.city = "CITY";
        this.provinceState = "PROVINCE/STATE";
        this.postalZip = "00000";
        this.country = "COUNTRY";
    }

    public Address(String st, String ci, String ps, String pz, String co) {
        this.street = st;
        this.city = ci;
        this.provinceState = ps;
        this.postalZip = pz;
        this.country = co;
    }

    //methods
    public String toString() {
        return (street +"\n"+ city +" "+ provinceState +" "+ postalZip +"\n"+ country);
    }
}
