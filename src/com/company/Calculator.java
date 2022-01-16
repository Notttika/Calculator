package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {
    private String operation;
    private Scanner scanner;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    public void calculate(){
        while (!"q".equals(operation)) {
            try {
                System.out.println(calculationStep());
            } catch (NumberFormatException ex){
                System.out.println("Wrong input data!");
            }
        }
    }

    private double calculationStep() {
        System.out.println("enter first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("enter second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("enter operation: +, -, *, /, to perform or q if you want to quit:");


        operation = scanner.nextLine();



        return performOperation(firstNumber, secondNumber);
    }

    private double performOperation(int firstNumber, int secondNumber) {
        double result;

        switch (operation){
            case "+":
                result = plus(firstNumber, secondNumber);
                break;
            case "-":
                result = minus(firstNumber, secondNumber);
                break;
            case "*":
                result = multiply(firstNumber, secondNumber);
                break;
            case "/":
                result = division(firstNumber, secondNumber);
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }

    private double plus(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    private double minus(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }
    private double multiply(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
    private double division(int numberOne, double numberTwo){
        return numberOne / numberTwo;
    }

}
