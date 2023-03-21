package com.example.TunnelTomatoes.service.impl;

import com.example.TunnelTomatoes.Repository.BoxesRepository;
import com.example.TunnelTomatoes.model.Boxes;
import com.example.TunnelTomatoes.service.BoxesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service

public class BoxesServiceImpl implements BoxesService {

    private BoxesRepository boxesRepository;

    @Override
    public List<Boxes> findallboxes() {
        List<Boxes> boxes = boxesRepository.findAll();
        return boxes.stream().map((box) -> mapToBoxes(box)).collect(Collectors.toList());
    }

    private Boxes mapToBoxes(Boxes box){
        Boxes boxes = Boxes.builder()
                .boxid(box.getBoxid())
                .plaats(box.getPlaats())
                .build();
        return boxes;
    }

}
