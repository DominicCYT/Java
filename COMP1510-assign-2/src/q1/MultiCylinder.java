package q1;

/**
 * <p>Instantiates and updates two Cylinder objects (no user input required), 
 * printing their radius and height before and after modification, and prints 
 * the final volume and surface area of each cylinder.</p>
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class MultiCylinder {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments unused.
     */
    public static void main(String[] args) {
        
        // setting variables for the two cylinders A and B
        
        final int radiusA = 3;
        final int heightA = 4;

        final int radiusB = 4;
        final int heightB = 6;
        
        Cylinder cylinderA = new Cylinder(radiusA, heightA);
        Cylinder cylinderB = new Cylinder(radiusB, heightB);
        
        // print before modification radius and height
        System.out.println("Cylinder A before modification:\n" 
                + cylinderA.toString());
        System.out.println("Cylinder B before modification:\n" 
                + cylinderB.toString());

        
        // set modified radius and height for A and B
        final int radiusA2 = 4;
        final int heightA2 = 5;
        
        final int radiusB2 = 3;
        final int heightB2 = 3;
        
        // use setters to change the cylinders
        cylinderA.setRadius(radiusA2);
        cylinderA.setHeight(heightA2);
        
        cylinderB.setRadius(radiusB2);
        cylinderB.setHeight(heightB2);
        
        // print final outputs
        System.out.println("Cylinder A after modification:\n" 
                + cylinderA.toString()
                + "\nSurface Area: " + cylinderA.surfaceArea()
                + "\nVolume: " + cylinderA.volume());
        
        System.out.println("Cylinder B after modification:\n" 
                + cylinderB.toString()
                + "\nSurface Area: " + cylinderB.surfaceArea()
                + "\nVolume: " + cylinderB.volume());
        
        
    }

}
