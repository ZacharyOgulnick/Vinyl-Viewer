package com.vinyl_viewer.Vinyl.Viewer.vinyl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VinylRepository extends JpaRepository<Vinyl, Integer> {
  //
}
