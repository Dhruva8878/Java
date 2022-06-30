public class Sum {

    int [][] array={
            {1,2,3},
            {4,5,6},
            {7,8,9},
    };

    public static void main(String[] args) {
        Sum s=new Sum();
        int sum=0;
        for(int i=0; i<s.array.length; i++){
            for(int j=0; j<s.array.length; j++){
                if(s.array[j][i]%2==0){
                    sum+=s.array[j][i];
                }
            }
            System.out.println(sum);
            sum=0;
        }
    }
}
