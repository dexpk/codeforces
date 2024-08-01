import java.util.Scanner;
public class stonesTables {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int count = 0;
        for(int i = 1; i < n; i++) {
            if(ch[i] == ch[i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
