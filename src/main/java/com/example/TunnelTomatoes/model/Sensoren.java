package com.example.TunnelTomatoes.model;

import jakarta.persistence.*;
@Entity
@Table(name = "Sensoren")
public class Sensoren {

    @Id
    @Column(name = "sensorid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sensorid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "boxid", nullable = false)
    private Boxes boxid;

    private String soort;
    private String eenheid;

    public Sensoren(int sensorid, Boxes boxid, String soort, String eenheid) {
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

    public Boxes getBoxid() {
        return boxid;
    }

    public void setBoxid(Boxes boxid) {
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
