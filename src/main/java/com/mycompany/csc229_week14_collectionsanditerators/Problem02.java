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

public class Problem02 {

    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        Scanner StdIn = new Scanner("( 1 + 5 ) ");
        
        while(StdIn.hasNext()){
            String s = StdIn.next();
            if (s.equals("("));
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals(")")){
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("/")) v = vals.pop() / v;
                else if (op.equals("*")) v = vals.pop() * v;
                vals.push(v);
            }
            else vals.push(Double.parseDouble(s));
        }
        System.out.println(vals.pop());
    }
}
