class Solution {
    public int firstUniqChar(String s) {

        LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<>();

        for (Character c : s.toCharArray()) {

            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

        }

        for (int i = 0; i < s.length(); i++) {
            if (freqMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;

    }
}