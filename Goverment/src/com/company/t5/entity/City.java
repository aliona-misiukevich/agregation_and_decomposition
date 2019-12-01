package com.company.t5.entity;
//3. Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

import java.util.Objects;

public class City {
    private CityType cityType;
    private String name;
    private boolean isCapital;


    public City(CityType type, String name, boolean isCapital){
        this.cityType = type;
        this.name = name;
        this.isCapital = isCapital;
    }

    public CityType getCityType() {
        return cityType;
    }

    public void setCityType(CityType cityType) {
        this.cityType = cityType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return isCapital == city.isCapital &&
                cityType == city.cityType &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityType, name, isCapital);
    }

    @Override
    public String toString() {
        return "City{" +
                "cityType=" + cityType +
                ", name='" + name + '\'' +
                ", isCapital=" + isCapital +
                '}';
    }
}
