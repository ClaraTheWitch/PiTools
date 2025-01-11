public class MonteCarlo
    {
    /* 
     * Author: Clara Siefke
     * Collaborators: N/A
     * Last Modified: 01/11/2025
     * Summary: The Monte Carlo Method of estimating pi 
     *          works by randomly generating points within 
     *          a square with a circle inscribed. It then 
     *          gathers all the points within the circle, 
     *          divides that by the total number of points, 
     *          and then multiplies the quotient by the 
     *          area of the square. This product will be 
     *          approximately the area of the circle. Since 
     *          the formula for the area of a circle is 
     *          area = pi * radius ^ 2, one can divide the 
     *          area by the radius squared and get pi (or 
     *          an approximation in our case).
     * Sources:
     * “Estimating the Value of Pi Using Monte Carlo.” 
     *      GeeksforGeeks, GeeksforGeeks, 28 July 2022, 
     *      www.geeksforgeeks.org/estimating-value-pi-using
     *      -monte-carlo/#. 
    */

    //Instance Variables
    private int numPoints;

    /*
     * Initializes objects of class MonteCarlo
     * @param  n  the number of points to be generated in the square
     */
    public MonteCarlo(int n)
        {
        this.numPoints = n; //Holds number of points in square
        }
    }
