import java.util.Scanner;
public class dominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int res = (m * n) / 2;
        System.out.println(res);
    }
}
