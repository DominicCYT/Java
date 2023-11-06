package ca.bcit.comp1510.lab05;

/**
 * Cone constructor, setter and getter, surface area, volume, 
 * slant height and toString.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Cone {

    /**
     * Sets the parameters to the private instance variables.
     * 
     * height a double
     */
    private double height;
    
    /**
     * Sets the parameters to the private instance variables.
     * 
     * radius a double
     */
    private double radius;
    
    /**
     * constructor for Cone.
     * 
     * @param h a double
     * @param r a double
     */
    public Cone(double h, double r) {

        height = h;
        radius = r;
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
     * @param hei the height to set
     */
    public void setHeight(double hei) {
        height = hei;
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
     * @param rad the radius to set
     */
    public void setRadius(double rad) {
        radius = rad;
    }
    
    /**
     * Gives the volume of a cone.
     * @return volume as a double.
     */
    public double volume() {
        final double onethird = 1.0 / 3.0;
        double volume = (onethird) * Math.PI * Math.pow(radius, 2) * height;

        return volume;
    }
    
    /**
     * Gives the slant height of a cone.
     * @return slant as a double.
     */
    public double slantHeight() {
        double radiussq = Math.pow(radius, 2);
        double heightsq = Math.pow(height, 2);
        double sum = radiussq + heightsq;
        double slant = Math.sqrt(sum);

        return slant;
    }
    
    /**
     * Gives the surface area of a cone.
     * @return sarea as a double.
     */
    public double surfaceArea() {
        double radiussq = Math.pow(radius, 2);
        double heightsq = Math.pow(height, 2);
        double sum = radiussq + heightsq;
        double sqrtsum = Math.sqrt(sum);
        
        double leftside = Math.PI * Math.pow(radius, 2);
        double rightside = Math.PI * radius * sqrtsum;
        
        double sarea = (leftside + rightside);

        return sarea;
    }
    
    /**
     * Returns a String of cone info.
     * 
     * @return toString concats the info together
     */
    public String toString() {
        String coneInfo = "Cone of radius: " + radius 
                + "\n and height of: " + (height);

        return coneInfo;
    }
}
