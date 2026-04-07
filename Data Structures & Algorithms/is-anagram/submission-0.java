class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] arrayS = s.toCharArray();
        char[] arrayT =  t.toCharArray();

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < arrayS.length; i++) {
            countS.put(arrayS[i], countS.getOrDefault(arrayS[i], 0) + 1);
            countT.put(arrayT[i], countT.getOrDefault(arrayT[i], 0) + 1);
        }

        if (countS.equals(countT)) return true;
        return false;
        
    }
}
