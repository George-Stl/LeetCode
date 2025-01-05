package leetcode.easy;

public class ClimbingStairs_70 {
    public static void main(String[] args) {
        ClimbingStairs_70 cs = new ClimbingStairs_70();
        int stairs = 11;
        System.out.println("Количество способов: " + cs.climbStairs(stairs));
    }

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int first = 1;
        int second = 2;
        int current = 0;
        for (int i = 3; i <= n; i++) {
            current = first + second;
            first = second;
            second = current;
        }
        return current;
    }
}
