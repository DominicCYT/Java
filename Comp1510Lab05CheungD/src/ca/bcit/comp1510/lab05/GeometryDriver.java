package ca.bcit.comp1510.lab05;

import java.text.DecimalFormat;
import java.util.Scanner;
//import java.text.NumberFormat;

/**
 * Program that drives.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class GeometryDriver {
    
    /**
     * Driver program creates shapes.
     * @param args unused
     */
    public static void main(String[] args) {
        // create scanner for user input
        Scanner scan = new Scanner(System.in);
        
        // create new DecimalFormat
        DecimalFormat threedec = new DecimalFormat("0.000");
        
        //challenge using NumberFormat
        //NumberFormat threedec = NumberFormat.getInstance();
        //threedec.setMaximumFractionDigits(3);
        
        //prompt user for sphere inputs
        System.out.println("Please enter x coordinate: ");
        double x1 = scan.nextDouble();
        System.out.println("Please enter y coordinate: ");
        double y1 = scan.nextDouble();
        System.out.println("Please enter z coordinate: ");
        double z1 = scan.nextDouble();
        System.out.println("Please enter radius value: ");
        double r1 = scan.nextDouble();
        
        //create new Sphere object
        Sphere sphereA = new Sphere(x1, y1, z1, r1);
        
        System.out.println("Given the inputs, a Sphere will have: "
                + "\nSurface Area: " + threedec.format(sphereA.surfaceArea()) 
                + "\nVolume: " + threedec.format(sphereA.volume()));
        
        //prompt user for cube inputs
        System.out.println("Please enter x coordinate: ");
        double x2 = scan.nextDouble();
        System.out.println("Please enter y coordinate: ");
        double y2 = scan.nextDouble();
        System.out.println("Please enter z coordinate: ");
        double z2 = scan.nextDouble();
        System.out.println("Please enter edge length: ");
        double e = scan.nextDouble();
        
        //create new Cube object
        Cube cubeA = new Cube(x2, y2, z2, e);
        
        System.out.println("Given the inputs, a Cube will have: "
                + "\nSurface Area: " + threedec.format(cubeA.surfaceArea()) 
                + "\nVolume: " + threedec.format(cubeA.volume())
                + "\nFace Diagonal: " + threedec.format(cubeA.faceDiagonal())
                + "\nSpace Diagonal: " 
                + threedec.format(cubeA.spaceDiagonal()));
        
        //prompt user for cone inputs
        System.out.println("Please enter height value: ");
        double h = scan.nextDouble();
        System.out.println("Please enter radius value: ");
        double r2 = scan.nextDouble();
        
        //create new Cone object
        Cone coneA = new Cone(h, r2);
        
        System.out.println("Given the inputs, a Cone will have: "
                + "\nSurface Area: " + threedec.format(coneA.surfaceArea()) 
                + "\nVolume: " + threedec.format(coneA.volume())
                + "\nSlant Height: " + threedec.format(coneA.slantHeight()));
        
        
        scan.close();

    }

}
