/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_week14_collectionsanditerators;

/**
 *
 * @author maazh
 */
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

public class ParenMatch {

    public static void main(String[] args) {
        Stack s = new Stack();
        String line; // the string of characters to be checked 
        Scanner scan = new Scanner(System.in);
        System.out.println("\nParenthesis Matching");
        System.out.print("Enter a parenthesized expression: ");
        line = scan.nextLine();
        // loop to process the line one character at a time 
        // print the results 
        Stack parenNum = new Stack();
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i)== '('){
                parenNum.push(line.charAt(i));
                count++;
            }
            else if (line.charAt(i)== ')'){
                if(parenNum.isEmpty()){
                    count = -1;
                    break;
                }
                parenNum.pop();
                count--;
            }   
        }
        
        if(count > 0){
            System.out.println("Extra left parenthesis");
        }
        else if(count < 0){
            System.out.println("Extra right parenthesis");
        }
        else{
            System.out.println("Perfectly written Equation, Amazing!");
        } 
    }
}
