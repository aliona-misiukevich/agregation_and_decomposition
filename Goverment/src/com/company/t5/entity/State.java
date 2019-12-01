package com.company.t5.entity;
//3. Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

import java.util.List;
import java.util.Objects;

public class State {
    private List<Region> regions;

    public State(List<Region> regions){
        this.regions = regions;
    }


    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(regions, state.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions);
    }

    @Override
    public String toString() {
        return "State{" +
                "regions=" + regions +
                '}';
    }
}
