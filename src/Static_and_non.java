public class Static_and_non {
    // with static condition

    static int total;

    //Non static condition
    int people;

    public static void main(String[] args) {


        Static_and_non p1= new Static_and_non();
        Static_and_non p2= new Static_and_non();
        p1.people=10;
        p2.people=20;
        p1.total=20;
        p2.total=30;

        // static
        System.out.println(p1.total);
        System.out.println(p2.total);
        //non static
        System.out.println(p1.people);
        System.out.println(p2.people);



    }

}

/* in the above example we see that when we are assigning some value to variable's
 when we reassign value of static variable's it is overwriting the value that
 we assign earlier but,
 when we reassign value of non-static variable's it is not overwriting it is going to
 make a new data in memory and shows the data new format with the previous.

 */
