package Lab1;

import java.util.Scanner;

import static java.lang.Character.isWhitespace;
import static java.lang.Character.toUpperCase;

public class MultiDimensionalArray {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char[][] array = new char[3][60];

        /*System.out.println("Enter 1st string: ");
        char[] s1 = scan.nextLine().toCharArray();
        for(int i = 0, j = s1.length - 1; i < s1.length; i++ , j--){
            array[0][i] = s1[j];
        }*/

        System.out.println("Enter 2nd string: ");
        char[] s2 = scan.nextLine().toCharArray();
        int[] index = new int[]{};
        for(int i = s2.length - 1, j = 0; i >= 0; i--){
            if(isWhitespace(s2[i])){
                index[j] = i;
                j++;
            }
        }
        char[] temp1 = new char[]{};
        for (int i = 0, j = 0; i < index[j]; i++){

        }

        char[] s2a = new char[s2.length];
        int k = index.length - 1;
        for(int i = 0, j = index[k]; i < s2.length; i++, j++){
            if (j == s2.length - 1)
                s2a[i] = s2[j];
        }

        /*System.out.println("Enter 3rd string: ");
        char[] s3 = scan.nextLine().toCharArray();
        for(int i = 0; i < s3.length; i++){
            if(i % 5 == 0)
                array[2][i] = toUpperCase(s3[i]);
            else
                array[2][i] = s3[i];
        }
        System.out.print("The 1st string is: ");
        for(int i = 0; i < s1.length; i++){
            System.out.print(array[0][i]);
        }
        System.out.print("\nThe 3rd string is: ");
        for(int i = 0; i < s3.length; i++){
            System.out.print(array[2][i]);
        }*/
    }
}
