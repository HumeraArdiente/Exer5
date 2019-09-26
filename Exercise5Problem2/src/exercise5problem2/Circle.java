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
public class Circle extends Shape{
    protected double radius;
    
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public double getPerimeter(){
        return 2*(Math.PI * radius);
    }
    @Override
    public String toString(){
        return "A Circle with radius = " + radius + " which is a subclass of " + super.toString();
    }
}
