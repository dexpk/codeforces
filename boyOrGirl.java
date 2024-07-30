import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class boyOrGirl {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> res = new HashSet<>();
        String s = sc.next();
        s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            res.add(s.charAt(i));
        }
        if(res.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        }
        else {
            System.out.println("IGNORE HIM!");
        }
    }
}
