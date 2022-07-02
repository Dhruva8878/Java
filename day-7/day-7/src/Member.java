public class Member {
//    Name : String
//    Age : int
//    Phone number : String
//    Address : String
//    Salary : double

    String Name;
    int Age;
    String Phone_no;
    String Address;
    double salary;

    void printSalary(int age,String no, String address,double salary){
      this.Age=age;
      this.Phone_no=no;
      this.Address=address;
      this.salary=salary;


        System.out.println(this.Age);
        System.out.println(this.Phone_no);
        System.out.println(this.Address);
        System.out.println(this.salary);
    }

    public static void main(String[] args) {
        Member e=new Employee();
        Member m=new Manager();
        e.printSalary(25,"8458806035","Indore",30000);
        m.printSalary(22,"8878763116","indore",35000);


    }
}
