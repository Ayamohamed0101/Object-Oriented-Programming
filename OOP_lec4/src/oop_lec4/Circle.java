/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_lec4;

public class Circle {
 private float radius;
 public Circle (float r)
 {radius=r;}
    public void setrad(float r)
    {radius=r;}
    public float getrad()
    {return radius;}
     public double area()
    {return (Math.PI* Math.pow(radius, radius));}
    
}
