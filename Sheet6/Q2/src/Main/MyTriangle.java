/*
In the name of Allah, the Gracious, the Merciful
 */
package Main;

/**
 *
 * @author Ibrahim
 */
public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;
    
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    
    public MyTriangle(int x1, int y1
            , int x2, int y2, int x3, int y3){
        
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
    }
    
    public String toString(){
        return String.format("MyTriangle[v1=(%d, %d), v2=(%d, %d), v3=(%d, %d)]",
                v1.getX(), v1.getY(), v2.getX(), v2.getY(), v3.getX(), v3.getY());
    }
    
    public double getPerimeter(){
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }
}
