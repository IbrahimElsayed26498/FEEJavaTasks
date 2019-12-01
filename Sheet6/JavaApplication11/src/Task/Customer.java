/*
In the name of Allah, the Gracious, the Merciful
 */
package Task;

/**
 *
 * @author Ibrahim
 */
public class Customer {
    int ID;
    String name;
    int discount;
    
    public Customer(int ID, String name, int discount){
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getDiscount(){
        return this.discount;
    }
    
    public void setDiscount(int discount){
        this.discount = discount;
    }
    
    @Override
    public String toString(){
        return String.format("Name : %s\nID   : %s\n", name, ID);
    }
}
