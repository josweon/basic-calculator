package com.pluralsight;

import java.util.*;

public class MyCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nPossible calculations: \n\t(A)dd\n\t(S)ubtract" +
                "\n\t(M)ultiply\n\t(D)ivide\nPlease select and option: ");

        String operator = scanner.nextLine();

//      System.out.println("%d * %d = " + (firstNumber * secondNumber), firstNumber, secondNumber);secondNumber

        switch (operator){
            case "A":
                double result = firstNumber + secondNumber;
                System.out.println("\n" + firstNumber + " + " + secondNumber + " = " + result);
                break;

            case "M":
                double result1 = firstNumber * secondNumber;
                System.out.println("\n" + firstNumber + " * " + secondNumber + " = " + result1);
                break;
            case "D":
                double result2 = firstNumber / secondNumber;
                System.out.println("\n" + firstNumber + " / " + secondNumber + " = " + result2);
                break;
            case "S":
                double result3 = firstNumber - secondNumber;
                System.out.println("\n" + firstNumber + " - " + secondNumber + " = " + result3);
                break;
            default:
                System.out.println("\nInvalid Operation.");
        }
    }
}
