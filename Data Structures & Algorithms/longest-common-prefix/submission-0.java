class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String s1= strs[0];
        String s2 = strs[n-1];
        String res = "";
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                res = res + s1.charAt(i);
            }
            else{
                break;
            }
        }
        return res;
    }
}