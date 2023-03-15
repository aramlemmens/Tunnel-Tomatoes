package com.example.TunnelTomatoes.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Builder
@Entity
public class BoxesDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int boxid;
    private String plaats;
    private String kas;

    public BoxesDto(int boxid, String plaats, String kas) {
        this.boxid = boxid;
        this.plaats = plaats;
        this.kas = kas;
    }

    public BoxesDto() {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoxesDto boxesDto = (BoxesDto) o;
        return boxid == boxesDto.boxid && Objects.equals(plaats, boxesDto.plaats) && Objects.equals(kas, boxesDto.kas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boxid, plaats, kas);
    }
}
