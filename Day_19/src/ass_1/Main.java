package ass_1;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        List<Product> list=new ArrayList<>();

        for(int i=0; i<2; i++){
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter Product Id");
            int id=sc.nextInt();

            System.out.println("Enter Product Name");
            String name= sc.next();

            System.out.println("Enter Product price");
            double price= sc.nextDouble();

            Product p=new Product(id,name,price);
            list.add(p);
        }

        Scanner sc2=new Scanner(System.in);
        System.out.println("On which Basis do you want to sort");
        System.out.println("Enter 1 for sorting the product according to the productPrice");
        System.out.println("Enter 2 for sorting the product according to the productName");
        System.out.println("Enter 3 for sorting the product according to the productId ");

        int sort= sc2.nextInt();

        if(sort==1){
            Collections.sort(list,new AccToPrice());
            System.out.println(list);
        }
        else if (sort==2) {
           Collections.sort(list,new AccToName());
            System.out.println(list);
        }
        else {
            Collections.sort(list,new AccToId());
            System.out.println(list);
        }


    }



}
