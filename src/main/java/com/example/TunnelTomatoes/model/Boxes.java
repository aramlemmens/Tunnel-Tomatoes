package com.example.TunnelTomatoes.model;

import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "Boxes")
public class Boxes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String boxid;
    private String plaats;

//    @OneToMany(mappedBy = "box", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Set<Sensoren> boxes;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Boxes")
//    private List<Sensoren> sensoren;

    public Boxes(){

    }
    public Boxes(String boxid, String plaats){
        this.setBoxid(boxid);
        this.setPlaats(plaats);
    }

    public String getBoxid() {
        return boxid;
    }

    public void setBoxid(String boxid) {
        this.boxid = boxid;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }
}
