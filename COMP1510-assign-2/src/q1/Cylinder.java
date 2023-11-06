package q1;

/**
 * Cylinder constructor, setter and getter, surface area, volume, 
 * and toString.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Cylinder {
    
    /**
     * Private instance variable for radius.
     * 
     * radius a double
     */
    private double radius;
    
    /**
     * Private instance variable for height.
     * 
     * radius a double
     */
    private double height;
    
    /**
     * constructor for Cylinder.
     * 
     * @param r a double
     * @param h a double
     */
    public Cylinder(double r, double h) {
        radius = r;
        height = h;
        
    }
    
    /**
     * getter for height.
     * @return the height
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * setter for height.
     * @param h the height to set
     */
    public void setHeight(double h) {
        height = h;
    }
    
    /**
     * getter for radius.
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * setter for radius.
     * @param r the radius to set
     */
    public void setRadius(double r) {
        radius = r;
    }
    
    /**
     * Gives the surface area of a cylinder.
     * @return sarea as a double.
     */
    public double surfaceArea() {
        double sarea = 2 * Math.PI * radius * (radius + height);
        return sarea;
    }
    
    /**
     * Gives the volume of a cylinder.
     * @return volume as a double.
     */
    public double volume() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }
    
    /**
     * Returns a String of cylinder info.
     * 
     * @return toString concats the info together
     */
    public String toString() {
        String cylinderInfo = "Cylinder radius: " + (radius) 
                + "\nCylinder height: " + (height);

        return cylinderInfo;
    }
}
