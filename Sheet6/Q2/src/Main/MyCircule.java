/*
In the name of Allah, the Gracious, the Merciful
 */
package Main;

/**
 *
 * @author Ibrahim
 */
public class MyCircule {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;
    
    public MyCircule(){
        
    }
    public MyCircule(int x, int y, int radius){
        center.setX(x);
        center.setY(y);
        this.radius = radius;
    }
    public MyCircule(MyPoint center, int radius){
        this.radius = radius;
        this.center = center;
    }

    /**
     * @return the center
     */
    public MyPoint getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterX(){
        return center.getX();
    }
    
    public void setCenterY(int y){
        center.setY(y);
    }
    public int getCenterY(){
        return center.getY();
    }
    
    public void setCenterXY(int x, int y){
        center.setX(x);
        center.setY(y);
    }
    
    public int[] getCenterXY(){
        return new int[] {center.getX(), center.getY()}; 
    }
    
    public String toString(){
        return String.format("MyCircule[radius = %d, center = %s]",
                this.getRadius(), center);
    }
    
    public double distance(MyPoint another){
        return center.distance(another.getX(), another.getY());
    }
}
