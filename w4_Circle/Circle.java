package w4_Circle;

/*4. A class called Circle contains:
● Two private instance variables: radius (of type double) and color (of type String), with
default value of 1.0 and “red”, respectively.
● Two overloaded constructors;
● Two public methods: getRadius() and getArea().
Write a class which models the class Circle. Write a class TestCircle which tests Circle class.*/

public class Circle {

    private double radius = 1.0;
    private String colour = "red";

    public Circle() {
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return this.getColour() + " circle with radius of " + this.getRadius() + " cm";
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColour() {
        return this.colour;
    }
}
