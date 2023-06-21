package com.example.TunnelTomatoes.model;

import jakarta.persistence.*;
import lombok.Builder;
import java.sql.Date;

@Entity
public class Metingen {

    @ManyToOne
    @JoinColumn(name="boxid", nullable=false)
    private Boxes Boxid;
//    @Column(name="boxid")
//    private String Boxid;
    @ManyToOne
    @JoinColumn(name="sensorid", nullable=false)
    private Sensoren Sensorid;
//    @Column(name = "sensorid")
//    private int Sensorid;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tijd")
    private Date Tijd;
    @Column(name = "waarde")
    private int Waarde;

    public Metingen(Boxes Boxid, Sensoren Sensorid, Date Tijd, int Waarde){
        this.setBoxid(Boxid);
        this.setSensorid(Sensorid);
        this.setTijd(Tijd);
        this.setWaarde(Waarde);
    }

    public Metingen() {

    }

    public Boxes getBoxid() {
        return Boxid;
    }

    public void setBoxid(Boxes Boxid) {
        this.Boxid = Boxid;
    }

    public Sensoren getSensorid() {
        return Sensorid;
    }

    public void setSensorid(Sensoren Sensorid) {
        this.Sensorid = Sensorid;
    }

    public Date getTijd() {
        return Tijd;
    }

    public void setTijd(Date Tijd) {
        this.Tijd = Tijd;
    }

    public int getWaarde() {
        return Waarde;
    }

    public void setWaarde(int Waarde) {
        this.Waarde = Waarde;
    }
}
