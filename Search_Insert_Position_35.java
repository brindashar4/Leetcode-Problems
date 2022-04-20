class Search_Insert_Position_35 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start)/2;
        int index = -1;
        
        while(start <= end) {
            if(nums[mid] > target) end = mid;
            else if(nums[mid] < target) start = mid;
            else {
                index = mid;
                break;
            }
            
            if(target > nums[end]) {
                index = end+1;
                break;
            }
            else if (target < nums[start]) {
                index = start;
                break;
            }
            mid = start + (end - start)/2;
            if(start == mid && target > nums[start]) {
                index = start+1;
                break;
            }
            else if (start == mid && target == nums[start]) {
                index = start;
                break;
            }
        }
        return index;
    }
}