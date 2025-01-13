public class TestDriver
    {
    /* Author: Clara Siefke
     * Contributors: N/A
     * Last Modified: 01/12/25
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
        // System.out.println("\n**** Point Methods ****");
        // System.out.println("*** Testing toString ***");
        // System.out.println("Creating ten Point objects...");
        // Point point1 = new Point(0,0);
        // Point point2 = new Point(1,1);
        // Point point3 = new Point(5,7);
        // Point point4 = new Point(0.5,0.2);
        // Point point5 = new Point(-0.4, -0.7);
        // Point point6 = new Point(-0.6,0.3);
        // Point point7 = new Point(0,-1);
        // Point point8 = new Point(0.8,0.8);
        // Point point9 = new Point(-0.2,-0.2);
        // Point point10 = new Point(0.05,-0.004);
        // System.out.println("Point objects created.");
        // System.out.println("point1 (should be (0.0,0.0)): " + point1.toString());
        // System.out.println("point2 (should be (1.0,1.0)): " + point2.toString());
        // System.out.println("point3 (should be (5.0,7.0)): " + point3.toString());
        // System.out.println("point4 (should be (0.5,0.2)): " + point4.toString());
        // System.out.println("point5 (should be (-0.4,-0.7)): " + point5.toString());
        // System.out.println("point6 (should be (-0.6,0.3)): " + point6.toString());
        // System.out.println("point7 (should be (0.0,-1.0)): " + point7.toString());
        // System.out.println("point8 (should be (0.8,0.8)): " + point8.toString());
        // System.out.println("point9 (should be (-0.2,-0.2)): " + point9.toString());
        // System.out.println("point10 (should be (0.05,-0.004)): " + point10.toString());
        // System.out.println("*** Testing isInCircle ***");
        // System.out.println("Suppose the circle has radius 1.");
        // System.out.println("point1 is in the circle (should be true): " + point1.isInCircle(1));
        // System.out.println("point2 is in the circle (should be false): " + point2.isInCircle(1));
        // System.out.println("point3 is in the circle (should be false): " + point3.isInCircle(1));
        // System.out.println("point4 is in the circle (should be true): " + point4.isInCircle(1));
        // System.out.println("point5 is in the circle (should be true): " + point5.isInCircle(1));
        // System.out.println("point6 is in the circle (should be true): " + point6.isInCircle(1));
        // System.out.println("point7 is in the circle (should be true): " + point7.isInCircle(1));
        // System.out.println("point8 is in the circle (should be false): " + point8.isInCircle(1));
        // System.out.println("point9 is in the circle (should be true): " + point9.isInCircle(1));
        // System.out.println("point10 is in the circle (should be true): " + point10.isInCircle(1));

        //MONTECARLO METHODS
        // System.out.println("**** MonteCarlo Methods ****");
        // System.out.println("*** Testing generatePoints ***");
        // System.out.println("Initializing MonteCarlo object (10 points, radius 1)...");
        // MonteCarlo mcSim = new MonteCarlo(10,1);
        // System.out.println("Object initialized.");
        // System.out.println("Generating a list of 10 Point objects within a 2 X 2 square...");
        // Point[] points = mcSim.generatePoints(10, 1); //Temporarily made public before testing
        // System.out.println("List generated.");
        // System.out.println("List contents: ");
        // for(int i = 0; i < points.length; i++)
        //     {
        //     System.out.println(points[i].toString());
        //     }
        // System.out.println("List size (should be 10): " + points.length);
        // System.out.println("*** Testing countInCircle ***");
        // System.out.println("Emptying List..."); //Will hold Point objects from section POINT METHODS
        // points = new Point[10];
        // System.out.println("List emptied.");
        // System.out.println("Assigning premade Point objects to list...");
        // points[0] = point1;
        // points[1] = point2;
        // points[2] = point3;
        // points[3] = point4;
        // points[4] = point5;
        // points[5] = point6;
        // points[6] = point7;
        // points[7] = point8;
        // points[8] = point9;
        // points[9] = point10;
        // System.out.println("Point objects assigned.");
        // System.out.println("Number of points in the circle of radius 1 (should be 7): " + mcSim.countInCircle(points, 1));//Temporarily made public for testing
        // System.out.println("*** Testing area and pi***");
        // System.out.println("Changing MonteCarlo object to generate 10,000,000 points with circle radius 1...");
        // mcSim = new MonteCarlo(10000000, 1);
        // System.out.println("Object changed.");
        // System.out.println("Approximating pi 10 times:");
        // for(int i = 0; i < 10; i++)
        //     {
        //     System.out.println(mcSim.pi());
        //     }
        }
    }