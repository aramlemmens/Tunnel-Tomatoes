package com.example.TunnelTomatoes.Repository;

import com.example.TunnelTomatoes.model.Boxes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface BoxesRepository extends JpaRepository<Boxes, Integer> {

//    List<Boxes> findByBoxidContaining(int id);

    Optional<Boxes> findByBoxid(String url);
}
