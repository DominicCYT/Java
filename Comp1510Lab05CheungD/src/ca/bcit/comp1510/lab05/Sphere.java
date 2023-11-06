package ca.bcit.comp1510.lab05;

/**
 * Sphere constructor, setter and getter, surface area, volume and toString.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */

public class Sphere {
    
    /**
     * Sets the parameters to the private instance variables.
     * 
     * xCoordinate a double
     */
    private double xCoordinate;
    
    /**
     * Sets the parameters to the private instance variables.
     * 
     * yCoordinate a double
     */
    private double yCoordinate;

    /**
     * Sets the parameters to the private instance variables.
     * 
     * zCoordinate a double
     */
    private double zCoordinate;
    
    /**
     * Sets the parameters to the private instance variables.
     * 
     * radius a double
     */
    private double radius;
    
    /**
     * constructor for Sphere.
     * 
     * @param x a double
     * @param y a double
     * @param z a double
     * @param r a double
     */
    public Sphere(double x, double y, double z, double r) {

        xCoordinate = x;
        yCoordinate = y;
        zCoordinate = z;
        radius = r;
    }

    /**
     * getter for x.
     * @return the xCoordinate
     */
    public double getxCoordinate() {
        return xCoordinate;
    }

    /**
     * setter for x.
     * @param xcoord the xCoordinate to set
     */
    public void setxCoordinate(double xcoord) {
        xCoordinate = xcoord;
    }

    /**
     * getter for y.
     * @return the yCoordinate
     */
    public double getyCoordinate() {
        return yCoordinate;
    }

    /**
     * setter for y.
     * @param ycoord the yCoordinate to set
     */
    public void setyCoordinate(double ycoord) {
        yCoordinate = ycoord;
    }

    /**
     * getter for z.
     * @return the zCoordinate
     */
    public double getZCoordinate() {
        return zCoordinate;
    }

    /**
     * setter for z.
     * @param zcoord the zCoordinate to set
     */
    public void setZCoordinate(double zcoord) {
        zCoordinate = zcoord;
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
     * Gives the surface area of a sphere.
     * @return sarea as a double.
     */
    public double surfaceArea() {
        final double four = 4.0;
        double sarea = (four) * Math.PI * Math.pow(radius, 2);

        return sarea;
    }
    
    /**
     * Gives the volume of a sphere.
     * @return volume as a double.
     */
    public double volume() {
        final double fourthirds = 4.0 / 3.0;
        final int three = 3;
        double volume = (fourthirds) * Math.PI * Math.pow(radius, three);

        return volume;
    }

    /**
     * Returns a String of sphere info.
     * 
     * @return toString concats the info together
     */
    public String toString() {
        String sphereInfo = "Sphere at: " + "(" + xCoordinate + ", " 
                + yCoordinate + ", " + zCoordinate + ")" 
                + "\n of radius: " + radius;

        return sphereInfo;
    }

}
