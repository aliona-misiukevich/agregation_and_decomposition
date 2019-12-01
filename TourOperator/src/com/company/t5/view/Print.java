package com.company.t5.view;

import com.company.t5.entity.TourOffer;

import java.util.List;

public class Print {

    public static void printOffers(List<TourOffer> offers){
        for (TourOffer offer:
             offers) {
            System.out.println(offer.toString());
        }
    }
}
