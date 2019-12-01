/*
In the name of Allah, the Gracious, the Merciful
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Ibrahim
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = input.nextInt();
        
        String row = "";
        for (int i = 1; i <= rows; i++) {
            if(i %2 != 0){
                row = "1" + row;
            }
            else{
                row = "0" + row;
            }
            System.out.println(row);
        }
    }

}

