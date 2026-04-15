class Solution {
    public int lengthOfLongestSubstring(String s) {

            Set<Character> set = new HashSet<>();
        int maxStreak = 0;
        int streak = 0;
        int index = 0;

        
                for (int i = 0; i < s.length(); i++){
                    char c = s.charAt(i);

                    while (set.contains(c)){
                        set.remove(s.charAt(index));
                        index++;
                        streak--;
                        
                    }

                    set.add(c);
                    streak++;
                    maxStreak = Math.max(maxStreak, streak);



                }
        return maxStreak;
    }
}
