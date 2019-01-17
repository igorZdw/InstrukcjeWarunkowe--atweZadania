package com.company;
//Odczytaj 2 wyrazy i sprawdź czy wprowadzone wyrazy są równe.
public class Zad8 {
    public void myMethod(String word,String secondWord){
        if(word.equals(secondWord))
            System.out.println("Podane wyrazy są takie same");
        else
            System.out.println("Podane wyrazy są różne");
    }
}
