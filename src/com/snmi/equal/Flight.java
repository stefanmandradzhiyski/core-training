package com.snmi.equal;

public class Flight {

    private String name;
    private int seats;

    public Flight() {}

    public Flight(String name, int seats) {
        this.name = name;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            return true;
        }

        if (o instanceof Flight) {
            Flight other = (Flight) o;
            return this.seats == other.seats;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "seats=" + seats +
                '}';
    }
}
