package ass_3;


public class Main {

    public static Person generatePerson(Person person){
     return person;
    }


    public static void main(String[] args) {
        Person newStudent = generatePerson(new Student());

        Person newTeacher = generatePerson(new Instructor());

        Adreess add=new Adreess();

        System.out.println(newStudent);
        System.out.println(add);
        System.out.println(newTeacher);
        System.out.println(add);
    }
}
