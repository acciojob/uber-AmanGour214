package com.driver.model;

import javax.persistence.*;


@Entity
@Table(name = "Cabs")
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int perKmRate;

    private boolean available;

    // mapping
    //with cab and driver;
    @OneToOne(mappedBy = "cab",cascade = CascadeType.ALL)
    private Driver driver;

    //2


    public Cab() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
