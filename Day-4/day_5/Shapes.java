package day_5;

public class Shapes {

    public void area(Circle circle){
        double ar= circle.radius* circle.radius*3.14;
        System.out.println("Area of Circle =  "+ar);
    }
    public void area(Ractangle ractangle){
     int ar= ractangle.length* ractangle.breadth;
        System.out.println("Area of Ractangle =  "+ar);
    }
    public void area(Square square){
        int ar= square.side * square.side;
        System.out.println("Area of Square =  "+ar);
    }
}

class Circle{
    int radius;

}
class Ractangle{
    int length=10;
    int breadth=15;
}
class Square{
    int side=15;
}
