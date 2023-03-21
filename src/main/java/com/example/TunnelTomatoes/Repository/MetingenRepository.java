package com.example.TunnelTomatoes.Repository;

import com.example.TunnelTomatoes.model.Metingen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.Optional;

public interface MetingenRepository extends JpaRepository<Metingen, Date> {

    @Override
    Optional<Metingen> findById(Date s);
}
