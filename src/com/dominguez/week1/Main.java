package com.dominguez.week1;

public class Main {

    public static void main(String[] args) {

    String cityName= "Venice";
    int zipCode = 34972;
    int[] highTemp = {67, 80, 90, 79, 88};
    int maxHeat = highTemp[0] + highTemp[1] + highTemp[2] + highTemp[3] + highTemp[4];
    int averageTemp = maxHeat/5;

        System.out.println("City: " + cityName + " Zip Code: " + zipCode + " Average High Temperature: " + averageTemp);
    }
}
