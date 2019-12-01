package com.company.t5.logic;
//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

import com.company.t5.entity.BoardType;
import com.company.t5.entity.TourAgency;
import com.company.t5.entity.TourOffer;
import com.company.t5.entity.Transport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TourOfferLogic {
    public static List<TourOffer> findOfferByTransportBoardDuration(TourAgency agency, Transport transport, BoardType boardType, int duration) {
        List<TourOffer> filteredList = new ArrayList<TourOffer>();
        for (TourOffer offer :
                agency.getOffers()) {
            if (offer.getTransport().equals(transport) && offer.getBoardType().equals(boardType) && offer.getDuration() == duration) {
                filteredList.add(offer);
            }
        }
        return filteredList;
    }

    public static void sortByDuration(TourAgency agency) {
        Collections.sort(agency.getOffers(), new DurationComparator());
    }
}
