package com.epam.Sergei_Skorobogatov.java.lesson3.task3.Quadrocopters;

import com.epam.Sergei_Skorobogatov.java.lesson3.task3.Fleet;
import com.epam.Sergei_Skorobogatov.java.lesson3.task3.Info;

public class Xplorer1 extends Fleet implements Info {
    public Xplorer1(int year, int capacity, int seats, int distance, String mark) {
        super(year, capacity, seats, distance, mark);
    }

    @Override
    public void showInfo() {
        System.out.println("Характеристики квадрокоптера " + this.mark + ": " + "Год производства " + this.year + "; " + "грузоподъемность " + this.capacity + " кг; " + "дальность полета " + this.distance + " км.");
    }
}
