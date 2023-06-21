package com.example.TunnelTomatoes.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;


@Entity
@Table(name = "boxes")
public class Boxes {

    @Id
    @Column(name="boxid")
    private String Boxid;
    @Column(name="plaats")
    private String Plaats;

    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name="boxid")
    private List<Sensoren> sensorens;
    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name="boxid")
    private List<Metingen> metingens;

    public Boxes(){

    }
    public Boxes(String Boxid, String Plaats){
        this.setBoxid(Boxid);
        this.setPlaats(Plaats);
    }

    public String getBoxid() {
        return Boxid;
    }

    public void setBoxid(String Boxid) {
        this.Boxid = Boxid;
    }

    public String getPlaats() {
        return Plaats;
    }

    public void setPlaats(String Plaats) {
        this.Plaats = Plaats;
    }
}
