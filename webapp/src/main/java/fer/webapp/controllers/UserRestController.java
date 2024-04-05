package fer.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fer.webapp.models.User;
import fer.webapp.models.dto.UserDto;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/api")
public class UserRestController {
  @GetMapping("/details-map")
  public Map<String, Object> detailsMap() {
    User user = new User("Fernando", "Garcia");
    Map<String, Object> body = new HashMap<>();

    body.put("title", "Hola mundo Spring");
    body.put("user", user);

    return body;
  }

  @GetMapping(path = "/details-dto")
  public UserDto details() {
    UserDto userDto = new UserDto();
    User user = new User("Fernando", "García");

    userDto.setUser(user);
    userDto.setTitle("Hola mundo con Spring");

    return userDto;
  }
}