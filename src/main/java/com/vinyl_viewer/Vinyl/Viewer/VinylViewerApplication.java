package com.vinyl_viewer.Vinyl.Viewer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VinylViewerApplication {

  public static void main(String[] args) {
    SpringApplication.run(VinylViewerApplication.class, args);
  }
}
