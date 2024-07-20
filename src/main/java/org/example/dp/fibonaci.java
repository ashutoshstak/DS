package org.example.dp;

public class fibonaci {
    public static void main(String[] args) {
        System.out.println(fib(11));
        System.out.print(fibloop(11));
    }
  static int fib(int n){
     if(n == 0 ){
         return 0;
     }
     if(n == 1){
         return 1;
     }
     return fib(n - 1) + fib(n -2);
    }

    static int fibloop(int n){
        int prev = 0;
        int current = 1;
        int next = 0;

        for(int i=1; i<n; i++){
         next = prev + current;
         prev = current;
         current = next;

        }
        return  current;
    }
}
