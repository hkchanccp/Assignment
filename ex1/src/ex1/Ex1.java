/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
import java.util.Scanner;
/**
 *
 * @author hkcha
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner s = new Scanner(System.in);
        
        //get weight
        System.out.print("Please enter your weight in kg: ");
        float weight = s.nextFloat();
        
        //get height
        System.out.print("Please enter your height in cm: ");
        float height = s.nextFloat();

        // multiplication 100*100 for m to cm  
        float FC = (100*100*weight)/(height*height);
        
        //print result
        System.out.println("Your Fat Coefficient is: "+FC);
        printresult(FC);
    }
    
    private static void printresult(float FC) {
        //analsis the user bmi
        if(FC > 25) {
            System.out.println("Too Fat, need to keep fit!");
        }else if (FC < 15) {
            System.out.println("Too Thin, need to keep fat!");
        }else {
            System.out.println("Just fit, keep on!");
        }
    }
}
