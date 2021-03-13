package com.company;

public class CustomMath {
    //    5. create a function in class CustomMath that returns the next prime.
    //    If the number is prime, return the number itself.
    //    Examples
    //    nextPrime(12) ➞ 13
    //    nextPrime(24) ➞ 29
    //    nextPrime(11) ➞ 11
    //    11 is a prime, so we return the number itself.
    public static int nextPrime(int number) {
        boolean loop = true;
        while (loop) {
            boolean isPrime = true;
            for (int i = 2; i <= (int) Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) {
                number++;
            } else {
                loop = false;
            }
        }
        return number;
    }


}
