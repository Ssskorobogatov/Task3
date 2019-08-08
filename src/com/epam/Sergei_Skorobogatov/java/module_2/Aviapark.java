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


    public void searchByDistance() {
        int num1 = getInt();
        int num2 = getInt();
        boolean Cap = false;

        for (int i = 0; i < fleet.length; i++) {
            if (num1 <= fleet[i].distance && num2 >= fleet[i].distance) {
                System.out.println(fleet[i].mark + " с дальностью полета " + fleet[i].distance + " км");
                Cap = true;
            }


        }
        if (Cap == false) {
            System.out.println("Нет подходящих вариантов");
        }
    }


    public int getInt() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дистанцию полета:");
        int num;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа. Повторите попытку");
            scan.next();
            num = getInt();
        }
        return num;
    }
}

