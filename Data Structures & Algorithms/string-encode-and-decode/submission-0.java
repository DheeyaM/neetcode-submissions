class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for (String word : strs){
            res.append(word.length()).append("#");
            res.append(word);
        }
        //convert StringBuilder into String
        return res.toString();

    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();
        int i = 0;

        //loop through the string for each character
        while (i < str.length()){
            int j = i;
            //Search if # is found
            while (str.charAt(j) != '#'){
                j++;
            }

            //Convert to all char before # to int for the length
            int length = Integer.parseInt(str.substring(i,j));

            // move char pointer to after # which is first letter in word
            i = j + 1;
            //move second pointer to first letter plus
            // length which gives end of the word
          j = i + length;
          //create a word from first letter to last letter
          String word = str.substring(i,j);
          res.add(word);
          //first pointer points to end of word to move forward
          i = j;

        }
        return res;
        

    }
}
