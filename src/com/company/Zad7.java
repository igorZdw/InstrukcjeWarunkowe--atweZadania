package com.company;

import java.util.Scanner;

//Odczytaj wprowadzony wyraz przez użytkownika i sprawdź czy pierwsza literawyrazu jest taka sama jak ostatnia. Wpisz odpowiedni komunikat
public class Zad7 {
    public void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("Podaj slowo");
        String word=scanner.next();
        if(word.charAt(0)==word.charAt(word.length()-1))
            System.out.println("Pierwsza litera wyrazu jest taka sama jak ostatnia");
        else
            System.out.println("Pierwsza litera wyrazu różni się od ostatniej");
    }
}
