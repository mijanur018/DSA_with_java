
import java.util.Arrays;

public class longest_cmn_prefix {
    public static void main(String[] args) {
        String strs[] = { "flowwer", "flow", "flight" };
        System.out.println(longest_cmn(strs));
    }

    public static String longest_cmn(String[]strs) {
        StringBuffer str = new StringBuffer();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for (int i = 0; i < first.length();i++) {
            if (first.charAt(i) == last.charAt(i)) {
                str.append(last.charAt(i));
            }
            else{
                break;
            }
        }
        return str.toString();
    }
}
