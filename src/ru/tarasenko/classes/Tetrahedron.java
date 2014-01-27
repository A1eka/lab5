/*
*  правильный тетраэдр (все ребра равны)
*/
package ru.tarasenko.classes;

import ru.tarasenko.classes.Body;


public class Tetrahedron extends Body{
    private double edge; //ребро
    private double summ; //сумма всех ребер тетраедра
    private double area_surf; //площадь боковой грани
    private double hight;
    
     public Tetrahedron (double hight, double edge, double area, double summ){ // первый конструктор
        this.hight = hight;
        this.setName("Прав.Тетраэдр.");
        this.edge = edge;
        this.area_surf = area;
        this.summ = summ;
        this.area = 1.732*edge*edge;
        this.volume = edge*edge*edge*0.707;
    }
    /**
     * Возвращает длину ребра 
     * @return edge
     */
    
    public double getEdge(){
        return edge;
    }
    /**
     * Возвращает сумму всех ребер
     * @return summ
     */
       
    public double getSum(){
        return summ = this.getEdge()*6;
    }
    /**
     * Возвращает площадь боковой грани
     * @return area_surf
     */
    public double getArea_surf(){
        return area_surf = 0.43301*getEdge()*getEdge();
    } 
    
   //изменение площади, 
    //задаем величину на которую изменилось ребро.
    @Override
    public void Area(double dx) {
        this.edge+=dx;
        this.area = 1.732*edge*edge;    
   }
    
    //изменение объема в заданное число раз
    @Override
    public void Volum (double n) {
        this.volume=edge*edge*edge*0.707*n;
        this.edge = edge*Math.pow(n, 1/3);     
   }
    
    @Override
    public double getHig() {
        return hight;
   }
    
    @Override
    public String toString(){
        return "id= "+this.getId()+", "+this.getName()+"\n"+getTime()+"\n"+"Ребро: "+this.getEdge()+"\n"+"Высота: "+this.getHig()+"\n"+"Сумма рёбер: "+this.getSum()+"\n"+" Площадь грани: "+this.getArea_surf()+"\n"+"S=: "+this.getArea()+" V=: "+this.getVolume()+"\n";
    }

}

    

  
