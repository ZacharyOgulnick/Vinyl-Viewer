package com.vinyl_viewer.Vinyl.Viewer;

import com.vinyl_viewer.Vinyl.Viewer.vinyl.Vinyl;
import com.vinyl_viewer.Vinyl.Viewer.vinyl.VinylRepository;
import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@SpringBootApplication
@RestController
public class VinylViewerApplication {

  public static void main(String[] args) {
    SpringApplication.run(VinylViewerApplication.class, args);
  }

  @Bean
  CommandLineRunner run(VinylRepository vinylRepository) {
    return args -> {
      vinylRepository.save(
          new Vinyl(null, "Everything I Know About Love", "Laufey", true, 78, null));
    };
  }
}
