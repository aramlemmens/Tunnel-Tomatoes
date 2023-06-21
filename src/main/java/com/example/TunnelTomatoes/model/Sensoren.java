package com.example.TunnelTomatoes.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "sensoren")
public class Sensoren {

    @Id
    @Column(name = "sensorid")
    private int Sensorid;

    @Column(name="boxid")
    private String Boxid;
    @Column(name = "soort")
    private String Soort;
    @Column(name = "eenheid")
    private String Eenheid;
    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name="sensorid")
    private List<Metingen> metingens;
    public Sensoren(int Sensorid, String Boxid, String Soort, String Eenheid) {
        this.setSensorid(Sensorid);
        this.setBoxid(Boxid);
        this.setSoort(Soort);
        this.setEenheid(Eenheid);
    }

    public Sensoren() {

    }

    public int getSensorid() {
        return Sensorid;
    }

    public void setSensorid(int Sensorid) {
        this.Sensorid = Sensorid;
    }

    public String getBoxid() {
        return Boxid;
    }

    public void setBoxid(String Boxid) {
        this.Boxid = Boxid;
    }

    public String getSoort() {
        return Soort;
    }

    public void setSoort(String Soort) {
        this.Soort = Soort;
    }

    public String getEenheid() {
        return Eenheid;
    }

    public void setEenheid(String Eenheid) {
        this.Eenheid = Eenheid;
    }
}
