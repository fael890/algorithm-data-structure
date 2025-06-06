package leetcode.RemoveDuplicatesFromSortedArray;

// 26. Remove Duplicates from Sorted Array
public class MySolution {
    public int removeDuplicates(int[] nums) {
        //int[] filteredNums = [];
        int count = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[count] != nums[i]){
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;
    }
}
