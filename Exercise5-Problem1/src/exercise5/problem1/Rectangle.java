/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise5.problem1;

/**
 *
 * @author ardientehu_cis21035
 */
public class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(){}
    public Rectangle(double width, double length){
         this.width = width;
         this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super.Shape(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2*(length + width);
    }
    @Override
    public String toString(){
        return "A Rectangle with width = " + width + " and length = " + length + " which is a subclass of " + super.toString();
    }
}
