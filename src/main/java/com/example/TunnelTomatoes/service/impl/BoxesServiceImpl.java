package com.example.TunnelTomatoes.service.impl;

import com.example.TunnelTomatoes.DTO.BoxesDto;
import com.example.TunnelTomatoes.Repository.BoxesRepository;
import com.example.TunnelTomatoes.model.Boxes;
import com.example.TunnelTomatoes.service.BoxesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service

public class BoxesServiceImpl implements BoxesService {

    private BoxesRepository boxesRepository;
//    public BoxesServiceImpl(BoxesRepository boxesRepository){
//        this.boxesRepository = boxesRepository;
//    }
    @Override
    public List<BoxesDto> findallboxes() {
        List<Boxes> boxes = boxesRepository.findAll();
        return boxes.stream().map((box) -> mapToBoxesDto(box)).collect(Collectors.toList());
    }

    private BoxesDto mapToBoxesDto(Boxes boxes){
        BoxesDto boxesDto = BoxesDto.builder()
                .boxid(boxes.getBoxid())
                .plaats(boxes.getPlaats())
                .kas(boxes.getKas())
                .build();
        return boxesDto;
    }

}
