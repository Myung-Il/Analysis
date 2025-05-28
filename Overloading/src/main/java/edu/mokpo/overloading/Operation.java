/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mokpo.overloading;

/**
 * 사칙연산하는 클래스
 * @author 김태랑
 */
public class Operation {
    /**
     * 더하기
     * @param a int
     * @param b int
     * @return  int
     */
    protected int add(int a, int b){ return a+b; }
    
    /**
     * 더하기
     * @param a double
     * @param b int
     * @return  double
     */
    protected double add(double a, int b){ return a+b;}
    
    /**
     * 더하기
     * @param a int
     * @param b double
     * @return  double
     */
    protected double add(int a, double b){ return a+b;}
    
    /**
     * 더하기
     * @param a double
     * @param b double
     * @return  double
     */
    protected double add(double a, double b){ return a+b;}
}
