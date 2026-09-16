class Solution {
    public boolean isPalindrome(String s) {
        String st = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = st.length();
        int l = 0;
        int r = n-1;
        while(l<r){
            if(st.charAt(l) != st.charAt(r)){
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;
    }
}
