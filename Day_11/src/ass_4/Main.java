package ass_4;

public class Main {

    public static void main(String[] args) {
        Test t=new Test();
        int[] ans=t.display(14);

        for(int i=0; i< ans.length; i++){
            if(ans[i]==0){
                break;
            }
            System.out.println(ans[i]);
        }

    }
}
