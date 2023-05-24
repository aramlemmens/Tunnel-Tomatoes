package com.example.TunnelTomatoes.model;

import jakarta.persistence.*;
import lombok.Builder;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Boxes")
public class Boxes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String boxid;
    private String plaats;
    private String kas;

    @OneToMany(mappedBy = "box", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Sensoren> boxes;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Boxes")
//    private List<Sensoren> sensoren;

    public Boxes(){

    }
    public Boxes(String id, String plaats, String kas){
        this.setBoxid(id);
        this.setPlaats(plaats);
        this.setKas(kas);
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

    public String getKas() {
        return kas;
    }

    public void setKas(String kas) {
        this.kas = kas;
    }




//    @Override
//    public String toString() {
//        return "Boxes{" + "boxid=" + boxid +
//                ", plaats='" + plaats +
//                ", kas='" + kas +
//        '}';
//    }

}
