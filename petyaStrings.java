import java.util.Scanner;
public class petyaStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            if((int)s1.charAt(i) < (int)s2.charAt(i)) {
                System.out.println(-1);
                return;
            }
            else if((int)s1.charAt(i) > (int)s2.charAt(i)){
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}
