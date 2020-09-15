
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
public class TestScores {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Prompt user to input first test score
        //Assign value to variable
        
        System.out.println("Enter first test score as a percent");
        double firstScore = keyboard.nextDouble();
        
        //Prompt user to input second test score
        //Assign second value to variable
        
        System.out.println("Enter second test score as a percent");
        double secondScore = keyboard.nextDouble();
        
        //Prompt user to input third test score
        //Assign third value to variable
        
        System.out.println("Enter third test score as a percent");
        double thirdScore = keyboard.nextDouble();
        
        //Create variable for average of test scores and calculate
        //Display average test score
        
        double averageScore = (firstScore + secondScore + thirdScore) / 3;
        System.out.println("Your average test score was: " + averageScore);
        
        // Assign scores to letter grades
        //Display letter grade
       
        String letterGrade = "" ;
        
        if (averageScore >= 90){
            letterGrade = "A";
        }
        if (averageScore >= 80 && averageScore <= 89){
            letterGrade = "B";
        }
        if (averageScore >= 70 && averageScore <= 79){
            letterGrade = "C";
        }
        if (averageScore >= 60 && averageScore <= 69){
            letterGrade = "D";
        }
        if (averageScore <= 59){
            letterGrade = "F";
        }
        
        
        System.out.println("Your letter grade was: " + letterGrade);        
        
        
        
        
    }
    
}
