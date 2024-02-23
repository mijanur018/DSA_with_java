public class sentenc_into_mobnno {
    public static void main(String[] args) {
        String S = "GFG";
        System.out.println(printSequence(S));
    }
    public static String printSequence(String S) 
    { 
        // code here
         String str[]={"2" , "22" , "222" , "3" , "33" , "333" , "4" , "44" , 
        "444" , "5" , "55" , "555" , "6" , "66" , "666" , "7" , "77" , "777" , "7777" ,
        "8" , "88" , "888" , "9" , "99" ,"999" , "9999"};
        int n=S.length();
        String ans="";
        for(int i=0;i<n;i++)
        {
            if(S.charAt(i) == ' ')
            {
                ans=ans+"0";
            }
            else
            {
                int p=S.charAt(i)-'A';
                ans=ans+str[p];
            }
        }
        return ans;
    }
}
