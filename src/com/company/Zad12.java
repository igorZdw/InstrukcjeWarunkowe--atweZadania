package com.company;
//Sprawdz czy wprowadzona liczba jest podzielna przez 3 lub 5
public class Zad12 {
    public boolean isDivideBy(int number){
        if(number%3==0||number%5==0) {
            System.out.println("Liczba jest podzielna przez 3 lub 5");
            return true;
        }else
        return false;
    }
}
