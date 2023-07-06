class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] check_s = new int[27];
        int[] check_t = new int[27];
        
        if(s.length() != t.length()) return false;
        
        for(int i =0 ; i<s.length(); i++){
            char cs = s.charAt(i);
            check_s[cs - 'a'] ++;
            
            char ts = t.charAt(i);
            check_t[ts - 'a'] ++;
            
        }
        
        for(int i =0 ; i<27; i++){
            if(check_s[i] != check_t[i]) return false;
        }
        
        return true;
        
    }
}