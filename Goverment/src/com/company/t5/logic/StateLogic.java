package com.company.t5.logic;
//3. Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

import com.company.t5.entity.*;

import java.util.ArrayList;
import java.util.List;

public class StateLogic {
    public static City getCapital(State state) {
        List<Region> regions = state.getRegions();
        for (Region region : regions) {
            List<District> districts = region.getDistricts();
            for (District district : districts) {
                List<City> cities = district.getCities();
                for (City city : cities) {
                    if (city.isCapital()) {
                        return city;
                    }
                }
            }
        }
        return null;
    }

    public static int getNumberOfRegion(State state) {
        int count = 0;
        List<Region> regions = state.getRegions();
        for (Region region : regions) {
            count++;
        }
        return count;
    }

    public static int getSquare(State state) {
        int square = 0;
        List<Region> regions = state.getRegions();
        for (Region region : regions) {
            List<District> districts = region.getDistricts();
            for (District district : districts) {
                square += district.getSquare();
            }
        }
        return square;
    }

    public static List<City> getRegionCenter(State state) {
        List<City> regionCenters = new ArrayList<City>();

        List<Region> regions = state.getRegions();
        for (Region region : regions) {
            List<District> districts = region.getDistricts();
            for (District district : districts) {
                List<City> cities = district.getCities();
                for (City city : cities) {
                    if (city.getCityType().equals(CityType.RegionalCenter)) {
                        regionCenters.add(city);
                    }
                }
            }
        }
        return regionCenters;
    }

}
