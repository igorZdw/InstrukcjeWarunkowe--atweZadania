package com.company;
//Odczytaj wyraz i sprawdź czy ostatnia litera to M bądź m.
public class Zad6 {
    public void myMethod(String word){
        if(word.endsWith("M")||word.endsWith("m"))
            System.out.println("Wyraz kończy się na M lub m");
        else System.out.println("Wyraz nie kończy się na litere m");
    }
}
