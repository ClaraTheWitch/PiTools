public class Point 
    {
    /*
     * Author: Clara Siefke
     * Contributors: N/A
     * Last Modified: 01/11/2025
     * Summary: This class provides a constructor and methods 
     *          for objects representing points in a square 
     *          for the MonteCarlo class.
     */
    
    //Instance Variables
    private double xVal; 
    private double yVal;
    private double distToCent;//The point's distance to (0, 0)
    
    /*
     * Initializes objects of class Point
     * @param  x  The x component of the point's coordinate
     * @param  y  The y component of the point's coordinate
     */
    public Point(double x, double y)
        {
        this.xVal = x;
        this.yVal = y;
        this.distToCent = Math.pow((Math.pow(this.xVal, 2.0) + Math.pow(this.yVal, 2.0)), 0.5);
        }
    
    /* 
     * Checks if the point is in the circle
     * @param  radius  the radius of the circle
     * @return  whether the point is in the circle
     */
    public boolean isInCircle(int radius)
        {
        return this.distToCent <= radius;
        }
    
    /*@Override
     * Gives a string representation of the point
     * @return  the point's coordinates as a string "(x,y)"
     */
    public String toString()
        {
        return "(" + this.xVal + "," + this.yVal + ")";
        }
    }
