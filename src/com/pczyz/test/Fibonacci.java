package com.pczyz.test;

class Fibonacci {

    private boolean recursively;

    public Fibonacci(boolean recursively) {
        this.recursively = recursively;
    }

    void changeMethod() {
        recursively = !recursively;
    }

    boolean isRecursively() {
        return recursively;
    }

    long getValue(int n) {
        return recursively ? rec(n) : iter(n);
    }

    private long rec(int n) {
        if (n==0) return 0;
        if (n==1 || n==2) return 1;
        return rec(n - 1) + rec(n - 2);
    }

    private long iter(int n) {
        if (n==0) return 0;
        if (n==1 || n==2) return 1;
        long a = 0;
        long b = 1;

        for (int i=2; i<=n; ++i) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

}
