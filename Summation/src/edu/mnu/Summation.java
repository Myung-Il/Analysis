/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

 */
package edu.mnu;

import java.util.Scanner;

/**
 *
 * @author MNU
 */
public class Summation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 변수 만들기
        int firstNo, secondNo;
        int sum;
        // 입력 처리
        Scanner scan = new Scanner(System.in);
                
        // 두 수 입력
        System.out.print("first num input : ");
        firstNo = scan.nextInt();
        
        System.out.print("second num input : ");
        secondNo = scan.nextInt();
        
        // 합계내기
        sum = add(firstNo, secondNo);
        
        // 출력하기
        System.out.println("sum : "+ sum);
    }

    private static int add(int firstNo, int secondNo) {
        return firstNo + secondNo;
    }
    
}
