package com.company.t5.logic;

import com.company.t5.entity.TourOffer;

import java.util.Comparator;

public class DurationComparator implements Comparator<TourOffer> {

    @Override
    public int compare(TourOffer o1, TourOffer o2) {
        return o1.getDuration() - o2.getDuration();
    }
}
