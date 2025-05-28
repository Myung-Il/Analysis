/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mokpo.my_project_fin;

public class Ctl_inputCheck {
    public boolean idCheck(String id) {
    if (id == null || id.isEmpty()) return false;

    int minLength = 5;
    int maxLength = 20;
    if (id.length() < minLength || id.length() > maxLength) return false;

    for (int i = 0; i < id.length(); i++) {
        char c = id.charAt(i);
        if (!Character.isLetterOrDigit(c)) return false;
    }

    return true;      
    }

    public void Operation1() {
    }
}
