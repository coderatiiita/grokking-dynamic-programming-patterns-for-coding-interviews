package com.example.FibonacciNumbers;

public class FibonacciNumbers {
    public int CalculateFibonacci(int n) {
        // TODO: Write your code here
        return f(n);
    }

    private int f(int n) {
        if(n==0 || n==1)    return n;
        return f(n-1)+f(n-2);
    }

    public static void main(String[] args) {
        FibonacciNumbers fib = new FibonacciNumbers();
        System.out.println("5th Fibonacci is ---> " + fib.CalculateFibonacci(5));
        System.out.println("6th Fibonacci is ---> " + fib.CalculateFibonacci(6));
        System.out.println("7th Fibonacci is ---> " + fib.CalculateFibonacci(7));
    }
}
