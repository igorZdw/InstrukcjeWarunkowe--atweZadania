package com.company;
//Odczytaj wiek osoby i sprawdz czy jest pelnoletnia czy nie
public class Zad13 {
    public boolean isAdult(int age) {
        if (age >= 18) {
            System.out.println("Osoba jest pelnoletnia");
            return true;
        }else
            System.out.println("Osoba jest niepełnoletnia");
        return false;
    }
}