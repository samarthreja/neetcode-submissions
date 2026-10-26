
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int x : count) {
            if (x == 0) {
                continue;
            }
            // Initial window is not a match.
            break;
        }

        if (matches(s1, s2, 0)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - s1.length()) - 'a']++;

            boolean valid = true;
            for (int x : count) {
                if (x != 0) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(String s1, String s2, int start) {
        int[] a = new int[26];
        int[] b = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(start + i) - 'a']++;
        }

        return java.util.Arrays.equals(a, b);
    }
}
