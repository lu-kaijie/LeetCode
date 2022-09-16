package com.array.NO27;

/**
 * Created with IntelliJ IDEA.
 * Author: lukaijie
 * Date: 2022/7/23
 * Time: 23:04
 * Description:
 */
public class NO27 {
    public static void main(String[] args) {
        int[] nums= {3,2,2,3};
        NO27.Solution solution=new NO27().new Solution();
        System.out.println(solution.removeElement(nums,3));

    }
    class Solution {
        public int removeElement(int[] nums, int val) {
            int fastIndex=0;
            int slowIndex;
            for(slowIndex=0; fastIndex <nums.length; fastIndex++){
                if(val!=nums[fastIndex]){
                    nums[slowIndex]=nums[fastIndex];
                    slowIndex++;
                }
            }
            return slowIndex;

        }
    }
}
