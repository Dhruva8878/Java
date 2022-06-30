public class Reverse {

    public static void main(String[] args) {
        String str="Ramlal";
        String reveStr="";

        for(int i=str.length()-1; i>=0; i--){
           reveStr+=str.charAt(i);
        }
        System.out.println(reveStr);
    }
}
