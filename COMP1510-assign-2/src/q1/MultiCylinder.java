package q1;

/**
 * <p>Instantiates and updates two Cylinder objects (no user input required), 
 * printing their radius and height before and after modification, and prints 
 * the final volume and surface area of each cylinder.</p>
 *
 * @author Dominic Cheung
 * @version 1.0
 */
public class MultiCylinder {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments unused.
     */
    public static void main(String[] args) {

        Cylinder cylinderA = new Cylinder(1, 2);
        Cylinder cylinderB = new Cylinder(2, 1);
        
        //print before modification radius and height
        System.out.println("Cylinder A before modification:\n" 
                + cylinderA.toString());
        System.out.println("Cylinder B before modification:\n" 
                + cylinderB.toString());

        //use setters to change the cylinders
        cylinderA.setRadius(2);
        cylinderA.setHeight(1);
        
        cylinderB.setRadius(1);
        cylinderB.setHeight(2);
        
        //print final outputs
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
