import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int output = 0;

        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            output += bitarithmetic(s);
        }
        System.out.println(output);
    }

    public static int bitarithmetic(String s) {
        int n = 0;
        char s1 = s.charAt(0);
        char s2 = s.charAt(s.length() - 1);
        if(s1 == '+' || s2 == '+') {
            n++;
        } else {
            n--;
        }
        return n;
    }
}
