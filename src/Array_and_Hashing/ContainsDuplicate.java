package Array_and_Hashing;

import java.util.HashMap;

public class ContainsDuplicate {
/*
* Given an integer array nums, return true if any value appears more than once
* in the array, otherwise return false.
*
* Example 1:

  Input: nums = [1, 2, 3, 3]

  Output: true

* Example 2:

  Input: nums = [1, 2, 3, 4]

  Output: false
* ***********************
*  Question Source: neetcode.io
*  Approach: Used Hashmap to find the element.
*  T.C: o(n)
*  S.C o(n)
* */

    public static boolean findDuplicate(int[] arr)
    {
        if(arr.length == 0)
        {
            return false;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if(map.containsValue(arr[i])){
               return  true;
            }

            map.put(i,arr[i]);
        }
        return false;
    }
}
