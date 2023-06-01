package org.example.mathutil.core;

public class MathUtil {
    public static long  Factorial(int n ){
        if (n<0 || n>20)
            throw new IllegalArgumentException("Invalid argument. N should between 0 and 20");
        if (n== 0|| n==1)
            return 1;
        long product =1;
        for(int i =2;i<=n;i++)
            product *=i;
        return product;
    }
}
