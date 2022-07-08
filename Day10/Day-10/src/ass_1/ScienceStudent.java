package ass_1;

public class ScienceStudent  extends Student {

    int phisicsMarks;
    int chemistryMarks;
    int mathsMarks;

    void setdata(int pm, int cm, int mm){
        if(pm<=100 & cm<=100 & mm<=100){
            this.phisicsMarks=pm;
            this.chemistryMarks=cm;
            this.mathsMarks=mm;
        }
        else{
            System.out.println("Please Enter Marks in Range 0-100");
        }


    }


    @Override
    int getPercentage() {
      int data=(int)(this.phisicsMarks+this.chemistryMarks+this.mathsMarks)/3;
      return data;
    }
}
