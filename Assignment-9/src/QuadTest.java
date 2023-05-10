/*
(Quadrilateral Inheritance Hierarchy)
Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square. 
Use Quadrilateral as the superclass of the hierarchy. Create and use a Point class to represent the points in each shape. 
Make the hierarchy as deep (i.e., as many levels) as possible. Specify the instance variables and methods for each class. 
The private instance variables of Quadrilateral should be the x-y coordinate pairs for the four endpoints of the Quadrilateral. 
Write a program that instantiates objects of your classes and outputs each object’s area (except Quadrilateral).
 */
public class QuadTest {
    public static void main(String[] args) throws Exception {
        //System.out.printf("%s %s %s %s %s", quad, trapez, parra, rect, square);
        Parallelogram parallelogram = new Parallelogram(0, 0, 0, 5, 6, 5, 6, 0);
        System.out.println("Parallelogram area: " + parallelogram.getArea());

        Rectangle rectangle = new Rectangle(0, 0, 0, 5, 6, 5, 6, 0);
        System.out.println("Rectangle area: " + rectangle.getArea());

        Square square = new Square(0, 0, 0, 5, 5, 5, 5, 0);
        System.out.println("Square area: " + square.getArea());

        Trapezoid trapezoid = new Trapezoid(0, 0, 3, 4, 9, 4, 12, 0);
        System.out.println("Trapezoid area: " + trapezoid.getArea());
    }
    
}
