package com.company.t5.view;

import com.company.t5.entity.City;
import com.company.t5.entity.State;
import com.company.t5.logic.StateLogic;

public class Print {

    public static void printCapital(State state){
        System.out.println(StateLogic.getCapital(state).getName());
    }

    public static void printNumberOfRegion(State state){
        System.out.println(StateLogic.getNumberOfRegion(state));
    }

    public static void printSquare(State state){
        System.out.println(StateLogic.getSquare(state));
    }

    public static void printRegionCenters(State state){
        for (City city:
                StateLogic.getRegionCenter(state)) {
            System.out.println(city.getName());
        }
    }
}
