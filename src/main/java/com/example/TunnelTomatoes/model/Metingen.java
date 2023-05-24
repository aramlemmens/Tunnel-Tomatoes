package com.example.TunnelTomatoes.model;

import jakarta.persistence.*;
import lombok.Builder;
import java.sql.Date;

@Entity
public class Metingen {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date tijd;
    @ManyToOne
    @JoinColumn(name = "boxid")
    private Boxes boxid;
    @ManyToOne
    @JoinColumn(name = "sensorid")
    private Sensoren sensorid;

    private int waarde;

    public Metingen(Boxes boxid, Sensoren sensorid, Date tijd, int waarde){
//        this.setBoxid(boxid);
        this.setSensorid(sensorid);
        this.setTijd(tijd);
        this.setWaarde(waarde);
    }

    public Metingen() {

    }

    public Boxes getBoxid() {
        return boxid;
    }

    public void setBoxid(Boxes boxid) {
        this.boxid = boxid;
    }

    public Sensoren getSensorid() {
        return sensorid;
    }

    public void setSensorid(Sensoren sensorid) {
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
