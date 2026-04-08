class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> trackAnagrams = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] arrayStr = strs[i].toCharArray();
            Arrays.sort(arrayStr);
            String keyString = new String(arrayStr);
            List<String> vals = trackAnagrams.getOrDefault(keyString, new ArrayList<String>());
            vals.add(strs[i]);
            trackAnagrams.put(keyString, vals);
        }

        return new ArrayList<>(trackAnagrams.values());
    }

}
