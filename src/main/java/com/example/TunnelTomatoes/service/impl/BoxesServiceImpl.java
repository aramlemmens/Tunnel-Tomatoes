package com.example.TunnelTomatoes.service.impl;

import com.example.TunnelTomatoes.DAO.BoxesDao;
import com.example.TunnelTomatoes.Repository.BoxesRepository;
import com.example.TunnelTomatoes.model.Boxes;
import com.example.TunnelTomatoes.model.Metingen;
import com.example.TunnelTomatoes.service.BoxesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service

public class BoxesServiceImpl implements BoxesService {

    private BoxesRepository boxesRepository;
    private BoxesDao boxesDao;

    @Override
    public List<Boxes> findAll(){
        return boxesDao.getAll();
    }

}
