public class rmv_spc_chr {
    public static void main(String[] args) {
        String str="@%%$mija";
        System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));
    }
}
