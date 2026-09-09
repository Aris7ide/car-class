package com.model;

public class Car {

    public static final String BRAND = "Mercedes";
    private static String model = "GLS";
    private final int power;

    public Car(int power) {
        this.power = power;

    }

    public static void brake(){
        System.out.println("El veiculo està frenando");
    }

    public void accelerate() {
        System.out.println("El veiculo està accelerando");
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public int getPower() {
        return power;
    }
}
