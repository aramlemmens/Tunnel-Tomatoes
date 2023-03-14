package com.example.TunnelTomatoes.model;

public class Metingen {

    private String boxid;
    private int sensorid;
    private int tijd;
    private int waarde;

    public String getBoxid() {
        return boxid;
    }

    public void setBoxid(String boxid) {
        this.boxid = boxid;
    }

    public int getSensorid() {
        return sensorid;
    }

    public void setSensorid(int sensorid) {
        this.sensorid = sensorid;
    }

    public int getTijd() {
        return tijd;
    }

    public void setTijd(int tijd) {
        this.tijd = tijd;
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }
}
