package com.week2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] highTemp = {45, 29, 10, 22, 41, 28, 33};
        int[] precipitation = {95, 60, 25, 5, 0, 75, 90};
        String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < 6; i++) {
            if (highTemp[i] < 32 && precipitation[i] > 50) {
                System.out.println("It might snow " + dayOfTheWeek[i]);
            }
        }


    }



}
