package fer.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {
  @GetMapping("/details")
  public Map<String, Object> details() {
    Map<String, Object> body = new HashMap<>();

    body.put("title", "Hola mundo Spring");
    body.put("name", "Fernando");
    body.put("lastname", "Garcia");

    return body;
  }
}