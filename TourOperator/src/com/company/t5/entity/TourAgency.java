package com.company.t5.entity;

import java.util.List;
import java.util.Objects;

public class TourAgency {
    private List<TourOffer> offers;

    public TourAgency(List<TourOffer> offers) {
        this.offers = offers;
    }



    public List<TourOffer> getOffers() {
        return offers;
    }

    public void setOffers(List<TourOffer> offers) {
        this.offers = offers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourAgency that = (TourAgency) o;
        return Objects.equals(offers, that.offers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offers);
    }

    @Override
    public String toString() {
        return "TourAgency{" +
                "offers=" + offers +
                '}';
    }


}
