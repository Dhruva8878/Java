public class Switch {

    public static void main(String[] args) {
     int [] arr={5,10,14};

     switch (arr.length){

         case 1 :{
             int p=1;
             for(int i=1; i<=arr[0]; i++){
                 p*=i;
             }
             System.out.println(p);
         }
         break;
         case 2 :{
             System.out.println(Math.abs(arr[0]-arr[1]));
         }
         break;
         default:{
             System.out.println("Error");
         }

     }

    }
}
