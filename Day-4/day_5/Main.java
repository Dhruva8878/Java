package day_5;

public class Main {

    public static void main(String[] args) {
     Circle circle =new Circle();
     circle.radius=10;

     Ractangle ractangle=new Ractangle();
     ractangle.length=10;
     ractangle.breadth=8;

     Square square=new Square();
     square.side=15;

     Shapes shapes=new Shapes();
     shapes.area(circle);
     shapes.area(ractangle);
     shapes.area(square);


    }
}
