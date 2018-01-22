package Lab1;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args){
        int numArgs = args.length;
        System.out.print("The " + numArgs + " numbers are: ");
        for(int i = 0; i < args.length; i++){
            System.out.print(args[i] + " ");
        }

    }
}
