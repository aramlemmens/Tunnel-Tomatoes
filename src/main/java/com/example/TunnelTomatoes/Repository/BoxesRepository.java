package com.example.TunnelTomatoes.Repository;

import com.example.TunnelTomatoes.model.Boxes;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface BoxesRepository extends JpaRepository<Boxes, String> {
    @Override
    Optional<Boxes> findById(String s);
}
