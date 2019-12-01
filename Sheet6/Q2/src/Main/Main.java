/*
In the name of Allah, the Gracious, the Merciful
 */
package Main;

/**
 *
 * @author Ibrahim
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint(0, 0);
        MyPoint myPoint2 = new MyPoint(5, 5);
        MyPoint myPoint3 = new MyPoint(0, 2);
        
        MyCircule myCircule = new MyCircule(myPoint1, 5);
        System.out.println(myCircule);
        
        MyTriangle myTriangle = new MyTriangle(myPoint1, myPoint2, myPoint3);
        System.out.println(myTriangle);
        System.out.println("Perimeter = " + myTriangle.getPerimeter());
        
    }
    
}
