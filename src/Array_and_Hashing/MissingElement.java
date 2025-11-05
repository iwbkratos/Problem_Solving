package Array_and_Hashing;

import java.util.*;

public class MissingElement {
    /*
    * You are given an integer array nums consisting of unique integers.
    * Originally, nums contained every integer within a certain range.
    * However, some integers might have gone missing from the array.
    * The smallest and largest integers of the original range are still present in nums.
    * Return a sorted list of all the missing integers in this range. If no integers are missing, return an empty list.
    *
    * Example 1:

        Input: nums = [1,4,2,5]

        Output: [3]

        Explanation:

        The smallest integer is 1 and the largest is 5, so the full range should be [1,2,3,4,5].
        Among these, only 3 is missing.
     *
     * Example 2:

        Input: nums = [5,1]

        Output: [2,3,4]

        Explanation:
        The smallest integer is 1 and the largest is 5, so the full range should be [1,2,3,4,5].
        The missing integers are 2, 3, and 4.*/


    public static List<Integer> findMissingElements(int[] nums) {

        int count = nums[0];
        int smallest = nums[0];
        int largest = nums[0];

        HashMap<Integer,Integer> map = new HashMap();
        map.put(nums[0],0);
        for(int i=1; i<nums.length; i++ )
        {
            count += nums[i];
            map.put(nums[i],i);

            if(smallest > nums[i])
                smallest = nums[i];
            if(largest < nums[i])
                largest = nums[i];
        }

        int Lsum = largest * (largest+1) / 2;
        int Ssum = smallest-1 * (smallest-1 + 1) / 2;
        int MissingCount = (Lsum - Ssum) - count;

        if(MissingCount == 0)
            return new ArrayList<>();

        ArrayList<Integer> list = new ArrayList();
        for(int i = smallest; i<largest; i++ )
        {
            if(!map.containsKey(i))
                list.add(i);

        }

        return list;
    }
}
