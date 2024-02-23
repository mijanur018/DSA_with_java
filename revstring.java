public class revstring {
    public static void main(String[] args) {
        String str="mijanur";
        char chrarr[]=str.toCharArray();
        int len=chrarr.length;
        // approach 1
        for(int i=len-1;i>=0;i--)
        {
            System.out.print(chrarr[i]);
        }
        System.out.println();
        // approach 2
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        // approach 3
        StringBuffer sr =new StringBuffer(str);
        System.out.println(sr.reverse());


    }
}



