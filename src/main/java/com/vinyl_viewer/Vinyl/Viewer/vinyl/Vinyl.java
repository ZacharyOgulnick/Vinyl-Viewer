package com.vinyl_viewer.Vinyl.Viewer.vinyl;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Vinyl {

  @Id
  @SequenceGenerator(name = "vinyl_sequence", sequenceName = "vinyl_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vinyl_sequence")

  private Integer id;
  private String vinylName;
  private String vinylArtist;
  private boolean vinylPurchased;

  public Vinyl() {
    //
  }

  public Vinyl(Integer id, String vinylName, String vinylArist, boolean vinylPurchased) {
    this.id = id;
    this.vinylName = vinylName;
    this.vinylArtist = vinylArist;
    this.vinylPurchased = vinylPurchased;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getVinylName() {
    return vinylName;
  }

  public void setVinylName(String vinylName) {
    this.vinylName = vinylName;
  }

  public String getVinylArtist() {
    return vinylArtist;
  }

  public void setVinylArtist(String vinylArist) {
    this.vinylArtist = vinylArist;
  }

  public boolean isVinylPurchased() {
    return vinylPurchased;
  }

  public void setVinylPurchased(boolean vinylPurchased) {
    this.vinylPurchased = vinylPurchased;
  }
}
