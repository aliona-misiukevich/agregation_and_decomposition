package com.company.t5.main;
//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

import com.company.t5.entity.*;
import com.company.t5.logic.TourOfferLogic;
import com.company.t5.view.Print;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<TourOffer> offers = new ArrayList<TourOffer>();

        offers.add(new TourOffer(TourType.Treatment, Transport.bus, BoardType.HB, 10));
        offers.add(new TourOffer(TourType.Relax, Transport.airplane, BoardType.BB, 15));
        offers.add(new TourOffer(TourType.Shopping, Transport.train, BoardType.HB, 5));
        offers.add(new TourOffer(TourType.Shopping, Transport.bus, BoardType.HB, 10));

        TourAgency agency = new TourAgency(offers);
        TourOfferLogic.sortByDuration(agency);
        Print.printOffers(agency.getOffers());
        List<TourOffer> filteredList = new ArrayList<TourOffer>();
        filteredList = TourOfferLogic.findOfferByTransportBoardDuration(agency, Transport.bus, BoardType.HB, 10);
        Print.printOffers(filteredList);
    }
}
