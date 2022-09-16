package com.array.NO884;

/**
 * Created with IntelliJ IDEA.
 * Author: lukaijie
 * Date: 2022/7/25
 * Time: 22:37
 * Description:
 */
public class No884 {
    public static void main(String[] args) {
        No884.Solution solution=new No884().new Solution();
        System.out.println(solution.backspaceCompare("ab##","c#d#"));

    }
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            int fastIndex=0;
            int slowIndex=0;
            String a="",b="";
            for(;fastIndex<s.length();fastIndex++){
                if(((fastIndex+1)!=s.length() && s.charAt(fastIndex+1)!='#') & s.charAt(fastIndex)!='#')
                    a+=s.charAt(fastIndex);


                if (((fastIndex+1)==s.length()) & s.charAt(fastIndex)!='#')
                    a+=s.charAt(fastIndex);

            }
            for(;slowIndex<t.length();slowIndex++){
                if(((slowIndex+1)!=t.length() && t.charAt(slowIndex+1)!='#') & t.charAt(slowIndex)!='#')
                    b+=t.charAt(slowIndex);

                if (((slowIndex+1)==t.length()) & t.charAt(slowIndex)!='#')
                    b+=t.charAt(slowIndex);


            }
            System.out.println(a);
            System.out.println(b);
            return a.equals(b);

        }
    }
}

