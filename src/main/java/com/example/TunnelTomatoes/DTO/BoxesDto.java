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
    private String boxid;
    private String plaats;

    public BoxesDto(String boxid, String plaats) {
        this.boxid = boxid;
        this.plaats = plaats;
    }

    public BoxesDto() {

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoxesDto boxesDto = (BoxesDto) o;
        return boxid == boxesDto.boxid && Objects.equals(plaats, boxesDto.plaats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boxid, plaats);
    }
}
