package org.example.JWT.Practice1.controller;

import org.example.JWT.Practice1.model.User;
import org.example.JWT.Practice1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/public")
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUsers()
    {
        return userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal)
    {
        return principal.getName();
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }
}
