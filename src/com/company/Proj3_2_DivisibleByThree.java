package com.company;

import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter any number: ");
        number = scanner.nextInt();
        if(number%3==0){
            System.out.println("The entered number is divisible by 3");
        }
        else
        {
            System.out.println("The entered number is NOT divisible by 3");
        }
    }
}