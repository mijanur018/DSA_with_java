// import java.util.Arrays;

// public class print_dup {
//     public static void main(String[] args) {
//         String str = "hello world";
//         dupString(str);
//     }

//     public static void dupString(String str) {
//         // int count[] = new int[26];
//         // for (int i = 0; i < str.length(); i++) {
//         // System.out.println(str.charAt(i) + ":" + count[(str.charAt(i) - 'a')]++);
//         // }
//         char p[] = str.toCharArray();
//         Arrays.sort(p);
//         System.out.println(p);
//         for (int i = 0; i < p.length-1; i++) {
//             if (p[i] == p[i+1]) {

//                 System.out.println("duplicate: " + p[i] );
//             }
//         }

//     }

// }

import java.util.Arrays;

public class print_dup {
    public static void main(String[] args) {
        String str = "hello world";
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Iterate through the sorted array to find duplicate characters
        System.out.println("Duplicate characters in the string '" + str + "':");
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                System.out.println(charArray[i]);
            }
        }
    }
}

