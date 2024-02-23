public class rmv_consctiv_ch {
    public static void main(String[] args) {
        String S = "aabb";
        System.out.println(removeConsecutiveCharacter(S));
    }

    public static String removeConsecutiveCharacter(String S) {
        StringBuilder str = new StringBuilder();
        str.append(S.charAt(0));
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != S.charAt(i - 1)) {
                str.append(S.charAt(i));
            }
        }
        return str.toString();
    }
}
