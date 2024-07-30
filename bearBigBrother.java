import java.util.Scanner;

public class bearBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int year = 0;
        for(int i = 0; i < 100; i++) {
            if(a>b) {
                System.out.println(year);
                break;
            }
            else {
                a = a * 3;
                b = b * 2;
                year ++;
            }
        }
    }
}
