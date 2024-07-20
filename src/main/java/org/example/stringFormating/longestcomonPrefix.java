package org.example.stringFormating;

import java.lang.reflect.Array;
import java.util.Arrays;

public class longestcomonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

      String ans = "";

      for(int i=0;i<strs[0].length();i++){

          // we need a while to iltrate or to loop to every first element of the every word in the string
          int j = i;
          while(j<strs.length && strs[j].charAt(i) == strs[i].charAt(i)){
              ans += strs[j].charAt(i);
              j++;
          }

        }

      System.out.print(ans);
    }
}
