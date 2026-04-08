class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> trackAnagrams = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] arrayStr = strs[i].toCharArray();
            Arrays.sort(arrayStr);
            List<String> vals = trackAnagrams.getOrDefault(new String(arrayStr), new ArrayList<String>());
            vals.add(strs[i]);
            trackAnagrams.put(new String(arrayStr), vals);
        }

        return new ArrayList<>(trackAnagrams.values());
    }

}
