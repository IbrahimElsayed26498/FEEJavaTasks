/*
In the name of Allah, the Gracious, the Merciful
 */

package sheet4test;
import java.util.Scanner;

public class Sheet4Test {
    public static void main(String[] args) {
        System.out.println("1. Password must have at least 8 chars" + 
                "\n2. Password contains only letters and digit\n"
              + "3. Password must contains at least 2 digits");
        
        System.out.print("\nInput a password : ");
        String password = new Scanner(System.in).nextLine();
        System.out.println("Password is " + 
                (validPassword(password) ? "" : "not ") +
                "valid");
    }
    
    public static boolean validPassword(String password){
        password = password.toUpperCase();
        int NumberOfDigits = 0;
        boolean containsLetters = false;
        char ch;
        
        // check if the password at least 8 length.
        if(password.length() < 8)
            return false;
        
        for(int i = 0; i < password.length(); i++){
            ch = password.charAt(i);
            
            // check if the ch is a number
            if(ch >= '0' && ch <= '9')
                NumberOfDigits++;
            
            // check if the ch is a letter
            else if(ch >= 'A' && ch <= 'Z')
                containsLetters = true;
            
            else
                return false;
            
        }
        
        if(NumberOfDigits > 1 && containsLetters == true)
            return true;
        
        return false;
    }
}