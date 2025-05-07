/**
 * Importing the Array class for using Array.copyof()
 */

import java.util.Arrays;

/**
 * Definition of the vector class
 */
public class Vektor {

    /**
     * private variable to store the vector components
     */
    private final double[] koordinaten;

    /**
     * Constructor that creates a vector with the specifies components
     *
     * @param x represent the x-coordinate of the vector
     * @param y represent the y-coordinate of the vector
     * @param z represent the z-coordinate of the vector
     */
    public Vektor(double x, double y, double z) {
        this.koordinaten = new double[]{x, y, z};
    }

    /**
     * static method to create a null vector
     *
     * @return the null vector with
     */
    public static Vektor nullVektor() {
        return new Vektor(0, 0, 0);
    }

    /**
     * Method for adding two vectors
     *
     * @param other is an other vector to be added to the current vector
     * @return a new Vector resulting from the addition of the current vector with
     * another vector
     */
    public Vektor add(Vektor other) {
        double[] result = new double[3];
        for (int i = 0; i < 3; i++) {
            result[i] = this.koordinaten[i] + other.koordinaten[i];
        }
        return new Vektor(result[0], result[1], result[2]);
    }

    /**
     * Method for subtracting two vectors
     *
     * @param other is an other vector to be subtracted from the current vector
     * @return Returns a new Vector resulting from the subtraction of another vector
     * from the current vector.
     */
    public Vektor subtract(Vektor other) {
        double[] result = new double[3];
        for (int i = 0; i < 3; i++) {
            result[i] = this.koordinaten[i] - other.koordinaten[i];
        }
        return new Vektor(result[0], result[1], result[2]);
    }

    /**
     * Method for getting X-component
     *
     * @return Returns the X-component of the vector, respectively.
     */
    public double getX() {
        return koordinaten[0];
    }

    /**
     * Method for getting Y-component
     *
     * @return Returns the Y-component of the vector, respectively.
     */
    public double getY() {
        return koordinaten[1];
    }

    /**
     * Method for getting Z-component
     *
     * @return Returns the Z-component of the vector, respectively.
     */
    public double getZ() {
        return koordinaten[2];
    }

    /**
     * Method for getting all components as an array
     *
     * @return an array containing the X-, Y-, and Z-components of the vector.
     */
    public double[] toArray() {
        return Arrays.copyOf(koordinaten, 3);
    }

    /**
     * Method for scalar multiplication for the vector by a scalar
     *
     * @param skalar is a scalar value by which the current vector is multiplied
     * @return a new Vector resulting from the scalar multiplication of the current
     * vector with a scalar value.
     */
    public Vektor skalareMultiplikation(double skalar) {
        double[] result = new double[3];
        for (int i = 0; i < 3; i++) {
            result[i] = this.koordinaten[i] * skalar;
        }
        return new Vektor(result[0], result[1], result[2]);
    }

    /**
     * Method for calculating the dot product (Skalarprodukt) of two vectors
     *
     * @param other is an other vector with which the dot product is calculated
     * @return the dot product of the current vector with another vector.
     */
    public double skalarProdukt(Vektor other) {
        double result = 0;
        for (int i = 0; i < 3; i++) {
            result += this.koordinaten[i] * other.koordinaten[i];
        }
        return result;
    }

    /**
     * Method for calculating the cross product of two vectors
     *
     * @param other is an other vector with which the cross product is calculated
     * @return the cross product of the current vector with another vector.
     */
    public Vektor kreuzProdukt(Vektor other) {
        double newX = this.koordinaten[1] * other.koordinaten[2] - this.koordinaten[2] * other.koordinaten[1];
        double newY = this.koordinaten[2] * other.koordinaten[0] - this.koordinaten[0] * other.koordinaten[2];
        double newZ = this.koordinaten[0] * other.koordinaten[1] - this.koordinaten[1] * other.koordinaten[0];
        return new Vektor(newX, newY, newZ);
    }

    /**
     * Method for calculating the length of the vector (magnitude = Betrag)
     *
     * @return the square root of the sum of the squares of the vector's components,
     * which represents the length or magnitude of the vector.
     */
    public double berechneVektorLaenge() {
        double result = 0;
        for (double component : koordinaten) {
            result += component * component;
        }
        return Math.sqrt(result);
    }

    /**
     * Method for checking if two vector are parallel
     *
     * @param other is another vector used to check if the two vectors are parallel
     * @return true if the current vector and another vector are parallel, otherwise
     * false.
     */
    public boolean parallelitaetUberpruefen(Vektor other) {
        return this.kreuzProdukt(other).berechneVektorLaenge() == 0;
    }

    /**
     * Method for calculating the angle between two vectors
     *
     * @param other is another vector used to calculate the angle between two vector
     * @return the angle between the current vector and another vector in radiant.
     */
    public double winkelBerechnen(Vektor other) {
        double dotProdukt = this.skalarProdukt(other);
        double einheitsProdukt = this.berechneVektorLaenge() * other.berechneVektorLaenge();
        return Math.acos(dotProdukt / einheitsProdukt);
    }

    /**
     * overriden equals Method to check the equality of two vectors
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vektor)) {
            return false;
        }
        Vektor other = (Vektor) obj;
        return Arrays.equals(this.koordinaten, other.koordinaten);
    }

    /**
     * Overriden toString method to represent the vector as a String
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (double koordinate : koordinaten) {
            builder.append("(").append(koordinate).append(")\n");
        }
        return builder.toString();
    }

}
