package com.vinyl_viewer.Vinyl.Viewer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VinylViewerController {

  @RequestMapping("/")
  public String getHomepage() {
    return "index.html";
  }
}
