class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        while(j<s.length() && i<t.length()){
            if(t.charAt(i)==s.charAt(j)){
                i++;
            }
            j++;
        }
        return t.length()-i;
    }
}