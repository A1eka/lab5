
package ru.tarasenko.classes;

import ru.tarasenko.classes.Body;


public class Cylinder extends Body {
    private double rad; // радиус
    private double diag; // диагональ
    private double area_Body_rot; // площадь тела вращения, прямоуг. который образует цилиндр 
    private double hight; // высота
    
    public Cylinder(double hight, double rad, double dia){ // первый конструктор
        this.hight = hight;
        this.setName("Цилиндр");
        this.rad = rad;
        this.diag = dia;
        this.area_Body_rot = area_Body_rot;
        this.area = 2*Math.PI*rad*(rad+hight);
        this.volume = Math.PI*rad*rad*hight;
    }
    /**
     * возвращает значение радиуса
     * @return rad
     */
    public double getRad(){
        return rad;
    }
    /**
     * возвращает значение длины диагонали
     * @return diag
     */
    public double getDiag(){
        return diag=Math.sqrt(this.getHig()*this.getHig())+Math.sqrt(rad*rad);
    }
    /**
     * возвращает площадь тела вращения, прямоугольника, который образует цилиндр
     * @return area_Body_rot
     */
    public double getArea_Body(){
        return area_Body_rot = this.getHig()*rad;
    }
    
    
    
    //изменение площади, 
    //задаем величину на которую изменилось ребро.
    @Override
    public void Area(double dx) {
        this.hight+=dx;
        this.rad+=dx;
        this.area = 2*Math.PI*rad*(rad+hight);     
   }
    
    //изменение объема в заданное число раз
    @Override
    public void Volum (double n) {
        this.volume=Math.PI*rad*rad*hight*n;
        this.hight = hight*Math.pow(n, 1/3);
        this.rad = rad*Math.pow(n, 1/3);      
   }
    
    @Override
    public double getHig() {
        return hight;
   }
    
    @Override
    public String toString(){
        return "id= "+this.getId()+", "+this.getName()+"\n"+getTime()+"\n"+"Высота: "+this.getHig()+"\n"+"Радиус: "+this.getRad()+"\n"+"Диагональ: "+this.getDiag()+"\n"+ "Площадь тела вращения: "+this.getArea_Body()+"\n"+"S=: "+this.getArea()+" V=: "+this.getVolume()+"\n";
    }

}
