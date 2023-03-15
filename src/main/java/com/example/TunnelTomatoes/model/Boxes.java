package com.example.TunnelTomatoes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Boxes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int boxid;
    private String plaats;
    private String kas;

    public Boxes(){

    }
    public Boxes(int id, String plaats, String kas){
        this.setBoxid(id);
        this.setPlaats(plaats);
        this.setKas(kas);
    }

    public int getBoxid() {
        return boxid;
    }

    public void setBoxid(int boxid) {
        this.boxid = boxid;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public String getKas() {
        return kas;
    }

    public void setKas(String kas) {
        this.kas = kas;
    }


    @Override
    public String toString() {
        return "Boxes{" + "boxid=" + boxid +
                ", plaats='" + plaats +
                ", kas='" + kas +
        '}';
    }

}
