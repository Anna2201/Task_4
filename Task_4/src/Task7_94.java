import java.util.Scanner;

public class Task7_94 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = in.nextInt();
        int n = in.nextInt();
        int k;
        k = a;
        while (n != 1) {
            n = n - 1;
            a = a * k;
        }
        System.out.println(a);
    }
}
