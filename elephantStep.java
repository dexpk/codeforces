import java.util.Scanner;
public class elephantStep {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        if(n % 5 >= 1) {
            a = (n/5)+1;
            System.out.println(a);
        }
        else {
            a = n / 5;
            System.out.println((a));
        }
    }
}
