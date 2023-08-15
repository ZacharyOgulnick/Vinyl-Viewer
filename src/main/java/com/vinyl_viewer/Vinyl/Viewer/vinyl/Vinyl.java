package com.vinyl_viewer.Vinyl.Viewer.vinyl;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vinyl {
  @Id
  @SequenceGenerator(name = "vinyl_sequence", sequenceName = "vinyl_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vinyl_sequence")
  private Integer id;
  private String vinylName;
  private String vinylArtist;
  private boolean vinylPurchased;
  public Integer vinylSize;
  private String imageURL;
}
