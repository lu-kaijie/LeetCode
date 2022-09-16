package com.hash_table.NO438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: lukaijie
 * Date: 2022/8/20
 * Time: 22:36
 * Description:
 */
public class no438 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.findAnagrams("cbaebabacd","abc"));
    }
}


class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int p_length=p.length();
        System.out.println(p_length);
        int s_length=s.length();
        System.out.println(s_length);
        char[] ch1=p.toCharArray();
        int i=0;
        List<Integer> list=new ArrayList<Integer>();
        Arrays.sort(ch1);
        while(i+p_length-1<=s_length){
            String sub;
            if(i+p_length>s_length){
                sub=s.substring(i);
            }else {
                sub = s.substring(i, i + p_length);
            }

            char[] ch2=sub.toCharArray();
            Arrays.sort(ch2);
            if(Arrays.equals(ch2,ch1)){
                list.add(i);
            }
            i++;
        }
        return list;

    }
}
