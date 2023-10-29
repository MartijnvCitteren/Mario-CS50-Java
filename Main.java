package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = askSize();

        // defining building blocks
        String space = " ";
        String block = "#";

        for(int i = 0; i < size; i++){
            // define a count variable that starts on '0' for recursive methods
            int count = 0;
            printBuildingBlocks(space, (size - (1 + i)), count);
            printBuildingBlocks(block, (i + 1), count);
            // print white space between both pyramids
            System.out.print("  ");
            printBuildingBlocks(block, (i + 1), count);
            System.out.print("\n");
        }
    }

    static int askSize() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What should be the size of the pyramid? \n");
        int height = userInput.nextInt();

        int tries = 0;
        while ((height < 2) || (height > 8) && (tries < 3)){

            System.out.println("What should be the size of the pyramid? This number should be between 2 and 8. \n");
            height = userInput.nextInt();
            tries++;
        }
        if (tries > 2){
            System.out.println("To many wrong numbers - exit");
            System.exit(0);
        }
        System.out.println(height);
        return height;
    }

    static void printBuildingBlocks(String value, int n, int count){
        if (count < n){
            System.out.print(value);
            count++;
            printBuildingBlocks(value, n, count);
        }
    }
}



