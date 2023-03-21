package com.example.TunnelTomatoes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;

import java.sql.Date;

@Entity
@Builder
public class Metingen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String boxid;
    private int sensorid;
    private Date tijd;
    private int waarde;

    public Metingen(String boxid, int sensorid, Date tijd, int waarde){
        this.setBoxid(boxid);
        this.setSensorid(sensorid);
        this.setTijd(tijd);
        this.setWaarde(waarde);
    }

    public Metingen() {

    }

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

    public Date getTijd() {
        return tijd;
    }

    public void setTijd(Date tijd) {
        this.tijd = tijd;
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }
}
