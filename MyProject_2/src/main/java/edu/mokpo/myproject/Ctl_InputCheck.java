/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mokpo.myproject;

/**
 *
 * @author user
 */
public class Ctl_InputCheck {
    
    public boolean idChekc(String id){
       // 검사하기
        if (id == null || id.isEmpty()) {
            return false; // ID가 null이거나 비어있으면 유효하지 않음
        }

        int minLength = 5;
        int maxLength = 20;
        if (id.length() < minLength || id.length() > maxLength) {
            return false; // ID 길이가 범위를 벗어나면 유효하지 않음
        }

        // 영문자와 숫자로만 구성되어 있는지 확인
        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false; // 영문자나 숫자가 아니면 유효하지 않음
            }
        }

        return true; // 모든 검사를 통과하면 유효함              

    }
    
}
