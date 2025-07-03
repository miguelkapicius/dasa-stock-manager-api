package br.com.estoque.dasa.modules.users.controller;

import br.com.estoque.dasa.modules.users.entity.User;
import br.com.estoque.dasa.modules.users.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> listAll() {
        return this.service.listAll();
    };

    @PostMapping
    public User create(@RequestBody User user) {
        return this.service.create(user);
    }
}
