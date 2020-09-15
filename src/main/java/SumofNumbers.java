
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class SumofNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter a positive nonzero integer");
        int userNumber = keyboard.nextInt();
        int sum = 0;
        int i = 0;
        
        while(i <= userNumber){
            sum += i;
            i++;
        }
        System.out.println("The sum of the integers 1 to your number is " + sum);
    }
}
