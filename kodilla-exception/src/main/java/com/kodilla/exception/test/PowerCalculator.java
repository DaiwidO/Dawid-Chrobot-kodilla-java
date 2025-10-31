package com.kodilla.exception.test;

public class PowerCalculator {

    public int power(int base, int exp) throws Exception {

        if (base == 0 && exp == 0) {
            throw new Exception("Nie można obliczyć 0^0 - wynik jest nieokreślony!");
        }

        if (exp == 0) {
            return 1;
        }

        if (exp == 1) {
            return base;
        }

        if (base == 0) {
            return 0;
        }

        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();

        try {
            System.out.println("2^4 = " + calculator.power(2, 4));
            System.out.println("3^3 = " + calculator.power(3, 3));
            System.out.println("4^0 = " + calculator.power(4, 0));
            System.out.println("0^5 = " + calculator.power(0, 5));
            System.out.println("0^0 = " + calculator.power(0, 0));
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        } finally {
            System.out.println("Program zakończył działanie.");
        }
    }
}