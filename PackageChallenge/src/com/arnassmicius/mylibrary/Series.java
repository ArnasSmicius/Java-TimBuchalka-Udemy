package com.arnassmicius.mylibrary;

/**
 * Created by Arnas on 2017.05.18.
 */
public class Series {

    public static int nSum(int n){
        int result = 0;
        for(int i = 1; i <= n; i++){
            result+=i;
        }
        return result;
    }

    public static int factorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static int fibonacci(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
