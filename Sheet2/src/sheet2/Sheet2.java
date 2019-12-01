/*
In the name of Allah, the Gracious, the Merciful
 */
package sheet2;

import java.util.Scanner;

/**
 *
 * @author Ibrahim
 */
public class Sheet2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // input data
        System.out.print("Input Input a month number : ");
        short monthNumber = input.nextShort();
        System.out.print("Input a year: ");
        int year = input.nextInt();
        
        short numberOfDaysInMonth;
        String monthName;
        
        switch(monthNumber){
            case 1 : 
                monthName= "January";
                numberOfDaysInMonth = 31;
                break;
            
            case 2 : 
                /*
                Rules:
                Every fourth year is a leap year.
                However, every hundredth year is not a leap year.
                Every four hundred years, there's a leap year after all.
                */
                monthName= "February";
                numberOfDaysInMonth = 
                   (short) (((year%4 == 0) 
                          || (year%400 == 0) 
                          || (year%100 != 0)) 
                            ? (29) : (28));
                break;
            
            case 3 : 
                monthName= "March";
                numberOfDaysInMonth = 31;
                break;
            
            case 4 : 
                monthName= "April";
                numberOfDaysInMonth = 30;
                break;
            
            case 5 : 
                monthName= "May";
                numberOfDaysInMonth = 31;
                break;
            
            case 6 : 
                monthName= "June";
                numberOfDaysInMonth = 30;
                break;
            
            case 7 : 
                monthName= "July";
                numberOfDaysInMonth = 31;
                break;
            
            case 8 : 
                monthName= "August";
                numberOfDaysInMonth = 31;
                break;
            
            case 9 : 
                monthName= "September";
                numberOfDaysInMonth = 30;
                break;
            
            case 10 : 
                monthName= "October";
                numberOfDaysInMonth = 31;
                break;
            
            case 11 : 
                monthName= "November";
                numberOfDaysInMonth = 30;
                break;
            
            case 12 : 
                monthName= "December";
                numberOfDaysInMonth = 31;
                break;
            default:
                numberOfDaysInMonth = 0;
                monthName = "Unknown";
        }
        System.out.println(monthName + " " 
                + year + " has " + numberOfDaysInMonth + " days");
    }
    
}
