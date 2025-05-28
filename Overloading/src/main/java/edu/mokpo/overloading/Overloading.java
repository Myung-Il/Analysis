/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.mokpo.overloading;

import java.util.Scanner;

/**
 * 메인 클래스
 * @author 김태랑
 */
public class Overloading {
    /**
     * 메인
     * @param args String[]
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int first, second;
        int result;
        
        print("First Num Input : ");
        first = sc.nextInt();
        print("Second Num Input : ");
        second = sc.nextInt();
        
        Operation op = new Operation();
        result = op.add(first, second);
        
        println("Result Print : " + result);
        println("Result Print : " + op.add(0.1, 1));
        println("Result Print : " + op.add(1, 0.1));
        println("Result Print : " + op.add(1.1, 0.1));
    }
    
    /**
     * 출력 축약 함수
     * @param str String
     */
    static void print(String str) { System.out.print(str); }
    
    /**
     * 출력 축약 함수
     * @param str String
     */
    static void println(String str) { System.out.print(str); }
}