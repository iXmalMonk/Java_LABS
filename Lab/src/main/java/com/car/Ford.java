package com.car;

public class Ford extends Car {
    private boolean bustle = false;

    public Ford(int _year_of_issue, boolean _bustle) {
        year_of_issue = _year_of_issue;
        bustle = _bustle;
    }

    public boolean getBustle() {
        return bustle;
    }

    @Override
    public int getNumberOfSeats() {
        return number_of_seats - 2;
    }
}
