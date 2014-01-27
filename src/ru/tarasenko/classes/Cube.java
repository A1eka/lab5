
package ru.tarasenko.classes;

import ru.tarasenko.classes.Body;


public class Cube extends Body{
    private double sum; // сумма всех рёбер куба
    private double lengh_diag; // диагональ куба
    private double hight; //высота
    
    //главный конструктор
    public Cube(double hight, double sum, double lengh_diag){ // первый конструктор
        this.hight = hight;
        this.setName("Куб");
        this.sum = sum;
        this.lengh_diag = lengh_diag; 
        this.area = hight*hight*6;
        this.volume = hight*hight*hight;

    }
    
    public double getSum(){
        return sum = this.getHig()*12;
    }

    public double getDiag(){
        return lengh_diag = this.getHig()*Math.sqrt(3);
    }

   
    
//изменение площади, 
    //задаем величину на которую изменилось ребро.
    @Override
    public void Area(double dx) {
        this.hight+=dx;
        this.area = 6*hight*hight;      
   }
    
    //изменение объема в заданное число раз
    @Override
    public void Volum (double n) {
        this.volume=this.hight*this.hight*this.hight*n;
        this.hight = Math.pow(volume , 1/3);     
   }
    
    @Override
    public double getHig() {
        return hight;      
   }
    
    @Override
    public String toString(){
        return "id= "+this.getId()+", " +this.getName()+"\n"+
			getTime()+"\n"+
		      "Ребро: "+this.getHig()+"\n"+
		      "Сумма рёбер: "+this.getSum()+"\n"+
		      "Длина диагонали: "+this.getDiag()+"\n"+
		      "S=: "+this.getArea()+
		      " V=: "+this.getVolume()+"\n";
    }
}