package com.pczyz.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.String.format;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        Fibonacci fibonacci = new Fibonacci(false);

        System.out.println("Fibonacci calculator. Default method is Iteratively.");
        try {
            while(true) {
                System.out.println("Provide a number >= 0, 'm' to change method or 'q' to exit:");
                String line = reader.readLine();
                if (line.equals("q")) {
                    System.out.println("EXITING");
                    break;
                }
                if (line.equals("m")) {
                    boolean isRecursively = fibonacci.isRecursively();
                    fibonacci.changeMethod();
                    System.out.println("Method changed to " + (isRecursively ? " iteratively" : " recursively"));
                    continue;
                }
                int number;
                try {
                    number = Integer.parseInt(line);
                    if (number < 0) {
                        System.out.println("Wrong value provided. Try Again.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Wrong value provided. Try Again.");
                    continue;
                }
                long result = fibonacci.getValue(number);
                System.out.println(format("Result: %s", result));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
