/*
In the name of Allah, the Gracious, the Merciful
 */
package Task;

/**
 *
 * @author Ibrahim
 */
public class Invoice {
    int ID;
    Customer customer;
    double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }
    
    public int getID(){
        return ID;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public String getAmount(){
        return String.format("Amount = %.0f.", amount);
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public String getCustomerName(){
        return customer.getName();
    }
    
    public double getAmountAfterDiscount(){
        return amount;
    }
}
