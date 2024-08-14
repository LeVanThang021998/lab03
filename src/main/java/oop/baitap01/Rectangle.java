/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap01;

/**
 *
 * @author ADMIN
 */
public class Rectangle {
    //Khai bao thuoc tinh (data)
    private double length;
    private double width;
    //Dinh nghia cac phuong thuc constructor
    public Rectangle(){
        length =1.0;
        width =1.0;       
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //Phuong thuc setter & getter
    public double getlength(){
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth () {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    //Phuong thuc xu ly tinh toan
    public double findArea(){
        double area = length*width;
        return area;
    }
       public double findPerimeter(){
        double result = (length+width)*2;
        return result;
    }
       @Override
       public String toString(){
           return "Dai: " +length + " - rong: "+ width + "- dien tich: " + findArea() + " - chu vi: " + findPerimeter();
       }
}
