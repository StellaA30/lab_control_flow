package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, let's play a guessing game");
        int secret_number = 7;
//        user input
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();

//        conditionals to check if user guessed correctly
        if(guess < secret_number){
            System.out.println("Incorrect, your guess is too low, try again!");
        } else if(guess == secret_number){
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("Incorrect, your guess is too high, try again!");
        }

    }
}