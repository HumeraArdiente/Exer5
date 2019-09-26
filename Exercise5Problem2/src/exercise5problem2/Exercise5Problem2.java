/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise5problem2;

/**
 *
 * @author ardientehu_cis21035
 */
public class Exercise5Problem2 {
    
    public static void main(String[] args) {
        
        System.out.println("Circle : \n");
        Circle circle = new Circle(2.0);
        System.out.printf("Area = %.02f\n", circle.getArea());
        System.out.printf("Perimeter = %.02f\n", circle.getPerimeter());
        
        System.out.println("Radius = " + circle.getRadius());
        System.out.println(circle.toString());
        
        System.out.println("\nRectangle : \n");
        Rectangle rectangle = new Rectangle(3.0, 2.0);
        
        rectangle.setColor("red");
        System.out.println("Length = " + rectangle.getLength() + " and Width = " + rectangle.getWidth());
        System.out.printf("Area = %.02f\n", rectangle.getArea());
        System.out.printf("Perimeter = %.02f\n", rectangle.getPerimeter());
        System.out.println(rectangle.toString());
        
        System.out.println("\nSquare : \n");
        Square square = new Square(4.0);
        
        square.setColor("blue");
        System.out.println("Side = " + square.getSide());
        System.out.printf("Area = %.02f\n", square.getArea());
        System.out.printf("Perimeter = %.02f\n", square.getPerimeter());
        System.out.println(square.toString());
        
    }
    
}
