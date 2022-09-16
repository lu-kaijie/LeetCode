package com.hash_table.NO350;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Author: lukaijie
 * Date: 2022/8/26
 * Time: 20:53
 * Description:
 */
public class no350 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] b=solution.intersect(nums1,nums2);
        System.out.println(Arrays.toString(b));
    }
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> resList = new ArrayList<Integer>();
        for (int i : nums1) {
            list1.add(i);
        }

        for (int i: nums2){
            if(list1.contains(i)){
                resList.add(i);
                list1.remove((Integer) i);
            }
        }

        int[] d = new int[resList.size()];
        for(int i = 0;i<resList.size();i++){
            d[i] = resList.get(i);
        }
        return resList.stream().mapToInt(Integer::valueOf).toArray();


    }
}
