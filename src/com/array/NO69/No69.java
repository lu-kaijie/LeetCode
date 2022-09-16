package com.array.NO69;

/**
 * Created with IntelliJ IDEA.
 * Author: lukaijie
 * Date: 2022/7/21
 * Time: 22:36
 * Description:
 */
public class No69 {

    public static void main(String[] args) {
        Solution solution=new No69().new Solution();
        System.out.println(solution.mySqrt(200000));

        }
    class Solution {
        public int mySqrt(int x) {
            int left = 0, right = x, ans = x;
            while (left <= right) {
                int mid = left + ((right - left) >> 1);
                if ((long) mid * mid == x) {
                    ans = mid;
                    return ans;
                } else if ((long) mid * mid > x) {
                    right = mid - 1;
                    ans = right;
                } else if ((long) mid * mid < x)
                    left = mid + 1;
            }
            return ans;
        }
    }
}




