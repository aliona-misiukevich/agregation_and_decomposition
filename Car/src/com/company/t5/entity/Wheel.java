package com.company.t5.entity;
//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

import java.util.Objects;

public class Wheel {
    private String size;
    private boolean isStarted;

    public Wheel(String size){
        this.size = size;
    }

    public void stop(){
        isStarted = false;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
        Wheel wheel = (Wheel) o;
        return Objects.equals(size, wheel.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
