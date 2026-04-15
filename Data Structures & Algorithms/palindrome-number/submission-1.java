class Solution {
    public boolean isPalindrome(int x) {

        String reverse = "";
        String original = String.valueOf(x);

        for (int i = original.length() - 1; i >= 0 ; i--){
            reverse += original.charAt(i);
        }

        if (original.equals(reverse)){
            return true;
        }

        else {
            return false;
        }
        
    }
}