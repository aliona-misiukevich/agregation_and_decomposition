package com.company.t5.entity;

import java.util.List;
import java.util.Objects;

public class Region {
    private List<District> districts;

    public Region(List<District> districts){
        this.districts = districts;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(districts, region.districts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(districts);
    }


    @Override
    public String toString() {
        return "Region{" +
                "districts=" + districts +
                '}';
    }
}
