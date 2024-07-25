import java.util.Scanner;
public class beautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int res = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(a[i][j] != 0) {
                    res = Math.abs(i-2) + Math.abs(j -2);
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
