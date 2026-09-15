package com.main;

import com.model.Car;

public class main {
    static void main(String[] args) {

        Car car1 = new Car(1200, "GLS");
        Car car2 = new Car(2100, "GLS");

        car1.accelerate();
        car2.accelerate();
        Car.brake();

        System.out.println("El model del coche 1 es: " + car1.getModel() + " y la potencia " + car1.getPower());
        System.out.println("El model del coche 2 es: " + car2.getModel() + " y la potencia " + car2.getPower());

        System.out.println("Cambio model");
        Car.setModel("GLSPlus");

        System.out.println("El nuevo model del coche 1 es: " + car1.getModel() + " y la potencia " + car1.getPower());
        System.out.println("El nuevo model del coche 2 es: " + car2.getModel() + " y la potencia " + car2.getPower());

    }
}
