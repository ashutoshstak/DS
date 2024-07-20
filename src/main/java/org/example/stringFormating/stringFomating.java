package org.example.stringFormating;

public class stringFomating {
    public static void main(String[] args) {

        System.out.println(mergeAlternately("abc","pqr"));
        System.out.println(mergeAlternately("abcd","pq"));
    }

    public static String mergeAlternately(String word1, String word2) {

        // so what we need to so we need to merger both of the two string
        // we basically have to calculate the length of the two string
        String result = "";
          int i =0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
              //  result.append(word1.charAt(i));
                result = result+word1.charAt(i);
            }
            if (i < word2.length()) {
               // result.append(word2.charAt(i));
                result = result+word2.charAt(i);
            }
            i++;
        }

        return result;
    }
}
