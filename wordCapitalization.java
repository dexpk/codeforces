import java.util.Scanner;

public class wordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        char c = s.charAt(0);
        String res = Character.toString(c).toUpperCase();
        res = res + s.substring(1,s.length());
        System.out.println(res);
    }
}