
/*
In the name of Allah, the Gracious, the Merciful
*/

package Task;
/**
 *
 * @author Ibrahim
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer customer = new Customer(123, "Ali Ahmed", 15);
        Account account = new Account(customer.getID(), customer, 1000.0);
        Invoice invoice = new Invoice(customer.getID(), customer, 20.0);
        
        System.out.println(account);
        System.out.println(invoice.getAmount());
        System.out.println();
        
        account.withdraw(700);
        System.out.println(account);
        System.out.println();
        
        account.withdraw(600);
        System.out.println(account);
    }
    
}
