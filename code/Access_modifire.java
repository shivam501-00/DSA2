package code;
// import java.util.Scanner;

class Accounts {
    public String name;
    private String password;

    int add(int a, int b) {
        return a + b;
    }

    // Constructor helps to reduce number of statment from main method and main
    // class.

    Accounts(String name1, String pass1, int x, int y) {
        System.out.println("Constructor called");
        this.name = name1;
        System.out.println(name1);

        // setting pass
        this.password = pass1;
        setPass(pass1);
        System.out.println(getPass());
        System.out.println(add(x, y));
    }

    public void setPass(String pass) {
        this.password = pass;
    }

    public String getPass() {
        return this.password;
    }

}

public class Access_modifire {
    public static void main(String[] args) {

        Accounts A12 = new Accounts("SHIVAM", "ABDS@123", 5, 6);
        Accounts A2 = new Accounts("TUSHAR", "AVCDF@23", 10, 20);

    }
}
