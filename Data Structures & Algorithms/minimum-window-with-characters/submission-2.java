class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> windowMap = new HashMap<>();
        Map<Character,Integer> tmap = new HashMap<>();

        for (int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if (!tmap.containsKey(c)){
                tmap.put(c, 1);
            } else {
                tmap.put(c, tmap.get(c) +1);
            }
        }

        int l = 0;
        int satisfied = 0;
        int required = tmap.size();
        int startIndex = 0;
        int minLen = Integer.MAX_VALUE;

        for (int r = 0; r < s.length() ; r++){
                char c = s.charAt(r);
                if (!windowMap.containsKey(c)){
                    windowMap.put(c, 1);
                } else {
                    windowMap.put(c, windowMap.get(c) + 1);
                }

                if (tmap.containsKey(c) && tmap.get(c) == windowMap.get(c)){
                    satisfied++;
                }

                while (satisfied == required){
                    int windowSize = r - l + 1;
                    if (windowSize < minLen){
                        minLen = windowSize;
                        startIndex = l;
                    }

                    char removed = s.charAt(l);
                    windowMap.put(removed, windowMap.get(removed) - 1 );
                    

                    if (tmap.containsKey(removed) && tmap.get(removed) > windowMap.get(removed)){
                        satisfied--;
                    }
                    l++;

                }

            

        }

        if (minLen == Integer.MAX_VALUE){
            return "";
        }

        return s.substring(startIndex, startIndex + minLen);
    }
}
