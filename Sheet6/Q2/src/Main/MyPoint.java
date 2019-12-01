/*
In the name of Allah, the Gracious, the Merciful
 */
package Main;

/**
 *
 * @author Ibrahim
 */
public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }
    
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int[] getXY(){
        return new int [] {getX(), getY()};
    }
    
    @Override
    public String toString(){
        return String.format("(%d, %d)", getX(), getY());
    }
    
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
    
    public double distance(MyPoint another){
        return distance(another.getX(), another.getY());
    }
    
    public double distance(){
        return distance(0, 0);
    }
}
