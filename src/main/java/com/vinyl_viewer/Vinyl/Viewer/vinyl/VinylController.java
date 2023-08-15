package com.vinyl_viewer.Vinyl.Viewer.vinyl;

import lombok.RequiredArgsConstructor;
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

@RequiredArgsConstructor
@RestController
@RequestMapping("/vinyls")
public class VinylController {

  private final VinylService vinylService;

  @GetMapping("/list")
  public List<Vinyl> getVinyls() {
    return vinylService.geVinyls();
  }

  @PostMapping("/add")
  public void addVinyl(@RequestBody Vinyl vinylToAdd) {
    vinylService.addVinyl(vinylToAdd);
  }

  @DeleteMapping("/delete/{vinylId}")
  public void deleteVinyl(@PathVariable("vinylId") Integer id) {
    vinylService.deleteVinyl(id);
  }

  @PutMapping("/update/{vinylId}")
  public void updateVinyl(@PathVariable("vinylId") Integer id, @RequestBody Vinyl vinylDetails) {
    vinylService.updateVinyl(id, vinylDetails);
  }
}
