package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(3);
        names.add("Вася");
        names.add("Федя");
        names.add("Саня");
        wishes(names);
        System.out.println("Хотите переопределить массив, добавив еще 1 элемент?");
        System.out.println("0-нет, 1-да");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        if (num == 1) {
            names.add("Серега");
            wishes(names);
        } else {
            System.out.println("Завершение программы");}

    }
    public static void wishes(ArrayList names){
        for (int i = 0; i < names.size(); i++) {
            switch (i) {
                case 0:
                    System.out.println(names.get(i) + " Доброе утро!");
                    break;
                case 1:
                    System.out.println(names.get(i) + " Добрый день!");
                    break;
                case 2:
                    System.out.println(names.get(i) + " Добрый вечер!");
                    break;
                case 3:
                    if (names.size() < 4) break;
                    else System.out.println(names.get(i) + " Доброй ночи!");
                    break;
                default:
                    System.out.println("***");
                    break;
            }
        }
    }
}
