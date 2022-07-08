package ass_1;

public class HistoryStudent extends Student {

    int historyMarks;
    int civicsMarks;

    void setdata(int hm, int cm){
        if(hm<=100 & cm<=100){
            this.historyMarks=hm;
            this.civicsMarks=cm;
        }
        else{
            System.out.println("Please Enter Marks in range 0-100");
        }

    }


    @Override
    int getPercentage() {
      int data=(int)(this.historyMarks+this.civicsMarks)/2;
      return data;
    }
}
