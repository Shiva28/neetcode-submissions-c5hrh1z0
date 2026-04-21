class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> trackFrequencies = new HashMap<>();
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            trackFrequencies.put(nums[i], trackFrequencies.getOrDefault(nums[i], 0) + 1);
        }

        return trackFrequencies.entrySet()
        .stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        .limit(k)
        .map(Map.Entry::getKey)
        .mapToInt(Integer::intValue)
        .toArray();
        
    }
}
