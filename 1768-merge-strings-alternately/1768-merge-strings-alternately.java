class Solution {
    public String mergeAlternately(String word1, String word2) {
        int maxL = word1.length() + word2.length();
        StringBuilder abc = new StringBuilder();
        for(int i = 0; i < maxL; i++) {
            if(i < word1.length())
                abc.append(word1.charAt(i));
            if(i < word2.length())
                abc.append(word2.charAt(i));
        }
        
        return abc.toString();
    }
}