/*
In the name of Allah, the Gracious, the Merciful
 */
package Task;

/**
 *
 * @author Ibrahim
 */
public class Account {
    int ID;
    double balance;
    Customer customer;

    public Account(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.balance = balance;
        this.customer = customer;
    }
    
    public Account(int ID, Customer customer) {
        this.ID = ID;
        this.customer = customer;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public Customer getCustomer(){
        return this.customer;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public String toString(){
        return String.format("%sBlance = %.2f", customer, getBalance());
    }
    
    public String getCustomerName(){
        return this.customer.getName();
    }
    
    public Account deposit(double amount){
        balance += amount;
        return this;
    }
    
    public Account withdraw(double amount){
        if(balance >= amount)
            balance -= amount;
        else
            System.out.println("Amount withdrawn exceeds the current balance!");
        return this;
    }
}
