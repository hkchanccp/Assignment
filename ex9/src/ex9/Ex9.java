/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author hkcha
 */
public class Ex9 {
    public static int guess,anw, maxnum;
    public static Scanner scan;
    public static Random ran;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        ran = new Random();
        maxnum = 2000;
        anw = ran.nextInt(maxnum);
        System.out.print("Test anw "+anw +"\r\n" );
        System.out.println("Please guess the num: ");
        
        while (guess != anw){
            guess = scan.nextInt();
            if(guess > anw)
                System.out.println("Too high !");
            else if(guess < anw)
                System.out.println("Too low !");
            
        }
        System.out.println("You win");
    }
    
}
