/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author hkcha
 */
public class Rectangle extends Shape {
    private double length;
    private double width;
    private Point topleft;
    
    public Rectangle(double x, double y, double length , double width){
        super("Rectangle");
        setLength(length);
        setWidth(width);
        setTopLeft(x,y);
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public Point getTopLeft(){
        return topleft;
    }

    public void setTopLeft(double x, double y){
        Point topleft = new Point(x,y);
        this.topleft = topleft;
    }
    
    public String toString(){
        return "TopLeft: " + getTopLeft()+ " Length: " 
                + getLength() +" Width: "+ getWidth();
    }

    @Override
    public double getArea() {
        return length * width;
    }
    
}
