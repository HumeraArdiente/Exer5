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
public class Shape {
    private String color = "transparent";
    private boolean filled = false;
    
    public void Shape(){}
    public void Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
        setFilled(true);
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    @Override
    public String toString(){
        String string;
        if(isFilled() == true){
            string = "filled";
        }else{
            string = "not filled";
        }
        return "a Shape with color of " + color + " and is " + string;
    }
}
