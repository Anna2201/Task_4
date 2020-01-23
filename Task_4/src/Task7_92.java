import java.util.Scanner;

public class Task7_92 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int k;
        k = a;
        do {
            a = a + k;
        } while (a / k != b);
        System.out.println(a);
        }
}
