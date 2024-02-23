import java.util.LinkedHashSet;

public class longest_substring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int right = 0, left = 0, max = 0;
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            if (set.add(c)) {
                max = Math.max(max, right - left + 1);
                right++;
            }
            else{
                while (s.charAt(left)!=c) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(c);left++;
            }
        }
        return max;
    }
}
