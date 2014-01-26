package ru.tarasenko.lab5;
import ru.tarasenko.classes.Tetrahedron;
import ru.tarasenko.classes.SortMode;
import ru.tarasenko.classes.Cylinder;
import ru.tarasenko.classes.Orb;
import ru.tarasenko.classes.Cube;
import ru.tarasenko.classes.Body;
import java.io.*;
import java.util.*;

public class Lab5 {

  private static List <Body> list = new ArrayList();
       
    private static void init(){ // создание и заполнение списка
            list.add(new Cube(3,0,0));
            list.add(new Orb(1,2,5,5));
            list.add(new Tetrahedron(1,2,3,12));
            list.add(new Cylinder(1,1,5));
            //list.add(new Cube(2,0,0));
           // list.add(new Orb(3,4,1,0));
           // list.add(new Tetrahedron(3,2,6,18));
           // list.add(new Cylinder(2,7,5));
           // list.add(new Cube(5,0,0));
           // list.add(new Orb(1,1,4,3));
}
    public static void main(String[] args) throws IOException {
        init();
        // подготовка к вводу
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        for(;;){ // начинаем бесконечный цикл
            System.out.println();
            System.out.println("Выберите тип сортировки (выйти - пустая строка):");
            System.out.println("--------------------------------------------------");
            System.out.println("1 - по возраcтанию id");
            System.out.println("2 - по убыванию id");
            System.out.println("3 - по возраcтанию имени");
            System.out.println("4 - по убыванию имени");
            System.out.println("5 - по возрастанию высоты");
            System.out.println("6 - по убыванию высоты");            
            System.out.println("7 - по возрастанию объема");
            System.out.println("8 - по убыванию объема");
            System.out.println("9 - увеличть объем в заданное число раз");
            System.out.println("10 - увеличть площадь на заданную величину");
            System.out.println("11 - добавить элемент");
            System.out.println("12 - удалить элемент");
            System.out.println("0 - выход");
            System.out.println("--------------------------------------------------");
        
            String mode = br.readLine(); // читаем строку из буфера ввода

        if (mode.equals ("0")) break; // прерываем цикл, если строка пустая
            boolean sortUp = mode.equals("2")||mode.equals("4")||mode.equals("6")||mode.equals("8");

        int sortMode=0;

        if (mode.equals("1")||mode.equals("2")) {//по имени
            sortMode=0;//по id
            Collections.sort(list,new SortMode(sortUp,sortMode));
            for(Body b: list) {
                System.out.println(b);
            }
        }
        else if (mode.equals("3")||mode.equals("4")) {//по имени
            sortMode=1;//по id
            Collections.sort(list,new SortMode(sortUp,sortMode));
            for(Body b: list) {
                System.out.println(b);
            }
        }
            else if (mode.equals("5")||mode.equals("6")) {//по имени
            sortMode=2;
            Collections.sort(list,new SortMode(sortUp,sortMode));
            for(Body b: list) {
                System.out.println(b);
            }
        }
            else if (mode.equals("7")||mode.equals("8")){//по V
            sortMode=3;//по id
            Collections.sort(list,new SortMode(sortUp,sortMode));
            for(Body b: list) {
                System.out.println(b);
            }
        };
        
        if (mode.equals ("9")){//увеличение V в заданное число раз. 
            
            System.out.println("--------------------------------------------------");
            System.out.println("Введите ID объекта: ");
            mode = br.readLine();            
            int id = Integer.parseInt(mode);
            System.out.println("Введите число: ");
            mode = br.readLine();
            double n = Integer.parseInt(mode); 
            System.out.println("--------------------------------------------------");
            for(int i = 0; i< list.size(); i++){
                if( list.get(i).getId() == id){
                        list.get(i).Volum(n);
                        System.out.println(list.get(i));
                        break;
                        }
                }          
        }
        if (mode.equals ("10")){//увеличение S, задаем изменение сторон 
            
            System.out.println("--------------------------------------------------");
            System.out.println("Введите ID объекта: ");
            mode = br.readLine();            
            int id = Integer.parseInt(mode);
            System.out.println("Введите число: ");
            mode = br.readLine();
            double n = Integer.parseInt(mode); 
            System.out.println("--------------------------------------------------");
            for(int i = 0; i< list.size(); i++){
                if( list.get(i).getId() == id){
                        list.get(i).Area(n);
                        System.out.println(list.get(i));
                        break;
                        }
                }          
        }
        
        if (mode.equals ("11")){//добавляем элемент 
            
            System.out.println("--------------------------------------------------");
            System.out.println("      Выберите тип нового элемента: ");
            System.out.println("--------------------------------------------------");
            System.out.println(" 1  - Куб");
            System.out.println(" 2  - Шар ");
            System.out.println(" 3  - Правильный тетраэдр ");
            System.out.println(" 4  - Цилиндр ");
            System.out.println("--------------------------------------------------");
            System.out.print( "Ваш выбор :");
            mode = br.readLine();
            System.out.println("--------------------------------------------------");
            
            int a = Integer.parseInt(mode);
           switch(a){
               case 1: 
               {
                   System.out.println(" Введите длину стороны куба:");
                   double hight = Double.parseDouble( br.readLine() );
                   double summ = hight*12;
                   System.out.println(" Введите диагональ куба:");
                   double lengh_diag = Double.parseDouble( br.readLine() ); 
                   list.add( new Cube (hight , summ , lengh_diag ) );
                   break;
                 }
               case 2:
                   {
                   System.out.println(" Введите диаметр шара:");
                   double hight = Double.parseDouble( br.readLine() );
                   double length = hight*Math.PI;
                   System.out.println(" Введите координаты центра:\n");
                   System.out.println(" x=:");
                   double x = Double.parseDouble( br.readLine() );
                   System.out.println(" y=:");
                   double y = Double.parseDouble( br.readLine() );
                   list.add( new Orb (hight , length , x , y) );
                   break;
                 }
                case 3:
                   {
                   System.out.println(" Введите длину стороны тетраэдра:");
                   double edge = Double.parseDouble( br.readLine() );
                   System.out.println(" Введите длину высоту тетраэдра");
                   double hight = Double.parseDouble( br.readLine() );
                   double area = 0.433*edge*edge;
                   double sum = edge*6; 
                   list.add( new Tetrahedron (hight, edge , area , sum) );
                   break;
                 }
                case 4:
                   {
                   System.out.println(" Введите высоту циллиндра:");
                   double hight = Double.parseDouble( br.readLine() );                   
                   System.out.println(" Введите радиус");
                   double rad = Double.parseDouble( br.readLine() );
                   System.out.println(" Введите диагональ");
                   double dia = Double.parseDouble( br.readLine() ); 
                   list.add( new Cylinder (hight, rad, dia ) );
                   break;
                 }
                default:
                {
                    System.out.println(" Значение не корректно.");
                     break;
                } 
           };
           
           
           Collections.sort(list,new SortMode(sortUp,sortMode));
            for(Body b: list) {
                System.out.println(b);
            }
          
        };
                
           if (mode.equals("12")){//удаление
                
                System.out.println("--------------------------------------------------");
                System.out.print("Введите ID объекта: ");
                mode = br.readLine();
                int id1 = Integer.parseInt(mode);
                for(int i = 0; i< list.size(); i++){
                        if( list.get(i).getId() == id1){
                            list.remove(i);
                            break;
                            }
                        }
                Collections.sort(list,new SortMode(sortUp,sortMode));
                for(Body b: list) {
                System.out.println(b);
             }
         }    
        }
    }
}
    