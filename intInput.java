/*
1. Write a Java program that reads a numeric input from the user. Call the input
method in a try block and catch the specific exception that the input method would
throw if the user entered a non-numeric input.
Hint : import java.util.InputMismatchException
*/

//scanner - import.java.util.scanner
import java.util.*;

class intInput{
    public static void main(String args[]){
        System.out.println("enter a number: ");
        Scanner sc=new Scanner(System.in);
        try{
        float n=sc.nextFloat();
         System.out.println("numeric input is entered");
        }
        catch(InputMismatchException ime){
            System.out.println(ime);//tostring is printed
            System.out.println(ime.getMessage());
          //  ime.printStackTrack();
        }

    }
}