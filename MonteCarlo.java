//Import Modules
import java.util.Random;

public class MonteCarlo
    {
    /* 
     * Author: Clara Siefke
     * Contributors: N/A
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
    private int radius;

    //Other Variables and Objects
    private Point[] points;//Temporarily holds randomly generated points
    private Random randGen = new Random();//Random number generator
    private int randNum;//Temporarily holds a random integer
    private int count;//Temporarily holds the count something

    /*
     * Initializes objects of class MonteCarlo
     * @param  n  the number of points to be generated in the square
     * @param  r  the radius of the circle
     */
    public MonteCarlo(int n, int r)
        {
        this.numPoints = n; //Holds number of points in square
        this.radius = r; //Holds the radius of the circle
        }
    
    /*
     * Give an approximation of the area of the circle
     * @param  numP  the number of points in the square
     * @param  rad  the radius of the circle
     * @return  the area of the circle
     */
    public double area(int numP, int rad)
        {
        return (countInCircle(generatePoints(numP, rad), rad) / numP) * Math.pow(rad, 2);
        }
    
    /*
     * Counts the number of points in the circle
     * @param  pList  the list of all points
     * @param  rad  the radius of the circle
     */
    private int countInCircle(Point[] pList, int rad)
        {
        count = 0;
        for(int i = 0; i < pList.length; i++)
            {
            if(pList[i].isInCircle(rad))
                {
                count++;
                }
            }
        return count;
        }
    
    /*
     * Generates a list of points within the square.
     * @param  numP  the number of points to generate
     * @param  halfLen  half the length of the square
     * @return  an array of Point objects within the square
     */
    private Point[] generatePoints(int numP, int halfLen)
        {
        points = new Point[numP];
        for(int i = 0; i < numP; i++)
            {
            randNum = randGen.nextInt(4);
            if(randNum == 0)//Point is in first quadrant
                {
                points[i] = new Point(randGen.nextDouble() * halfLen, randGen.nextDouble() * halfLen);
                }
            else if(randNum == 1)//Point is in second quadrant
                {
                points[i] = new Point(randGen.nextDouble() * halfLen, randGen.nextDouble() * halfLen * -1);
                }
            else if(randNum == 2)//Point is in third quadrant
                {
                points[i] = new Point(randGen.nextDouble() * halfLen * -1, randGen.nextDouble() * halfLen * -1);
                }
            else
                {
                points[i] = new Point(randGen.nextDouble() * halfLen * -1, randGen.nextDouble() * halfLen);
                }
            }
        return points;
        }
    }
