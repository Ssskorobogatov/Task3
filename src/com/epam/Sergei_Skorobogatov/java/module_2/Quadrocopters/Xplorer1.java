package com.epam.Sergei_Skorobogatov.java.module_2.Quadrocopters;

import com.epam.Sergei_Skorobogatov.java.module_2.Fleet;

public class Xplorer1 extends Fleet {
    public Xplorer1(int year, int capacity, int seats, int distance, String mark) {
        super(year, capacity, seats, distance, mark);
    }
    public void descriptionOfXplorer1(){
        System.out.println("Характеристики квадрокоптера " + this.mark + ": " + "Год производства " + this.year + "; " + "грузоподъемность " + this.capacity + " кг; " + "дальность полета " + this.distance + " км.");
    }
}
