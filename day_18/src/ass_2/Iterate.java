package ass_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("Dhruv");
        list.add("Viraj");
        list.add("Prasant");
        list.add("Kullu");
        list.add("Babu");

        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("=============");

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("=============");
        for (String s:list){
            System.out.println(s);
        }

    }
}
