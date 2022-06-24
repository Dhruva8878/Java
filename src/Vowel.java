

public class Vowel {


  String n;



    public static void main(String[] args) {

        String [] vowel={"a","e","i","o","u","A","E","O","I","U"};
        String [] consonent={"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};

        Vowel num1= new Vowel();
        num1.n="U";
        Vowel num2=new Vowel();
        num2.n="x";
        Vowel num3=new Vowel();
        num3.n="4";


        for(int i=0; i<vowel.length; i++){
            if(vowel[i]==num1.n){
                System.out.println("vowel");
                break;
            }
        }
        for(int j=0; j<consonent.length; j++){
            if(consonent[j]== num2.n){
                System.out.println("consonent");
            }
        }
        for(String x : consonent){
            if(x != num3.n){
                System.out.println("Invalid number");
                break;
            }
        }

    }
}
