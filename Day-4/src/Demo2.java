public class Demo2 {

    static  Student s1=new Student();

    Student getMyDataObject(){
        return new Student();
    }
    void printData1(Student myObj){

    }

    public static void main(String[] args) {
        Demo2 d1=new Demo2();

        Student s1=new Student();
        Student s2=new Student();

        d1.printData1(s1);


    }
}
