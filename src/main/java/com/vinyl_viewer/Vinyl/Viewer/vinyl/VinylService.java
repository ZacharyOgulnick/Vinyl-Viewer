package com.vinyl_viewer.Vinyl.Viewer.vinyl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class VinylService {

  private final VinylRepository vinylRepository;

  public List<Vinyl> geVinyls() {
    return vinylRepository.findAll();
  }

  public void addVinyl(Vinyl vinylToAdd) {
    vinylRepository.save(vinylToAdd);
  }

  public void deleteVinyl(Integer id) {
    vinylRepository.deleteById(id);
  }

  public void updateVinyl(Integer id, Vinyl vinylDetails) {
    Vinyl vinylToUpdate = vinylRepository.findById(id)
        .orElseThrow(() -> new IllegalStateException("Vinyl not found."));
    vinylToUpdate.setVinylName(vinylDetails.getVinylName());
    vinylToUpdate.setVinylArtist(vinylDetails.getVinylArtist());
    vinylToUpdate.setVinylPurchased(vinylDetails.isVinylPurchased());
    vinylToUpdate.setVinylSize(vinylDetails.getVinylSize());
    vinylToUpdate.setImageURL(vinylDetails.getImageURL());
    vinylRepository.save(vinylToUpdate);
  }
}
