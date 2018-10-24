package com.example.mirza.rentcar;

import java.util.List;

/**
 * Created by Mirza on 5/3/2018.
 */

public class ConfirmCar {


    String name, Idcrd, loc ,time, date, phno, carname;
    public ConfirmCar(){


    }

    public ConfirmCar(String name, String idcrd, String time, String loc, String date, String phno, String carname) {
        Idcrd = idcrd;
        this.time = time;
        this.loc = loc;
        this.date = date;
        this.phno = phno;
        this.carname = carname;
    }

    public String getName() {
        return name;
    }

    public String getIdcrd() {
        return Idcrd;
    }

    public String getLoc() {
        return loc;
    }

    public String getTime() {
        return time;
    }

    public String getPhno() {
        return phno;
    }

    public String getDate() {
        return date;
    }

    public String getCarname() {
        return carname;
    }
}
