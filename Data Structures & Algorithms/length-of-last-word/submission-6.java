class Solution {
    public int lengthOfLastWord(String s) 
    {
        int i;
        for(i=s.length()-1; i>=0; i--){
            if(s.charAt(i)!=' '){
                break;
            }
        }
        int len=0;
        for(int j=i; j>=0; j--){
            if(s.charAt(j)==' '){
                break;
            }
            len++;
        }
        return len;
    }
}