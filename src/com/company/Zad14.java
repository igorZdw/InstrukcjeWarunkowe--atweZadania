package com.company;
//Odczytaj 3 liczby i sprawdz czy jest mozliwe otrzymanie z dwoch liczb trzeciej(jako suma_
public class Zad14 {
    public boolean isPossible(int a,int b,int c){
        if(a+b==c||a+c==b||b+c==a) {
            System.out.println("Jest mozliwe uzyskanie sumy ");
            return true;
        }
        else System.out.println("Nie jest mozliwe uzyskanie sumy");
        return false;


    }
}
