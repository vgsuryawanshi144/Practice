import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();


        int sum = a + b;
        System.out.println(sum);
    }
}
