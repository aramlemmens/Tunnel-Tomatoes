package com.example.TunnelTomatoes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
@Entity
@Builder
public class Sensoren {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sensorid;
    private String boxid;
    private String soort;
    private String eenheid;

    public Sensoren(int sensorid, String boxid, String soort, String eenheid) {
        this.setSensorid(sensorid);
        this.setBoxid(boxid);
        this.setSoort(soort);
        this.setEenheid(eenheid);
    }

    public Sensoren() {

    }

    public int getSensorid() {
        return sensorid;
    }

    public void setSensorid(int sensorid) {
        this.sensorid = sensorid;
    }

    public String getBoxid() {
        return boxid;
    }

    public void setBoxid(String boxid) {
        this.boxid = boxid;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public String getEenheid() {
        return eenheid;
    }

    public void setEenheid(String eenheid) {
        this.eenheid = eenheid;
    }
}
