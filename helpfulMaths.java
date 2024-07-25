import java.util.Scanner;
import java .util.ArrayList;
import java.util.Collections;
import java.util.List;
public class helpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> num = new ArrayList<Character>();
        String s;
        s = scanner.nextLine();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3') {
                num.add(s.charAt(i));
            }
        }
        Collections.sort(num);
        String res = "";
        for (int i = 0; i < num.size(); i++) {
            res += num.get(i).toString();
            res += "+";
        }
        res = res.substring(0, res.length() - 1);
        System.out.println(res);
    }
}
