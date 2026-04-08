class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> trackAdditions = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            List<String> anagramGroup = new ArrayList<>();
            if (!trackAdditions.contains(strs[i])) {
                anagramGroup.add(strs[i]);
                trackAdditions.add(strs[i]);
                for (int j = i+1; j < strs.length; j++) {
                    if (validAnagrams(strs[i], strs[j])) {
                        anagramGroup.add(strs[j]);
                        trackAdditions.add(strs[j]);
                    }
                }
                result.add(anagramGroup);
            }
            
        }
        
        return result;
    }

    public boolean validAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (Arrays.equals(array1, array2)) {
            return true;
        }

        return false;
    }
}
