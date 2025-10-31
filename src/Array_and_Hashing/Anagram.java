package Array_and_Hashing;

import java.util.Arrays;

public class Anagram {
    /*
    *Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
    *An anagram is a string that contains the exact same characters as another string,
    *but the order of the characters can be different.
    * Example 1:
        Input: s = "racecar", t = "carrace"
        Output: true
    *
    * Example 2:
        Input: s = "jar", t = "jam"
        Output: false
    *
    * Approach : ascii values are 256. so I just used an array of size 256.
    *   assume ascii values as index of an array. Whenever the ascii(index) appears from s1 increase the index's value by one,
    *   Decrease by one if it appears from s2.
    *   Then again iterate it the array.If any element !=0 then it's not an anagram.
    *   T.C : O(n)
    *   S.C : O(1)
    * */
    public static boolean isAnagram(String s1, String s2){

        if(s1.length() != s2.length())
            return false;
        if (s1.isEmpty() && s2.isEmpty())
            return true;

        int [] arr = new int[256];

        for (int i=0; i<s1.length(); i++)
        {
            int n_ascii = s1.charAt(i);
            int m_ascii = s2.charAt(i);

            arr[n_ascii] ++;
            arr[m_ascii] --;
        }

        for(int i=0; i<256; i++)
        {
            if(arr[i] != 0)
                return false;
        }
        return true;
    }
}
