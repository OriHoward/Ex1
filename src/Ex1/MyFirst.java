package Ex1;

import java.util.Scanner;

public class MyFirst {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 natural numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int num1, num2;
        if (x < y) {
            num1 = x;
            num2 = y;
        } else {
            num1 = y;
            num2 = x;
        }
        int divider = 2;
        int isprime = 2;
        int Ans = 1;
        int Remainder;

        while (divider <= num1) {
            if (num1 % divider == 0 && num2 % divider == 0 && divider == 2) {
                Ans = 2;
                divider++;
            } else if (num1 % divider == 0 && num2 % divider == 0) {
                isprime = 2;
                while (isprime < divider) {
                    Remainder = (divider % isprime);
                    if (Remainder == 0) {
                        break;
                    } else if (Remainder != 0 && (divider - 1 == isprime)) {
                        Ans = divider;
                        isprime++;
                    } else {
                        isprime++;
                    }
                }
                divider++;
            } else {
                divider++;
            }
        }


        System.out.println("The GCD which is prime: " + Ans);


    }
}



