package com.company;
//Napisz program sprawdzajacy czy podany wyraz jest kodem pocztowym
public class Zad11 {
    public boolean isZipCode(String word) {
        if (word.length() == 6 && Character.isDigit(word.charAt(0)) && Character.isDigit(word.charAt(1))
                && Character.isDigit(word.charAt(3)) && Character.isDigit(word.charAt(4)) && Character.isDigit(word.charAt(5))
                && word.contains("-")) {
            return true;
        }
        else return false;
    }
}
