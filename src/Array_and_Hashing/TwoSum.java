package Array_and_Hashing;

import java.util.HashMap;

public class TwoSum {
/*
* Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
* You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
* Return the answer with the smaller index first.
*
* Example 1:

    Input:
    nums = [3,4,5,6], target = 7

    Output: [0,1]
    Explanation: nums[0] + nums[1] == 7, so we return [0, 1].
*
* Example 2:

    Input: nums = [5,5], target = 10

    Output: [0,1]
*
* Approach: Using Brute force we can solve it with the T.C of o(n^2)
*   Optimized approach :
*       Create an empty HashMap map (key = number, value = index).
        For each index i in the array:
        Compute complement = target - nums[i].
        If complement is already in map, return [map.get(complement), i].
        Otherwise, put nums[i] into map with its index.
* */
    public static int[] twoSum(int[] arr, int target)
    {
        HashMap<Integer,Integer> store = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            int onepiece = target - arr[i];

            if(store.containsKey(onepiece) && store.get(onepiece) != i)
            {
                return new int[]{store.get(onepiece),i};
            }

            store.put(arr[i],i);
        }
        return new int[]{};
    }
}
