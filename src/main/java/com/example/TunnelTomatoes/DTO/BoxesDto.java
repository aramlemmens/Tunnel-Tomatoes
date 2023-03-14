package com.example.TunnelTomatoes.DTO;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
@Builder
@Repository
public class BoxesDto {

    private int boxid;
    private String plaats;
    private String kas;
}
