package chapter6;

public class Rectangle {

    //list the fields of the object Rectangle (global variables)
    private double length;
    private double width;

    //declaring a default constructor
    public Rectangle(){
        length = 0;
        width = 0;
    }

    //declaring a constructor that accepts value to set as the value of the fields
    public Rectangle(double length, double width){
        this.length = length; //This is one way to set the value for a field
        setWidth(width); // This is another way to set value for field. These are only different here to demo alternative options
    }

    //getter method for length
    public double getLength(){
        return length;
    }

    //setter method for length
    public void setLength(double length){
        this.length = length;
    }

    //getter method for width9
    public double getWidth(){
        return width;
    }

    //setter method for width
   public void setWidth(double width){
        this.width = width;
    }
    //List the actions of the object Rectangle (methods)
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;

    }
}
