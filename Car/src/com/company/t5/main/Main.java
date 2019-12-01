package com.company.t5.main;


import com.company.t5.entity.Car;
import com.company.t5.entity.CarBrand;
import com.company.t5.entity.Engine;
import com.company.t5.entity.Wheel;
import com.company.t5.view.Print;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Wheel> wheels = new ArrayList<Wheel>();
        wheels.add(new Wheel("19"));
        wheels.add(new Wheel("19"));
        wheels.add(new Wheel("19"));
        wheels.add(new Wheel("19"));
        Car car = new Car()
                .withEngine(new Engine())
                .withWheels(wheels)
                .withBrand(CarBrand.BMW);

        Print.printCarBrand(car);
    }
}