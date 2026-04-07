class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (valIndex.containsKey(difference)) {
                return new int[]{valIndex.get(difference), i};
            } else {
                valIndex.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
