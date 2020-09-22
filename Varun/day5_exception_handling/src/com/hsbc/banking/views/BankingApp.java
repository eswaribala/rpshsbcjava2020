package com.hsbc.banking.views;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingApp {
    static int numbers[];
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        int score  = 0;
        StackTraceElement[] stackTraceElements;
        try{
            score  = scanner.nextInt();
            scanner.nextLine();
            System.out.println(score);
            System.out.println(args[1]);
            System.out.println(numbers.length);
        }
        catch (Exception exception){
            exception.printStackTrace();
            /*for(StackTraceElement stackTraceElement:stackTraceElements){
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("Exception Class: " + stackTraceElement.getClass());
                System.out.println("App Class Name: " + stackTraceElement.getClassName());
                System.out.println("Line: " + stackTraceElement.getLineNumber());
                System.out.println("Method Name: " + stackTraceElement.getMethodName());
                System.out.println("File Name: " + stackTraceElement.getFileName());
                System.out.println("Method Name: " + stackTraceElement.getMethodName());
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            }*/
            System.out.println("Exception: "+exception);
        }
        /*catch (NullPointerException nullPointerException){
            System.out.println("Array points to no object: " + nullPointerException.getMessage());
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("Incorrect input given: " + inputMismatchException.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Array input out of bound: " + arrayIndexOutOfBoundsException.getMessage());
        }*/
        finally {
            // use finally block to close connections like scanner, files etc, do not use Sys.out here
            scanner.close();
        }
        System.out.println("Out");
    }
}
