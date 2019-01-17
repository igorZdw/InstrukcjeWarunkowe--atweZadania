package com.company;
//Napisz program, który odczytuje wyraz i sprawdza czy wprowadzone imię jest męskie czy żeńskie
public class Zad4 {
    public void myMethod(String word){
        if(word.endsWith("a"))
            System.out.println("Imie jest żeńsie");
        else System.out.println("Imie jest męskie");
    }
}
