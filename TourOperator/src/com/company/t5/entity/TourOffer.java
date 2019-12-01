package com.company.t5.entity;
//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

import java.util.Objects;

public class TourOffer {
    private TourType type;
    private Transport transport;
    private BoardType boardType;
    private int duration;

    public TourOffer(TourType type, Transport transport, BoardType boardType, int duration) {
        this.boardType = boardType;
        this.duration = duration;
        this.transport = transport;
        this.type = type;
    }

    public TourType getType() {
        return type;
    }

    public void setType(TourType type) {
        this.type = type;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public BoardType getBoardType() {
        return boardType;
    }

    public void setBoardType(BoardType boardType) {
        this.boardType = boardType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourOffer tourOffer = (TourOffer) o;
        return duration == tourOffer.duration &&
                type == tourOffer.type &&
                transport == tourOffer.transport &&
                boardType == tourOffer.boardType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, transport, boardType, duration);
    }

    @Override
    public String toString() {
        return "TourOffer{" +
                "type=" + type +
                ", transport=" + transport +
                ", boardType=" + boardType +
                ", duration=" + duration +
                '}';
    }
}
