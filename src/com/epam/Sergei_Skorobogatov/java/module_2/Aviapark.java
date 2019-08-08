package com.epam.Sergei_Skorobogatov.java.module_2;


import java.util.Arrays;


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

    public void messageWithVariants() {
        System.out.println("1 - общая информация летательных аппаратов;");
        System.out.println("2 - общая вместимость пассажиров;");
        System.out.println("3 - общая грузоподъемность;");
        System.out.println("4 - сортировка летательных аппаратов по дальности полета;");
        System.out.println("5 - поиск летательного аппарата по заданным параметрам максимальной дальности полета;");
        System.out.println("6 - для выхода из программы.");
        System.out.println("Пожалуйста, выберите номер...");
    }


}
