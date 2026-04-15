class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //Create a map to store frequence and list of words with the same frequency
        Map<String, List<String>> map = new HashMap<>();

        //Fetching each word
        for (int i = 0; i< strs.length; i++){
            String word = strs[i];

            //Creating each frquency
            int[] count = new int[26];
            for (int j = 0; j< word.length();j++){
                char c = word.charAt(j);
                count[c - 'a']++;
            }

            //Storing all frequencies as a key in the map
            String key = "";
            for (int k = 0; k < count.length; k++){
                key += count[k] + "#";
            }

            //Checking to see which frequency matches, add those words to corresponding values
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(word);
        }// end of for loop


        //Storing all grouped words in a list to display
        List<List<String>> result = new ArrayList<>();
        for (List<String> group : map.values()){
            result.add(group);
        } 

        return result;

       
    }
}
