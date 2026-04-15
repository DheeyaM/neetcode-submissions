class Solution {
    public boolean isPalindrome(String s) {

       String corrected = "";
       for (int i = 0; i< s.length(); i++){
        char c = s.charAt(i);
        if (c <= '9' && c >= '0'){
            corrected += c;
        }
        else if (c >= 'a' && c <= 'z' )
        {
            corrected += c;
        }
        else if (c >= 'A' && c <= 'Z' )
        {
            corrected += Character.toLowerCase(c);
        }
       }

        String reverse = "";
        for (int j = corrected.length() -1; j>=0; j--){
            reverse += corrected.charAt(j);
        }


        if (corrected.equals(reverse)){
            return true;
        }
        return false;
  
    }
}
