/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

/**
 *
 * @author xaviergreer
 */
import java.util.Scanner;

public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Average;
        double Number1, Number2, Number3, Number4;
        
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        // Get the hours worked by each employee.
        System.out.println("Enter the First Number: ");
        Number1= keyboard.nextInt();
        System.out.println("Enter the Second Number: ");
        Number2= keyboard.nextInt();
        System.out.println("Enter the Third Number: ");
        Number3= keyboard.nextInt();
        System.out.println("Enter the Fourth Number: ");
        Number4= keyboard.nextInt();
        
        //Average is calculated and printed.
        Average= (Number1+Number2+Number3+Number4)/2;
        System.out.println("First Number:\t" + Number1 + "\n Second Number:\t" + Number2 +
                           "\n Third Number:\t" + Number3 + "\n Fourth Number:\t" + Number4);
        System.out.println("The average for the 4 numbers is: " + Average);
        
    }
    
}
