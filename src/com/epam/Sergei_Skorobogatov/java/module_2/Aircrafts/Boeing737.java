package com.epam.Sergei_Skorobogatov.java.module_2.Aircrafts;

import com.epam.Sergei_Skorobogatov.java.module_2.Fleet;

public class Boeing737 extends Fleet {

    public Boeing737(int year, int capacity, int seats, int distance, String mark) {
        super(year, capacity, seats, distance, mark);
    }

    public void descriptionOfBoeing737() {
        System.out.println("Характеристики самолета " + this.mark + ": " + "Год производства " + this.year + "; " + "грузоподъемность " + this.capacity + " кг; " + "количество пассажирских мест " + this.seats + " чел; " + "дальность полета " + this.distance + " км.");
    }
}



