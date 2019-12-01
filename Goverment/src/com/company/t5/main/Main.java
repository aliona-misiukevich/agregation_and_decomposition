package com.company.t5.main;
//3. Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

import com.company.t5.entity.*;
import com.company.t5.view.Print;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<City> minskDistrictCities = new ArrayList<City>();
        minskDistrictCities.add(new City(CityType.RegionalCenter, "Minsk", true));
        minskDistrictCities.add(new City(CityType.OrdinaryCity, "Fanipol", false ));

        District minskDistrict = new District(minskDistrictCities, 200);

        List<City> dzerzinskDistrictCities = new ArrayList<City>();
        dzerzinskDistrictCities.add(new City(CityType.OrdinaryCity, "Dzerzinsk", false));
        District dzerzinskDistrict = new District(dzerzinskDistrictCities, 100);

        List<City> brestDistrictCities = new ArrayList<City>();
        brestDistrictCities.add(new City(CityType.RegionalCenter, "Brest", false));
        District brestDistrict = new District(brestDistrictCities, 50);

        List<District> minskListDistrict = new ArrayList<District>();
        minskListDistrict.add(minskDistrict);
        minskListDistrict.add(dzerzinskDistrict);

        List<District> brestListRegion = new ArrayList<District>();
        brestListRegion.add(brestDistrict);

        List<Region> stateRegions = new ArrayList<Region>();

        Region minskRegion = new Region(minskListDistrict);
        Region brestRegion = new Region(brestListRegion);

        stateRegions.add(minskRegion);
        stateRegions.add(brestRegion);

        State state = new State (stateRegions);
        Print.printCapital(state);
        Print.printNumberOfRegion(state);
        Print.printRegionCenters(state);
        Print.printSquare(state);

    }
}
