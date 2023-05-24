package com.example.TunnelTomatoes.service.impl;

import com.example.TunnelTomatoes.DAO.MetingenDao;
import com.example.TunnelTomatoes.Repository.MetingenRepository;
import com.example.TunnelTomatoes.model.Boxes;
import com.example.TunnelTomatoes.model.Metingen;
import com.example.TunnelTomatoes.service.MetingenService;

import java.util.List;
import java.util.stream.Collectors;

public class MetingenServiceImpl implements MetingenService {

    private MetingenRepository metingenRepository;

    private MetingenDao metingenDao;

//    @Override
//    public List<Metingen> findAll() {
//        List<Metingen> metingen = metingenRepository.findAll();
//        return metingen.stream().map((meting) -> mapToMetingen(meting)).collect(Collectors.toList());
//    }
//
//    private Metingen mapToMetingen(Metingen meting){
//        Metingen metingen = Metingen.builder()
//                .sensorid(meting.getSensorid())
//                .boxid(meting.getBoxid())
//                .tijd(meting.getTijd())
//                .waarde(meting.getWaarde())
//                .build();
//        return metingen;
//    }
    @Override
    public List<Metingen> findAll(){
        return metingenDao.getAll();
    }




}
