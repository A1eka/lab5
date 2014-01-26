
package ru.tarasenko.classes;

import ru.tarasenko.inter.Areable;
import ru.tarasenko.inter.Areable;
import ru.tarasenko.inter.Volumable;
import ru.tarasenko.inter.Volumable;

public abstract class Body implements  Areable, Volumable {
    private String name = "Тело";
    private int id;
    private static int nextId = 1;
    protected double area;
    protected double volume;
    //private double length , width;
     
    {id = nextId++;}
    
    public  int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name=n;
    }
    
    public double getArea(){
        return area;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public abstract double getHig();    

}
