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
public class Circle extends Shape {
    private Point centre;
    private double radius;
    // constructor
    public Circle (double x, double y, double r){
        super("Circle");
        setRadius(r);
        setCenter(x,y);
    }
    public Point getCenter(){
        return centre;
    }
    public void setCenter(double x, double y){
        Point center = new Point(x, y);
        this.centre = center;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    
    public String toString(){
        return "Center: "+ getCenter()+ " Radius: "+getRadius();
    }
    @Override
    public double getArea() {
        return radius * radius*Math.PI;
    }
    
}
