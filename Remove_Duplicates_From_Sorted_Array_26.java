public class Remove_Duplicates_From_Sorted_Array_26 {
    public int removeDuplicates(int[] nums) {
        PriorityQueue<Integer> ind = new PriorityQueue<>();
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!ar.contains(nums[i])) {
                ar.add(nums[i]);
                if (ind.size() > 0) {
                    nums[ind.poll()] = nums[i];
                    ind.add(i);
                }
            } else {
                ind.add(i);
            }
        }
        if (ind.size() > 0) {
            for (int i = 0; i < ind.size(); i++) {
                nums[ind.poll()] = -1;
            }
        }
        return ar.size();
    }
}
