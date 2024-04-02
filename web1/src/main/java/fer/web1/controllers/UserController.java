package fer.web1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

@Controller
public class UserController {
  @GetMapping("/details")
  public String details (Map<String, Object> model) {
    model.put("title", "Hola mundo Spring");
    model.put("name", "Fernando");
    model.put("lastname", "Garcia");

    return "details";
  };
}
