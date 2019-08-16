package com.epam.Sergei_Skorobogatov.java.lesson3.task3.Helicopters;

import com.epam.Sergei_Skorobogatov.java.lesson3.task3.Info;
import com.epam.Sergei_Skorobogatov.java.lesson3.task3.Fleet;

public class Bell205 extends Fleet implements Info {
    public Bell205(int year, int capacity, int seats, int distance, String mark) {
        super(year, capacity, seats, distance, mark);
    }

    @Override
    public void showInfo() {
        System.out.println("Характеристики вертолета " + this.mark + ": " + "Год производства " + this.year + "; " + "грузоподъемность " + this.capacity + " кг; " + "количество пассажирских мест " + this.seats + " чел; " + "дальность полета " + this.distance + " км.");
    }
}
