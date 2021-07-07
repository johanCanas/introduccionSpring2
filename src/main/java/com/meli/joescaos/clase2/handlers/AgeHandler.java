package com.meli.joescaos.clase2.handlers;

import java.time.LocalDate;
import java.time.Period;

public class AgeHandler {

    public static String getAge(int day, int month, int year){

        LocalDate l = LocalDate.of(year, month, day); //specify year, month, date directly
        LocalDate now = LocalDate.now(); //gets localDate
        Period diff = Period.between(l, now); //difference between the dates is calculated

        return diff.getYears() + " años " + diff.getMonths() + " meses " + diff.getDays() + " días";
    }
}
