class Solution {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()){
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            count[c - 'a']++;
        }

        for (int k = 0; k < t.length(); k++){
            char c = t.charAt(k);
            count[c - 'a']--;
        }

        for (int l = 0; l < count.length ; l++){

            if (count[l] != 0){
                return false;
            }
        }

        return true;

    }
}
