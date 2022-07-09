class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int pivot;
        int end = nums.length -1;
        while(start <= end) {
            pivot = start + (end - start) / 2;
            if(nums[pivot] == target) return pivot;
            if(target > nums[pivot]) start = pivot +1;
            else end = pivot -1;
        }
        return -1;
    }
}