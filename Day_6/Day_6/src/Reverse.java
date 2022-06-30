import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("please Enter string");

        String str=sc.next();
        String reveStr="";

        for(int i=str.length()-1; i>=0; i--){
           reveStr+=str.charAt(i);
        }
        System.out.println(reveStr);
    }
}
