package com.company;
//Napisz program ktory odczytuje slowo i sprawdza czy dany String jest poprawnym adresem url
public class Zad9 {
    public boolean isCorrect(String word){
        if(word.startsWith("http://")||word.startsWith("https://")) {
            System.out.println("Jest to poprawny adres url");
            return true;
        }
            else
            System.out.println("Jest to niepoprawny adres url");
            return false;
        }
    }

