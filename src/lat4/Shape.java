/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat4;

/**
 *
 * @author Pesek
 */
public class Shape {
    private String color;
    
    public Shape (String color){
        this.color = color;
    }
    @Override 
    public String toString(){
        return "Shape[color=" + color +"]";
    }
    public double getArea(){
        System.err.println("Shape unknown! Cannot compute Area!");
        return 0;
    }
}
