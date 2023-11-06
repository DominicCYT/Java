package ca.bcit.comp1510.lab05;

/**
 * Cube constructor, setter and getter, surface area, volume, 
 * face diagonal, space diagonal and toString.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Cube {
    
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
     * edge length a double
     */
    private double edgeLength;
    
    /**
     * constructor for Cube.
     * 
     * @param x a double
     * @param y a double
     * @param z a double
     * @param e a double
     */
    public Cube(double x, double y, double z, double e) {

        xCoordinate = x;
        yCoordinate = y;
        zCoordinate = z;
        edgeLength = e;
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
     * getter for edge length.
     * @return the edge
     */
    public double getEdgeLength() {
        return edgeLength;
    }

    /**
     * setter for edge length.
     * @param edge the edge length to set
     */
    public void setEdgeLength(double edge) {
        edgeLength = edge;
    }
    
    /**
     * Gives the surface area of a cube.
     * @return sarea as a double.
     */
    public double surfaceArea() {
        final double six = 6.0;
        double sarea = (six) * Math.pow(edgeLength, 2);

        return sarea;
    }
    
    /**
     * Gives the volume of a cube.
     * @return volume as a double.
     */
    public double volume() {
        final int three = 3;
        double volume = Math.pow(edgeLength, three);

        return volume;
    }
    
    /**
     * Gives the face diagonal of a cube.
     * @return face diagonal as a double.
     */
    public double faceDiagonal() {
        double fdiag = Math.sqrt(2) * edgeLength;

        return fdiag;
    }
    
    /**
     * Gives the face diagonal of a cube.
     * @return face diagonal as a double.
     */
    public double spaceDiagonal() {
        final int three = 3;
        double sdiag = Math.sqrt(three) * edgeLength;

        return sdiag;
    }

    /**
     * Returns a String of cube info.
     * 
     * @return toString concats the info together
     */
    public String toString() {
        String cubeInfo = "Cube at: " + "(" + xCoordinate + ", " 
                + yCoordinate + ", " + zCoordinate + ")" 
                + "\n of edge length: " + edgeLength;

        return cubeInfo;
    }
}
