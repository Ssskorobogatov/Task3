package com.epam.Sergei_Skorobogatov.java.module_2;

import java.util.Arrays;
import java.util.Scanner;

public class Aviapark {
    Fleet[] fleet;

    public Aviapark(Fleet[] fleet) {
        this.fleet = fleet;
    }

    public void sumOfCapacity() {
        int sum = 0;
        for (int i = 0; i < fleet.length; i++) {
            sum += fleet[i].capacity;
        }
        System.out.println("Общая грузоподъемность составляет: " + sum + " кг.");
    }

    public void sumOfSeats() {
        int sum = 0;
        for (int i = 0; i < fleet.length; i++) {
            sum += fleet[i].seats;
        }
        System.out.println("Общее количество мест составляет: " + sum + " чел.");
    }

    public void sortDistance() {
        Arrays.sort(fleet);
        for (int i = 0; i < fleet.length; i++) {
            System.out.println(fleet[i].mark + " с максимальной дальностью полета " + fleet[i].distance);
        }
    }

}
