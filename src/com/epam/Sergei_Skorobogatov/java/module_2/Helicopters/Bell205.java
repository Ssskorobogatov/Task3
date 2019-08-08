package com.epam.Sergei_Skorobogatov.java.module_2.Helicopters;

import com.epam.Sergei_Skorobogatov.java.module_2.Fleet;

public class Bell205 extends Fleet {
    public Bell205(int year, int capacity, int seats, int distance, String mark) {
        super(year, capacity, seats, distance, mark);
    }

    public void descriptionOfBell205() {
        System.out.println("Характеристики вертолета " + this.mark + ": " + "Год производства " + this.year + "; " + "грузоподъемность " + this.capacity + " кг; " + "количество пассажирских мест " + this.seats + " чел; " + "дальность полета " + this.distance + " км.");
    }
}
