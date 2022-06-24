

public class Vowel {


  String n;


    public static void main(String[] args) {

        String [] vowel={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w",
                "x","y","z"};

        Vowel num= new Vowel();
        num.n="b";

        for(int i=0; i<vowel.length; i++){
            if(vowel[i]==num.n){
                System.out.println(num.n);
                break;
            }

        }

    }
}
