public class TrieNode{
    //used to create multiple objects in PrefixTree class
    TrieNode[] children = new TrieNode[26];
    boolean endOfWord = false;
}

class PrefixTree {
    //create private TrieNode VARIABLE
    private TrieNode root;

    public PrefixTree() {
        //initializing that variable to a TrieNode OBJECT from the class
         root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()){
            int i = c - 'a';
            if (cur.children[i] == null){
                cur.children[i] = new TrieNode();
            }
            //ensuring that the characters after gets added 
            //as children and not parents
            cur = cur.children[i];
        }
        cur.endOfWord = true;

    }

    public boolean search(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()){
            int i = c - 'a';
            if (cur.children[i] == null){
                return false;
            }
            cur = cur.children[i];
        }

        return cur.endOfWord;

    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (char c : prefix.toCharArray()){
            int i = c - 'a';
            if (cur.children[i] == null){
                return false;
            }
            cur = cur.children[i];
        }
        return true;

    }
}
