package staticmethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";


    //contructor to initialize the variable

    /*public Student(int r, String n) {
        rollno = r;
        name = n;
    }*/

    // contructer sử dụng cách này và cách dưới

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    //static method to change the value  of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display value
    void display() {
        System.out.println(rollno + " " + " " + college);
    }
}