class Solution {
    public int firstUniqChar(String s) {

        // LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<>();
        
        int[] arr = new int[26];

        for (Character c : s.toCharArray()) {
            // freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            arr[c - 'a']++;
        }

        // for (int i = 0; i < s.length(); i++) {
        //     if (freqMap.get(s.charAt(i)) == 1) {
        //         return i;
        //     }
        // }

        int minIndex = s.length();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                int j = s.indexOf(i + 'a');
                minIndex = Math.min(j, minIndex);
            }

        }

        return minIndex != s.length() ? minIndex : -1;

    }
}