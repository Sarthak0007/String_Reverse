/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_reverse;

import java.util.Scanner;


public class String_Reverse {

   
    public static void main(String[] args) {
        String a ;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter a String to Reverse:");
        a =scn.nextLine();
        
        StringBuffer buff =new StringBuffer(a);
        
        System.out.println("Reversed String is:-");
        System.out.println(buff.reverse());
       
    }
    
}
