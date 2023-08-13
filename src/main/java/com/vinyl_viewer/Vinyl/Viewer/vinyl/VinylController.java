package com.vinyl_viewer.Vinyl.Viewer.vinyl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/vinyls")
public class VinylController {

  private final VinylService vinylService;

  @Autowired
  public VinylController(VinylService vinylService) {
    this.vinylService = vinylService;
  }

  @GetMapping
  public List<Vinyl> getVinyls() {
    return vinylService.geVinyls();
  }

  @PostMapping
  public void addVinyl(@RequestBody Vinyl vinylToAdd) {
    vinylService.addVinyl(vinylToAdd);
  }

  @DeleteMapping("{vinylId}")
  public void deleteVinyl(@PathVariable("vinylId") Integer id) {
    vinylService.deleteVinyl(id);
  }

  @PutMapping("{vinylId}")
  public void updateVinyl(@PathVariable("vinylId") Integer id, @RequestBody Vinyl vinylDetails) {
    vinylService.updateVinyl(id, vinylDetails);
  }
}
