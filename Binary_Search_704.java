class Binary_Search_704 {
    public int search(int[] nums, int target) { 
        int index = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            if(nums[start] == target) {
                index = start;
                break;
            }
            if(nums[end] == target) {
                index = end;
                break;
            }
            int mid = (start+end)/2;
            if(target < nums[mid]) end = mid-1;
            else if (target > nums[mid]) start = mid+1;
            else {
                index = mid;
                break;
            }
        }
        
        return index;
    }
}