package com.main;

import com.model.Car;

public class main {
    static void main(String[] args) {

        Car.brake();

        Car car1 = new Car(1200);
        Car car2 = new Car(2100);

        car1.accelerate();
        car2.accelerate();

    }
}
