import java.util.Scanner;
public class nextRound {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int output = next(a, pos);
        System.out.println(output);
    }
    public static int next(int arr[], int pos){
        int score = arr[pos-1];
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0 && score == 0) {
                continue;
            }
            else if(arr[i] >= score) {
                res++;
            }
        }
        return res;
    }
}
