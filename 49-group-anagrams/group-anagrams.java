class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] arr = new int[26];
            for (char c : s.toCharArray()) {
                arr[c - 'a']++;
            }

            // String key = "";
            // for(int c : arr){
            //     key += c+"#";
            // }

            //standard approach inside loops
            StringBuilder keybuilder = new StringBuilder();
            for(int c : arr){
                keybuilder.append(c).append("#");
            }

            String key = keybuilder.toString();

            if (!map.containsKey(key)) {
                map.put(key,  new ArrayList<>());
            }
        
            map.get(key).add(s);
        }

    
        return new ArrayList<>(map.values());


    }
}