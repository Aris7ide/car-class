package com.main;

import com.model.Car;
import java.util.Scanner;

public class main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String newModel = "";

        Car.brake();

        Car car1 = new Car(1200);
        Car car2 = new Car(2100);

        car1.accelerate();
        car2.accelerate();

        System.out.println(car2.getModel());

        System.out.println("Escribe el nuevo modelo del coche:");
        newModel = scanner.nextLine();

        Car.setModel(newModel);

        System.out.println("El nuevo model del coche 1 es: " + car1.getModel() + " y la potencia " + car1.getPower());
        System.out.println("El nuevo model del coche 2 es: " + car2.getModel() + " y la potencia " + car2.getPower());

    }
}
