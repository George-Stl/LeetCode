package leetcode.easy;

public class SqrtX_69 {

    public static void main(String[] args) {
        SqrtX_69 sqrt = new SqrtX_69();
        int num = 9;
        System.out.println(sqrt.mySqrt(num));
    }

    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 2, right = x / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else if (mid > x / mid) {
                right = mid - 1;
            }
        }
        return right;
    }
}
