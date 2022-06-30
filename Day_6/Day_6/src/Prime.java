public class Prime {


    public static void main(String[] args) {
        int [] arr1={1,3,10,15,26,9,11};
        int []arr2 = new int[10];
        int n=0;

        for(int i=0; i<arr1.length; i++){
            int count=0;
            for(int j=1; j<=arr1[i]; j++){
                if(arr1[i]%j==0){
                    count++;
               }
            }
           if(count==2){
               arr2[n]=arr1[i];
               n++;
           }
        }
       for(int i=0; i<arr2.length; i++){
           if(arr2[i]<=0){
               break;
           }
           else{
               System.out.println(arr2[i]);
           }

       }
    }


}
