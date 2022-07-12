package ass_4;

public class Test implements Intr{

    @Override
    public int[] display(int n) {
        int [] arr=new int[n];
        int index=0;

        for(int i=1; i<=n ; i++){
            int count=0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
           if(count==2){
               arr[index]=i;
               index++;
           }
        }
        return arr;
    }
}
