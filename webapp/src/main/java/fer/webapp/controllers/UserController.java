package fer.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fer.webapp.models.User;

@Controller
public class UserController {
  @GetMapping("/details")
  public String details(Model model) {
    User user = new User("Fernando", "Garcia");

    model.addAttribute("title", "Hola mundo Spring");
    model.addAttribute("user", user);

    return "details";
  }
}
