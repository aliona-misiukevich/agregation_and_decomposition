package com.company.t5.logic;

import com.company.t5.entity.Car;
import com.company.t5.entity.Wheel;

public class CarLogic {
    public static boolean changeWheel(Car car, Wheel wheel, Wheel newWheel) {
        stop(car);
        if (wheel.getSize().equals(newWheel.getSize())) {
            int index = car.getWheels().indexOf(wheel);
            car.getWheels().remove(wheel);
            car.getWheels().add(index, newWheel);
            return true;
        }
        return false;
    }

    public static boolean spinWheels(Car car){
        if(car.getWheels() != null){
            for (Wheel wheel: car.getWheels()) {
                wheel.setStarted(true);
            }
            return true;
        }
        return false;
    }

    public boolean run(Car car) {
        if (car.getEngine().start(car.getFuelLevel()) && spinWheels(car)) {
            return true;
        } else {
           stop(car);
           return false;
        }
    }

    public static void stop(Car car) {
        if(car.getWheels() != null) {
            for (Wheel wheel : car.getWheels()) {
                wheel.stop();
            }
        }
        car.getEngine().stop();
    }

    public static void refillFuel(Car car) {
        car.getEngine().stop();
        car.setFuelLevel(10);
    }
}
