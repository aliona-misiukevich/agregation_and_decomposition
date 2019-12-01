package com.company.t5.entity;

import java.util.List;
import java.util.Objects;

public class District {
    private List<City> cities;
    private int square;

    public District(List<City> cities, int square){
        this.cities = cities;
        this.square = square;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return square == district.square &&
                Objects.equals(cities, district.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cities, square);
    }

    @Override
    public String toString() {
        return "District{" +
                "cities=" + cities +
                ", square=" + square +
                '}';
    }
}
