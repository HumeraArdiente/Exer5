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
public class Square extends Rectangle{
    
    public Square(){}
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side);
        super.Shape(color, filled);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public double getArea(){
        return super.getArea();
    }
    @Override
    public double getPerimeter(){
        return super.getPerimeter();
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    @Override
    public String toString(){
        return "A Square with side = " + super.getWidth() + " which is a subclass of " + super.toString();
    }
}
