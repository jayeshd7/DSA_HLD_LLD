package AugustBatchProblem.Advanced.Tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



class TrieNode
{
    // each node stores a map to its child nodes
    Map<Character, TrieNode> child = new HashMap<>();

    // keep track of the total number of times the current node is visited
    // while inserting data in Trie
    int freq = 0;
}

public class AutoSuggestion {
    public static void main(String[] args) {
       // ArrayList<String> words = new String[]{"AND", "BONFIRE", "BOOL", "CASE", "CATCH", "CHAR"};
        ArrayList<String> words = new ArrayList<>();
        words.add("AND");words.add("BONFIRE");
        prefix(words);
    }
    public static ArrayList<String> prefix(ArrayList<String> A) {

        // construct a Trie from the given items
        TrieNode root = new TrieNode();
        for (String s: A) {
            insert(root, s);
        }

        // Recursively traverse the Trie in a preorder fashion to list all prefixes
        ArrayList<String> ans = printShortestPrefix(root, "");
        return ans;

    }

    public static ArrayList<String> printShortestPrefix(TrieNode root, String word_so_far)
    {

        ArrayList<String> al = new ArrayList<String>();
        if (root == null) {
            return null;
        }

        // print `word_so_far` if the current Trie node is visited only once
        if (root.freq == 1)
        {
            //System.out.println(word_so_far);
            al.add(word_so_far);
            return al;
        }

        // recur for all child nodes
        for (Map.Entry<Character, TrieNode> child: root.child.entrySet()) {
            printShortestPrefix(child.getValue(), word_so_far + child.getKey());
        }
        return al;
    }





    // Function to insert a given string into a Trie
    public static void insert(TrieNode root, String word)
    {
        // start from the root node
        TrieNode curr = root;
        for (char c: word.toCharArray())
        {
            // create a new node if the path doesn't exist
            curr.child.putIfAbsent(c, new TrieNode());

            // increment frequency
            curr.child.get(c).freq++;

            // go to the next node
            curr = curr.child.get(c);
        }
    }

    // Function to recursively traverse the Trie in a preorder fashion and
    // print the shortest unique prefix for each word in the Trie

}

