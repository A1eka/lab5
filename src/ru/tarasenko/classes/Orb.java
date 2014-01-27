/*
*  Шар
*/
package ru.tarasenko.classes;

import ru.tarasenko.classes.Body;


public class Orb extends Body{
    private double lengh_circle; // длина окружности сечения проходящего через центр
    private double hight; //диаметр
    private double rad;
    private double x;//координаты центра 
    private double y;//сферы
            
            
    public Orb(double hight, double lengh_circle, double x, double y){ // первый конструктор
        this.hight = hight;
        this.setName("Шар");
        this.lengh_circle = lengh_circle;
        this.x = x;
        this.y = y;
        this.rad = this.hight/2;
        this.area = 4*Math.PI*rad*rad;
        this.volume = 4/3*Math.PI*this.rad*this.rad*this.rad;
    }
    
    /**
     * Возвращает длинe окружности сечения проходящего через центр
     * @return lengh_circle 
     */
    public double getLengh(){
        return lengh_circle = this.getHig()*Math.PI;
    }
    /**
     * Возвращает координату х центра окружности
     * @return x
     */
    public double getX(){
        return x;
    }
    /**
     * Возвращает координату y центра окружности
     * @return y
     */
    public double getY(){
        return y;
    }
    
     //изменение площади, 
    //задаем величину на которую изменилось ребро.
    @Override
    public void Area(double dx) {
        this.rad+=dx;
        this.area = 4*Math.PI* this.rad*this.rad;   
   }
    
    //изменение объема в заданное число раз
    @Override
    public void Volum (double n) {
        this.volume=4/3*Math.PI*this.rad*this.rad*this.rad*n;
        this.rad = rad*Math.pow(n, 1/3);
        this.hight = 2*rad;     
   }
    /**
     * Возвращает диаметр шара
     * @return 
     */
    @Override
    public double getHig() {
        return hight;      
   }
    
    @Override
    public String toString(){
        return "id= "+this.getId()+", "+this.getName()+"\n"+getTime()+"\n"+"Диаметр: "+this.getHig()+"\n"+"Длин окружности: "+this.getLengh()+"\n"+"Координаты центра: ("+this.getX() +" , "+this.getY()+")"+"\n"+"S=: "+this.getArea()+" V=: "+this.getVolume()+"\n";
       

    }
}
