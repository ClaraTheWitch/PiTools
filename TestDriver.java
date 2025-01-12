public class TestDriver
    {
    /* Author: Clara Siefke
     * Contributors: N/A
     * Last Modified: 01/09/25
     * Summary: This class is used to test methods from 
     *          other classes. For each method, it will 
     *          print what is being tested, print what the 
     *          expected results are, and print the actual 
     *          results.
    */
    public static void main(String[] args)
        {
        //BEGIN TESTS
        System.out.println("\n***** PAT METHOD TESTS *****");

        //POINT METHODS
        System.out.println("\n**** Point Methods ****");
        System.out.println("*** Testing toString ***");
        System.out.println("Creating ten Point objects...");
        Point point1 = new Point(0,0);
        Point point2 = new Point(1,1);
        Point point3 = new Point(5,7);
        Point point4 = new Point(0.5,0.2);
        Point point5 = new Point(-0.4, -0.7);
        Point point6 = new Point(-0.6,0.3);
        Point point7 = new Point(0,-1);
        Point point8 = new Point(0.8,0.8);
        Point point9 = new Point(-0.2,-0.2);
        Point point10 = new Point(0.05,-0.004);
        System.out.println("Point objects created.");
        System.out.println("point1 (should be (0.0,0.0)): " + point1.toString());
        System.out.println("point2 (should be (1.0,1.0)): " + point2.toString());
        System.out.println("point3 (should be (5.0,7.0)): " + point3.toString());
        System.out.println("point4 (should be (0.5,0.2)): " + point4.toString());
        System.out.println("point5 (should be (-0.4,-0.7)): " + point5.toString());
        System.out.println("point6 (should be (-0.6,0.3)): " + point6.toString());
        System.out.println("point7 (should be (0.0,-1.0)): " + point7.toString());
        System.out.println("point8 (should be (0.8,0.8)): " + point8.toString());
        System.out.println("point9 (should be (-0.2,-0.2)): " + point9.toString());
        System.out.println("point10 (should be (0.05,-0.004)): " + point10.toString());
        }
    }