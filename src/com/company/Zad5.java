package com.company;
//Napisz kod, który odczytuje 3 liczby i wypisuje na ekran najmniejszą z nich.
public class Zad5 {
    public int myMethod(int a,int b, int c){
        int min = a;
        if(b<a)
            min=b;
        else min=a;
        if(c<min)
            min=c;
        return min;
    }
}
