package fer.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class UserRestController {
  @GetMapping("/details")
  @ResponseBody
  public Map<String, Object> details() {
    Map<String, Object> body = new HashMap<>();

    body.put("title", "Hola mundo Spring");
    body.put("name", "Fernando");
    body.put("lastname", "Garcia");

    return body;
  }
}