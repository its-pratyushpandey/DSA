import java.util.Scanner;

public class Solution {
    int findSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution obj = new Solution();
        int res = obj.findSum(n);
        System.out.println(res);
        sc.close();
    }
}
