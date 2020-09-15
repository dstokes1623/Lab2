
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
public class BarChart {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
        //prompt user to enter today's sales for 5 stores
        System.out.println("Enter today's sales for store 1:");
        double storeOneSales = keyboard.nextDouble();
        
        System.out.println("Enter today's sales for store 2:");
        double storeTwoSales = keyboard.nextDouble();
        
        System.out.println("Enter today's sales for store 3:");
        double storeThreeSales = keyboard.nextDouble();
        
        System.out.println("Enter today's sales for store 4:");
        double storeFourSales = keyboard.nextDouble();
        
        System.out.println("Enter today's sales for store 5:");
        double storeFiveSales = keyboard.nextDouble();
        // divide user entered numbers by 100 and save
       
        double storeOneGraphScale = storeOneSales / 100;
        double storeTwoGraphScale = storeTwoSales / 100;
        double storeThreeGraphScale = storeThreeSales / 100;
        double storeFourGraphScale = storeFourSales / 100;
        double storeFiveGraphScale = storeFiveSales / 100;
        
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        
        System.out.println("Sales Chart");
        System.out.println("Store 1: ");
       
        while(i <= storeOneGraphScale){
            System.out.print("*");
            i++;
    }
       
        System.out.println("Store 2: ");
        while(j <= storeTwoGraphScale){
            System.out.print("*");
            j++;
    }
        
        System.out.println("Store 3: ");
        while(k <= storeThreeGraphScale){
            System.out.print("*");
            k++;
    }
        
        System.out.println("Store 4: ");
        while(l <= storeFourGraphScale){
            System.out.print("*");
            l++;
    }
        
        System.out.println("Store 5: ");
        while(m <= storeFiveGraphScale){
            System.out.print("*");
            m++;
    }
    }
}
