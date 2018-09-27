/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.util.Scanner;

/**
 * @author Euddy Valdez
 * 
 * Done from 
 * Java for total beginners - Easy-to-follow Java programming
 * By 
 * Duckademy IT courses
 * at
 * https://www.udemy.com/easy-to-follow-java-programming/
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Give in the Celsius value:");
        Scanner sc = new Scanner(System.in);
        /* Add import from java.util.Scanner.
        Learn what import is,
        what is java.util.scanner and how to use it
        */
        double celsius = sc.nextDouble();
        double fahrenheit = 9.0 / 5.0 * celsius + 32.0;
        System.out.println("Fahrenheit: " +fahrenheit);
    }
    
}
