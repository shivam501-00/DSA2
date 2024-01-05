package code;

/**
 * oops
 */
public class oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s1 = new Student("rahul", 1, 20, "A", 5, 25);
        // s1.name = "Rahul";
        // s1.roll_no = 1;
        // s1.age = 20;
        // s1.div = "A";
        // s1.std_info();

    }
}

class Student {

    String name;
    int roll_no;
    int age;
    String div;

    Student() {
        // this.name = name;
        System.out.println(" this is non parameterized constructor " + name);
    }

    Student(String name, int roll_no, int age, String div, int a, int b) {
        int sum;
        sum = a + b;
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
        this.div = div;

        System.out.println("Name of student s1 is " + name);
        System.out.println("roll no of student s1 is " + roll_no);
        System.out.println("Age of student s1 is " + age);
        System.out.println("Division of student s1 is " + div);
        System.out.println("sum " + sum);
    }

    // void std_info() {
    // System.out.println("Name of student s1 is " + this.name);
    // System.out.println("roll no of student s1 is " + this.roll_no);
    // System.out.println("Age of student s1 is " + this.age);
    // System.out.println("Division of student s1 is " + this.div);
    // }

}