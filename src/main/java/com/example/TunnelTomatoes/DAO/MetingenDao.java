package com.example.TunnelTomatoes.DAO;

import com.example.TunnelTomatoes.model.Metingen;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MetingenDao implements Dao<Metingen> {

    private List<Metingen> metingen = new ArrayList<>();

    @Override
    public Optional<Metingen> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Metingen> getAll() {
        return metingen;
    }

    @Override
    public void save(Metingen metingen) {

    }

    @Override
    public void update(Metingen metingen, String[] params) {

    }

    @Override
    public void delete(Metingen metingen) {

    }
}
