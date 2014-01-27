
package ru.tarasenko.classes;

import ru.tarasenko.inter.Areable;
import ru.tarasenko.inter.Areable;
import ru.tarasenko.inter.Volumable;
import ru.tarasenko.inter.Volumable;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Body implements  Areable, Volumable {
    private String name = "Тело";
    private int id;
    private static int nextId = 1;
    protected double area;
    protected double volume;
    private Date time;
    //private double length , width;
     
    {
      id = nextId++;
      this.time = new Date(System.currentTimeMillis());
    }
    
    
    /**
     * 
     * @return 20.11.2013 18:11:85 :)
     */
    public String getTime() {

        return new SimpleDateFormat("dd.MM.YYYY HH:mm:ss").format(time);
    }
    
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
