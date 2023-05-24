package com.example.TunnelTomatoes.DAO;

import com.example.TunnelTomatoes.model.Metingen;
import com.example.TunnelTomatoes.model.Sensoren;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SensorenDao implements Dao<Sensoren>{

    private List<Sensoren> sensorens = new ArrayList<>();

    @Override
    public Optional<Sensoren> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Sensoren> getAll() {
        return sensorens;
    }

    @Override
    public void save(Sensoren sensoren) {

    }

    @Override
    public void update(Sensoren sensoren, String[] params) {

    }

    @Override
    public void delete(Sensoren sensoren) {

    }
}
