import java.util.Scanner;

public class Task7_109 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int x = in.nextInt();
        int y = in.nextInt();
        int k;
        if (x > y) {
            for (k = y; k > 1; k = k - 1){
                if (x % k == 0 && y % k == 0) {
                    System.out.println(k);
                 break;
                }
            }
        }
        else {
            for (k = x; k > 1; k = k - 1){
                if (x % k == 0 && y % k == 0) {
                    System.out.println(k);
                    break;
                }
            }
        }

    }
}
