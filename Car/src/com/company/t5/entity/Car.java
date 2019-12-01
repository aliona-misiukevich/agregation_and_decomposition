package com.company.t5.entity;
//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

import java.util.List;

public class Car {
    private Engine engine;
    private List<Wheel> wheels;
    private int fuelLevel;
    private CarBrand carBrand;

    public Car withEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public Car withWheels(List<Wheel> wheels) {
        this.wheels = wheels;
        return this;
    }

    public Car withBrand(CarBrand brand) {
        this.carBrand = brand;
        return this;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }
}
