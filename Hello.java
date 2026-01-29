import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");//this line prints hello world and indentds to the next line.
        Scanner scan = new Scanner(System.in);
        System.out.println("enter user name");
        String name=scan.nextLine();
        System.out.println("username is " + name);

    }
}
