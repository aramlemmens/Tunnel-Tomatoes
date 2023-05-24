package com.example.TunnelTomatoes.DAO;

import com.example.TunnelTomatoes.model.Boxes;
import com.example.TunnelTomatoes.model.Metingen;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BoxesDao implements Dao<Boxes>{
    private List<Boxes> boxes = new ArrayList<>();

    @Override
    public Optional<Boxes> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Boxes> getAll() {
        return boxes;
    }

    @Override
    public void save(Boxes boxes) {

    }

    @Override
    public void update(Boxes boxes, String[] params) {

    }

    @Override
    public void delete(Boxes boxes) {

    }
}
