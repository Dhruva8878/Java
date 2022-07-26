package ass_1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {

        TreeSet<Product> p1=new TreeSet<>(new AccToPrice());
        TreeSet<Product> p2=new TreeSet<>(new AccToName());
        TreeSet<Product> p3=new TreeSet<>(new AccToId());

        for(int i=0; i<2; i++){
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter Product Id");
            int id=sc.nextInt();

            System.out.println("Enter Product Name");
            String name= sc.next();

            System.out.println("Enter Product price");
            double price= sc.nextDouble();

            Product p=new Product(id,name,price);
            p1.add(p);
            p2.add(p);
            p3.add(p);
        }

        Scanner sc2=new Scanner(System.in);
        System.out.println("On which Basis do you want to sort");
        System.out.println("Enter 1 for sorting the product according to the productPrice");
        System.out.println("Enter 2 for sorting the product according to the productName");
        System.out.println("Enter 3 for sorting the product according to the productId ");

        int sort= sc2.nextInt();

        if(sort==1){
            System.out.println(p1);
        }
        else if (sort==2) {
            System.out.println(p2);
        }
        else {
            System.out.println(p3);
        }


    }



}
