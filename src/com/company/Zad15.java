package com.company;
//Nastolatek jest w wieku miedzy 13 a 18 lat.Odczytaj 2 liczby oznaczajace wiek 2 osob, jesli obie sa w wieku nastolatka napisz tak w przeciwnym
//wypadku napisz nie
public class Zad15 {
    public String isTeen(int a, int b) {
        if ((a > 13 && a < 18)&&(b > 13 && b < 18)){
            return "Tak";

        }else return "Nie";
    }
}