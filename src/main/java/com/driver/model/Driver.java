//package com.driver.model;
//
//import com.driver.model.Cab;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "Drivers")
//public class Driver  {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int driverId;
//
//    private String mobile;
//
//    private String password;
//
//    // mapping with cab;
//    // cab is parent for driver
//    @OneToOne
//    @JoinColumn
//    private Cab cab;
//
//    // Driver is parent for TripBook;
//    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
//    private List<TripBooking>tripBookingList=new ArrayList<>();
//
//
//
//
//    public Driver() {
//    }
//
//    public List<TripBooking> getTripBookingList() {
//        return tripBookingList;
//    }
//
//    public void setTripBookingList(List<TripBooking> tripBookingList) {
//        this.tripBookingList = tripBookingList;
//    }
//
//    public Cab getCab() {
//        return cab;
//    }
//
//    public void setCab(Cab cab) {
//        this.cab = cab;
//    }
//
//    public int getDriverId() {
//        return driverId;
//    }
//
//    public void setDriverId(int driverId) {
//        this.driverId = driverId;
//    }
//
//    public String getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}
package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="driver")
public class Driver{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;

    private String mobile;
    private String password;



    //Mapping cab and driver  (parent -- cab , child -- driver )

    @OneToOne
    @JoinColumn
    private Cab cab;

    // in driver --parent ,   child -- trip booking   (many to one)
    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    private List<TripBooking> tripBookingList = new ArrayList<>();

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public Driver() {
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }

}