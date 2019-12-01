package com.company.t5.entity;
//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

import java.util.Objects;

public class Engine {
    private boolean isStarted;

    public boolean start(int fuelLevel) {
        if(isStarted){
            return true;
        }
        if (fuelLevel > 0) {
            isStarted = true;
            return true;
        }
        return false;
    }

    public void stop(){
        isStarted = false;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return isStarted == engine.isStarted;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isStarted);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelLevel=" +
                ", isStarted=" + isStarted +
                '}';
    }
}
