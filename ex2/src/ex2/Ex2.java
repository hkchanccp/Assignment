/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author hkcha
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create scanner
        Scanner s = new Scanner(System.in);
        
        //get Total Cholesterol
        System.out.print("Please enter your Total Cholesterol : ");
        double TC = s.nextFloat();
        
        //get HDL cholesterol
        System.out.print("Please enter your HDL cholesterol : ");
        double HDLC = s.nextFloat();

        //get triglyceride
        System.out.print("Please enter your triglyceride : ");
        double TG = s.nextFloat();
        
        // calculate LDLC
        double LDLC = TC-HDLC-(TG/5);
        
        //print result
        System.out.println("Your LDLC is: "+ LDLC);
    }
    
}
