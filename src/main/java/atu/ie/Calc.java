package atu.ie;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        //methods
        System.out.println("Please enter a number: ");
        Scanner scan1 = new Scanner(System.in);
        int firstNum = scan1.nextInt();
        System.out.println("Please enter a second number: ");
        int secondNum = scan1.nextInt();
        System.out.println("Choose an operation (add, subtract, multiply, divide): ");
        String operation = scan1.next();
        switch (operation) {
            case "add": add(firstNum, secondNum);break;
            case "subtract": subtract(firstNum, secondNum);break;
            case "multiply": multiply(firstNum, secondNum);break;
            case "divide": divide(firstNum, secondNum);break;
            default: System.out.println("Invalid operation"); break;

        }
    }
    public static void add(int firstNum, int secondNum)
    {
        int sum = firstNum + secondNum;
        System.out.println("The sum is: " + sum);
    }

    public static void subtract(int firstNum, int secondNum)
    {
        int sum = firstNum - secondNum;
        System.out.println("The sum is: " + sum);
    }

    public static void multiply(int firstNum, int secondNum)
    {
        int sum = firstNum * secondNum;
        System.out.println("The sum is: " + sum);
    }

    public static void divide(int firstNum, int secondNum)
    {
        int sum = firstNum / secondNum;
        System.out.println("The sum is: " + sum);
    }
}

