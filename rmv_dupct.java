import java.util.LinkedHashSet;

public class rmv_dupct {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(rmv(str));
    }

    public static String rmv(String str) {
        String p="";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (Character r : set) {
            p=p+(Character.toString(r));
        }
        return p;

        // StringBuilder sb=new StringBuilder();
        // for(int i=0;i<str.length();i++){
        // boolean repeated=false;
        // for(int j=i+1;j<str.length();j++){
        // if (str.charAt(i)==str.charAt(j)) {
        // repeated=true;
        // break;
        // }
        // }
        // if (!repeated) {

        // sb.append(str.charAt(i));

        // }
        // }
        // System.out.println(sb);
    }

}
