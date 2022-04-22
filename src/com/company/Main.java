package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        char [][] board = generateRandom();
    }
    public static char [][] generateRandom(){
        char [][] board = new char[10][10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            board[random.nextInt(9)][random.nextInt(9)] = 'T';
        }
        return board;
    }
    public static int userGuess(){
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        
    }


}
