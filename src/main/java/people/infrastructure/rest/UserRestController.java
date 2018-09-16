package people.infrastructure.rest;

import people.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

  @GetMapping
  public String findUser() {
    User userOne = new User("Adrian");

    return userOne.toString();
  }

}
