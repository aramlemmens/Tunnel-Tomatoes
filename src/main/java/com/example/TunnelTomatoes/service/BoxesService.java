package com.example.TunnelTomatoes.service;

import com.example.TunnelTomatoes.DTO.BoxesDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BoxesService {
    List<BoxesDto> findallboxes();
}
