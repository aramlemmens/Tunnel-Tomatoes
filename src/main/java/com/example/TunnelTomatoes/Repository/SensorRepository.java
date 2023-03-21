package com.example.TunnelTomatoes.Repository;

import com.example.TunnelTomatoes.model.Sensoren;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SensorRepository extends JpaRepository<Sensoren, String> {
    @Override
    Optional<Sensoren> findById(String s);
}
